package com.lec.java.collection08;

import java.util.HashSet;
import java.util.Scanner;

public class Collection08Main {

	public static void main(String[] args) {
		System.out.println("HashSet 연습");
		
		// MyClass 타입을 저장할 수 있는 HashSet 인스턴스 생성
		// 데이터 3개 이상 저장해보고 iterator, enahnce-for 등을 
		// 사용하여 출력해보기
		HashSet<MyClass> set = new HashSet<MyClass>();
		Scanner sc = new Scanner(System.in);
		// 데이터 3개 저장
		
		
		for(int i=0; i<3; i++)
		{
			System.out.println("id입력:");
		    int id=sc.nextInt();
			System.out.println("name입력:");
			String name=sc.nextLine();
		}
		
		
		
		// 검색: Iterator, enhanced for
		System.out.println();
		System.out.println("Iterator");
		// TODO
		
		System.out.println();
		System.out.println("enhanced for");
		// TODO			

		// forEach() 메소드 사용
		System.out.println();
		System.out.println("forEach() 사용");
		// TODO

		System.out.println("\n프로그램 종료");
	} // end main()
} // end class

