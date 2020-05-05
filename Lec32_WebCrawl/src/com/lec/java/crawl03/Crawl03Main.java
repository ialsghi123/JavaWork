package com.lec.java.crawl03;

import org.jsoup.Jsoup;

import java.io.IOException;

import org.jsoup.Connection.Response;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class Crawl03Main {

	public static void main(String[] args) throws IOException {
		System.out.println("Daum 실시간 검색어");
		
		//http://www.daum.net
		//15
		String url;
		Response response;
		Elements elements;
		Document doc; // DOM
		
		url="https://media.daum.net/entertain/ranking/popular/";
		
		doc = Jsoup.connect(url).execute().parse();
		
		elements=doc.select("#cMain > div:nth-child(1) > div:nth-child(2) > ol.list_ranking > li");
		
		for(Element e : elements) {
			
			System.out.println(e.text().trim());
		}
		
		System.out.println("\n프로그램 종료");

	}

}
