package com.lec.java.method06;

/* Method Overloading (메소드 중복 정의)
	 같은 이름으로 메소드를 매개변수 리스트를 달리하여 중복 정의, 
	 즉, 이름이 같아도 메소드 signature 가 다르면 중복정의 가능.
	
  Method Signature 란
	   메소드 이름 + 매개변수 리스트 (parameter list)
	
	 1. 매개변수의 개수가 다르거나
	 2. 매개변수의 자료형이 다르거나
	 3. 매개변수의 순서가 다를 때
	 위 3개를 '매개변수 리스트' 라 한다
	
    메소드의 리턴 타입만 다른 경우는 중복 정의할 수 없다!!

     메소드 오버로딩의 장점:
	동일한 동작을 하는 메소드에 대해 매개변수만 달리하여 중복정의 하면
	이 메소드를 사용하는 입장에선 여러타입의 이름을 익힐 필요가 없다. 
	

 */

public class Method06Main {

	public static void main(String[] args) {
		System.out.println("Method Overloading (메소드 중복 정의)");
		
		
		
		naruto("나루토");
		naruto(16);
		naruto("라면먹기","호카게");
		
		
		
	
	} // end main()
	
	public static void naruto(String name) {
		
		System.out.println("내 이름은 "+name);
		
	}
	
    public static void naruto(int age) {
		
    	System.out.println("나이는 "+age+"이다");
    	
	}
    public static void naruto(String habit,String skills) {
		
    	System.out.println("취미는 "+habit+"이고, 목표는 "+skills+"이다");
	}
    
	
} // end class









