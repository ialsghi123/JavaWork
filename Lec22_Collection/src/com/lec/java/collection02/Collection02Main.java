package com.lec.java.collection02;

import java.util.ArrayList;
import java.util.Iterator;

public class Collection02Main {

	public static void main(String[] args) {
		System.out.println("ArrayList 연습");
		
		ArrayList<String> list=new ArrayList<String>();
		
		list.add("사과");
		list.add("배");
		list.add("포도");
		list.add("딸기");
		list.add("참외");
		
		System.out.println("size():"+list.size());
		for(int i=0; i<list.size(); i++)
		{
			System.out.println(list.get(i));
		}
		
		
		System.out.println();
		list.remove(2);
		System.out.println("삭제후");
		for(int i=0; i<list.size(); i++)
		{
			System.out.println(list.get(i));
		}
		
		
		System.out.println();
		list.set(3, "수박");
		System.out.println("수정후");
		for(int i=0; i<list.size(); i++)
		{
			System.out.println(list.get(i));
		}
		
		
		System.out.println();
		System.out.println("Enhanced for를 사용한 출력");
		
		for(String e:list) {
			System.out.println(e);
		}
		
		System.out.println();
		System.out.println("Iterator를 사용한 출력");
		
		Iterator<String> str=list.iterator();
		while(str.hasNext()) {
			System.out.println(str.next());
		}
		
		
		
		// String 타입을 담는 ArrayList를 만들고
		// 5개 이상의 String을 저장하고
		// set(), remove() 등의 메소드 사용하여
		// 임의의 것을 수정, 삭제 도 해보시고
		// 3가지 방식으로 출력해보세요
		//  for, Enhanced-for, Iterator


		
		
		System.out.println("\n프로그램 종료");
	} // end main()

} // end class












