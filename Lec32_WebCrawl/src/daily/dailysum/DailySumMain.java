package daily.dailysum;

import java.io.IOException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Scanner;

import javax.sound.sampled.Port.Info;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.parser.Parser;
import org.jsoup.select.Elements;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/*
 * 연습 : 자치구단위 서울 생활인구 일별 집계표
 * ■자치구단위 서울 생활인구 일별 집계표
 * 	http://data.seoul.go.kr/dataList/datasetView.do?infId=OA-15379&srvType=S&serviceKind=1&currentPageNo=1
 * 	http://openapi.seoul.go.kr:8088/(인증키)/(요청파일타입)/SPOP_DAILYSUM_JACHI/(요청시작INDEX)/(요청종료INDEX)/(기준일ID)/(시군구코드)
 * 
 * 샘플url
 * 	XML 버젼
 * 	http://openapi.seoul.go.kr:8088/(인증키)/xml/SPOP_DAILYSUM_JACHI/1/5/
 * 		예] http://openapi.seoul.go.kr:8088/4d46796d7366726f3833774a774955/xml/SPOP_DAILYSUM_JACHI/1/5/
 * 		예] http://openapi.seoul.go.kr:8088/4d46796d7366726f3833774a774955/xml/SPOP_DAILYSUM_JACHI/1/5/20190101
 * 		예] http://openapi.seoul.go.kr:8088/4d46796d7366726f3833774a774955/xml/SPOP_DAILYSUM_JACHI/1/5/20190101/11000
 * 
 * 	JSON 버젼
 * 	http://openapi.seoul.go.kr:8088/(인증키)/json/SPOP_DAILYSUM_JACHI/1/5/
 * 		예] http://openapi.seoul.go.kr:8088/4d46796d7366726f3833774a774955/json/SPOP_DAILYSUM_JACHI/1/5/	
 * 		예] http://openapi.seoul.go.kr:8088/4d46796d7366726f3833774a774955/json/SPOP_DAILYSUM_JACHI/1/5/20190101
 * 		예] http://openapi.seoul.go.kr:8088/4d46796d7366726f3833774a774955/json/SPOP_DAILYSUM_JACHI/1/5/20190101/11000
 * 
 * ※ 한번에 1000개 까지의 데이터만 볼수 있슴
 * 
 */

/*  입력예]
 *  날짜입력: 20190101
 *  시작Index : 1
 *  끝Index: 5
 *  
 *  [XML]
 *  날짜             구ID        총생활인구수           일최대이동인구수
 *  ----------------------------------------------------------------------
 *  20190101	11000    11121182.98210      4764635.18080 
 *  20190101    11110    274919.65940        177877.95000 
 *  20190101    11140    267096.65940        149729.45840 
 *  20190101    11170    315220.18480        149329.14120 
 *  20190101    11200    351993.77950        153738.94490
 *   
 *  [JSON]
 *  날짜             구ID        총생활인구수           일최대이동인구수
 *  ----------------------------------------------------------------------
 *  20190101	11000    11121182.98210      4764635.18080 
 *  20190101    11110    274919.65940        177877.95000 
 *  20190101    11140    267096.65940        149729.45840 
 *  20190101    11170    315220.18480        149329.14120 
 *  20190101    11200    351993.77950        153738.94490 
 * 
 */

// ★ 주목 ★
// XML 은 Jsoup 를 활용하여 파싱하세요
// JSON 은  jackson 을 활용하여 파싱하세요

public class DailySumMain {

	public static final String REQ_SERVICE = "SPOP_DAILYSUM_JACHI";
	public static final String API_KEY = "584a746b5369616c38314978427758";

