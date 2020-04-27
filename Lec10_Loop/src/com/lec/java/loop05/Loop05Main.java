package com.lec.java.loop05;

public class Loop05Main {

	public static void main(String[] args) {
		System.out.println("순환문 연습 - 언제 100을 넘나?");
		// 1 + (-2) + 3 + (-4) + ...+ (n) >= 100 ?
		// 언제(n) 합이 100을 넘나?  그 합은?
		
		int i,j,sum1=0;
		
		for(i=1; i<sum1; i++)
		
		{
			for(j=1; j<sum1; j++)
			{
				
			}
			
		}
		
		
		System.out.println();
		System.out.println("순환문 연습 - 두 주사위 눈의 합");
		// 두 주사위 눈의 합 = 6
		// (1, 5), (2, 4), (3, 3), (4, 2), (5, 1)
		// x + y = 6를 만족하는 x, y 쌍을 찾으면 됨.
		
		int sum=0;
		
		for(i=1; i<=6; i++)
		{
			for(j=1; j<=6; j++)
			{
				if(i+j==6)
				{
					System.out.println(i+","+j);
				}
				
			}
			
		}
		
		

		System.out.println("\n프로그램 종료");
	} // end main()

} // end class
















