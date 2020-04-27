package 반복제어문3.형성평가03;

import java.util.Scanner;

/*

*
**
***
**
*

입력 3 n=3 총 5 n= 5 총 7
*/

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n =sc.nextInt();
		
		for(int i=0; i<n; i++)
		{
			for(int j=0; j<=i; j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=1; i<=n-1;i++)
		{
			for(int j=n-i; j>0; j--)
			{
				System.out.print("*");
				
			}
			System.out.println();
		}
		
				
		

	}

}
