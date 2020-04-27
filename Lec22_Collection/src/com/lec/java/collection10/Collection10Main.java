package com.lec.java.collection10;

import java.util.Iterator;
import java.util.TreeSet;

public class Collection10Main {

	public static void main(String[] args) {
		System.out.println("TreeSet 연습");
		
		// String 타입을 저장할 수 있는 TreeSet 인스턴스 생성
		// 5개 이상의 데이터를 저장해보고
		// 오름차순, 내림차순으로 출력해보기
		// TODO
		
		TreeSet<String> tset=new TreeSet<String>();
		
		tset.add("a");
		tset.add("c");
		tset.add("z");
		tset.add("f");
		tset.add("d");
		tset.add("q");
		tset.add("r");
		
		System.out.println("오름차순");
		Iterator<String> str=tset.iterator();
		while(str.hasNext()) {
			System.out.println(str.next());
		}
		
		System.out.println();
		System.out.println("내림차순");
		Iterator<String> str2=tset.descendingIterator();
		while(str2.hasNext()) {
			System.out.println(str2.next());
		}
		
		System.out.println();
		for(String e:tset) {
			System.out.println(e);
		}
		
		System.out.println();
		
		
		
		
		System.out.println("\n프로그램 종료");
	} // end main

} // end class

















