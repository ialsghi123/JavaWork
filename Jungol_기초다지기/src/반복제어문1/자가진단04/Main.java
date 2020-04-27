package 반복제어문1.자가진단04;

import java.util.Scanner;

/*
 * 정수를 계속 입력받다가 100 이상의 수가 입력이 되면 마지막 입력된 수를 포함하여 합계와 평균을 출력하는 프로그램을 작성하시오.
   (평균은 반올림하여 소수 첫째자리까지 출력한다.)
   
   
   입력 1 2 3 4 5 6 7 8 9 10 100  출력 155 
                                  14.1
 */

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int min=100,max=0;
		
		int[] input = new int[3];
		
		input[0]=sc.nextInt();
		input[1]=sc.nextInt();
		input[2]=sc.nextInt();
		
		
		for (int i = 0; i < 3; i++) {
			if(input[i]>max) {
				max=input[i];
				
			}
			else if(input[i]<min) {
				min=input[i];
				
			}
		}
		System.out.println("최댓값:"+max);
		System.out.println("최솟값:"+min);
		
		
			
			
			
		
			

	}
	
	
}
