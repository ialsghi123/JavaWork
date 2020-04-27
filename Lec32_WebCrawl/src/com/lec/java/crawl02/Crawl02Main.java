package com.lec.java.crawl02;

import java.io.IOException;

import org.jsoup.Connection.Response;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class Crawl02Main {

	public static void main(String[] args) throws IOException {
		System.out.println("네이트 인기 검색어");
		
		//www.nate.com
		
		String url;
		Response response;
		Document doc;
		Element element;
		
		url="https://www.nate.com";
		response=Jsoup.connect(url).execute();
		
		System.out.println(response.statusCode());
		System.out.println(response.statusMessage());
		
		doc=response.parse();
		
		String outerHtml=doc.outerHtml();
		System.out.println(outerHtml.substring(0,200));
		
		System.out.println("네이트 실시간 검색어");
		
		
		
		
	
		
		
		
		

		System.out.println("\n프로그램 종료");
	}

}
