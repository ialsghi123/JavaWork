package com.lec.java.switch05;

public class Switch05Main {

	// enum 타입 정의하는 방법:
	// enum 이름 {}
	// enum 타입 정의 메소드 안에서는 할 수 없다.
	
	//Days 라는 enum 타입 선언
	enum Days {SUN,MON,TUE,WED,THU,FRI,SAT}

	public static void main(String[] args) {
		System.out.println("enum 타입을 switch에서 사용하기");
		
		Days day1 = Days.SAT;
		System.out.println(day1);
		Days day2=Days.MON;
		System.out.println(day2);
		
		switch(day1)
		{
		case SUN:
			System.out.println("일요일");
			break;
		case MON:
			System.out.println("월요일");
			break;
		case TUE:
			System.out.println("화요일");
			break;
		case WED:
			System.out.println("수요일");
			break;
		case THU:
			System.out.println("목요일");
			break;
		case FRI:
			System.out.println("금요일");
			break;
		case SAT:
			System.out.println("토요일");
			break;	
		}
		
		System.out.println("\n프로그램 종료");
	} // end main()

} // end class