	public static void main(String[] args) throws IOException {

		System.out.println("자치구 단위 서울 생활인구 일별 집계표");

		Scanner sc = new Scanner(System.in);
		String date;
		int startIndex;
		int endIndex;

		System.out.print("날짜입력:");
		date = sc.nextLine();
		System.out.print("시작Index:");
		startIndex = sc.nextInt();
		System.out.print("끝Index:");
		endIndex = sc.nextInt();

		String url = buildUrlAddress("xml", startIndex,endIndex,date);

		Document doc = Jsoup.connect(url).parser(Parser.xmlParser()).get();
		Elements elements = doc.select("row");

		for (Element e : elements) {
			String STDR_DE_ID = e.selectFirst("STDR_DE_ID").text().trim();
			String SIGNGU_CODE_SE = e.selectFirst("SIGNGU_CODE_SE").text().trim();
			String TOT_LVPOP_CO = e.selectFirst("TOT_LVPOP_CO").text().trim();
			String DAIL_MXMM_MVMN_LVPOP_CO = e.selectFirst("DAIL_MXMM_MVMN_LVPOP_CO").text().trim();
			System.out.printf("%s        %s       %s       %s\n", STDR_DE_ID, SIGNGU_CODE_SE, TOT_LVPOP_CO,
					DAIL_MXMM_MVMN_LVPOP_CO);
		}
		
		
		
		
		
	} // end main

	public static String buildUrlAddress(String reqType, int startIndex, int endIndex, String date) throws IOException {

		String url_address = String.format("http://openapi.seoul.go.kr:8088/%s/xml/SPOP_DAILYSUM_JACHI/%d/%d/%s",
				API_KEY, startIndex, endIndex,date);

		return url_address;

	}// end buildUrlAddress()
	
	
} // end class

@JsonIgnoreProperties(ignoreUnknown = true)
class Population{
	private ArrayList<Info> PopulationList;
	
	public ArrayList<Info> getPopulatList() {
		return PopulationList;
	}
	
	public Population() {}

	public ArrayList<Info> getPopulationList() {
		return PopulationList;
	}

	public void setPopulationList(ArrayList<Info> populationList) {
		PopulationList = populationList;
	}
	
	
}

@JsonIgnoreProperties(ignoreUnknown = true)

class info{
	private String STDR_DE_ID;
	private String SIGNGU_CODE_SE;
	private String TOT_LVPOP_COD;
	private String DAIL_MXMM_MVMN_LVPOP_CO;
	
	public info() {}

	public info(String sTDR_DE_ID, String sIGNGU_CODE_SE, String tOT_LVPOP_COD, String dAIL_MXMM_MVMN_LVPOP_CO) {
		super();
		STDR_DE_ID = sTDR_DE_ID;
		SIGNGU_CODE_SE = sIGNGU_CODE_SE;
		TOT_LVPOP_COD = tOT_LVPOP_COD;
		DAIL_MXMM_MVMN_LVPOP_CO = dAIL_MXMM_MVMN_LVPOP_CO;
	}

	public String getSTDR_DE_ID() {
		return STDR_DE_ID;
	}

	public void setSTDR_DE_ID(String sTDR_DE_ID) {
		STDR_DE_ID = sTDR_DE_ID;
	}

	public String getSIGNGU_CODE_SE() {
		return SIGNGU_CODE_SE;
	}

	public void setSIGNGU_CODE_SE(String sIGNGU_CODE_SE) {
		SIGNGU_CODE_SE = sIGNGU_CODE_SE;
	}

	public String getTOT_LVPOP_COD() {
		return TOT_LVPOP_COD;
	}

	public void setTOT_LVPOP_COD(String tOT_LVPOP_COD) {
		TOT_LVPOP_COD = tOT_LVPOP_COD;
	}

	public String getDAIL_MXMM_MVMN_LVPOP_CO() {
		return DAIL_MXMM_MVMN_LVPOP_CO;
	}

	public void setDAIL_MXMM_MVMN_LVPOP_CO(String dAIL_MXMM_MVMN_LVPOP_CO) {
		DAIL_MXMM_MVMN_LVPOP_CO = dAIL_MXMM_MVMN_LVPOP_CO;
	}
	
	
}







