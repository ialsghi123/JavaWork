package parsepractice;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.Connection.Response;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class Practice {

	public static void main(String[] args) throws IOException {
		
		System.out.println("네이버 증권");
		
		String url;
		Response response;
		Elements elements;
		Document doc;
		
		url="https://finance.naver.com";
		
		doc=Jsoup.connect(url).execute().parse();
		
		elements=doc.select("#aside_area aside_popular");
		
		System.out.println(elements.size()+ "개");
		
		
	}

}


















