package com.lec.java.method05;

/*
 * 메소드 연습
 * 
 * 숫자값을 입력 받아서 
 * 위 값을 한변의 길이로 한 정사각형의 넓이를 구하고
 * 위 값을 반지름으로 한 원의 넓이를 구하기
 * 
 * public static double calcRectArea(double length)
 * public static double calcCircleArea(double r)
 * 
 */

public class Method05Main {

	public static void main(String[] args) {
		System.out.println("메소드 연습");
		
		calRectArea(15.1);
		
		System.out.println("\n프로그램 종료");
	} // end main()
	
	
	// method name: calcRectArea
	// return: double (정사각형의 넓이)
	// arguments: double length (정사각형의 한 변의 길이)
	public static double calRectArea(double length)
	{
		double leng = 0;
		double result;
		result=leng*leng;
		System.out.println("정사각형 넓이:"+result);
		
		return result;
		
	}
	
	
	// method name: calcCircleArea
	// return: double (원의 넓이)
	// arguments: double r (원의 반지름)
	// TODO

} // end class









