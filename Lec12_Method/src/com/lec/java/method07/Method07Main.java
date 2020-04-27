package com.lec.java.method07;

import java.util.Random;

/* Math 클래스의 메소드
 */
public class Method07Main {

	public static void main(String[] args) {
		System.out.println("Math 객체의 메소드");

		// Math.random() : 0.0 <=  r < 1.0 사이의 난수 발생(double)
		double r;
		for(int i=0; i<5; i++)
		{
			r=Math.random();
			System.out.println(r);
		}
		System.out.println();
		
		System.out.println(Math.floor(3.5));
		System.out.println(Math.ceil(3.5));
		System.out.println(Math.round(3.4));
		
		System.out.println(Math.floor(-2.4)); 
		System.out.println(Math.ceil(-5.6)); 
		System.out.println(Math.round(-4.7)); 
		
		System.out.println();
		
		System.out.println("1,2,3범위를 난수 발생시키기");
		for(int i=0; i<5; i++)
		{
			double num;
			num=Math.random();
			
			num=num*3;
			num+=1;
			System.out.println((int)num);
		}
		
		System.out.println();
		
		for(int i=0; i<6; i++)
		{
			double random;
			
			System.out.print((int)(Math.random()*45+1)+" ");
		}
		
		
		System.out.println();
		
		System.out.println("Random객체 사용하여 난수 출력");
		Random num = new Random();
		for(int i=0; i<5; i++)
		{
			System.out.print(num.nextInt(3)+ ",");
		}
		System.out.println();
	
		
		
		
		
		
		
		
		
		
		System.out.println("\n프로그램 종료");
	} // end main()
	
	// TODO

} // end class









