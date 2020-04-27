package com.lec.java.class02;

public class Rectangle {
	
	//속성:멤버변수
	//가로,세로
	double width;
	double height;
	
	
	//생성자
	public Rectangle() {
		System.out.println("Rectangle() 생성자 호출");
		width=100; //디폴트 값 지정 가능
		height=100;
		System.out.println("가로:"+width);
		System.out.println("세로:"+height);
	}
	
	public Rectangle(double w,double h) {
		System.out.println("Rectangle(w,h) 생성");
		width= w; //멤버변수 초기화 
		height= h;
		System.out.println("가로:"+width);
		System.out.println("세로:"+height);
	}
	
	
	
	
	//동적:멤버 메소드
	//사각형의 둘레 계산
	
	public double calcPerimeter(){
		return (width+height)*2;
	}
	
	
	
	
	//사각형의 넓이 계산
	public double calcArea() {
		return width*height;
	}

}
