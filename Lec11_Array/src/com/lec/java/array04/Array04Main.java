package com.lec.java.array04;

import java.util.Scanner;

/* 연습
 * 길이 5개 int 형 배열을 선언하고
 * 사용자로부터 5개 정수를 입력받아 초기화 한뒤 
 * 
 * 총점, 평균, 최대값, 최소값  출력해보기
 */
public class Array04Main {

	public static void main(String[] args) {
		System.out.println("배열 연습");
		
		Scanner sc = new Scanner(System.in);
		
		
		int[] array = new int[5];
		int sum=0,avg=0,max=array[0],min=array[0];
		
		for (int i = 0; i < array.length; i++) {
			System.out.println("점수입력:");
			array[i]=sc.nextInt();
			sum+=array[i];
			
			
		}
		System.out.println("총점:"+sum);
		System.out.println("평균:"+sum/array.length);
		
		for (int i = 0; i < array.length; i++) {
			if(array[i]>max)
			{
				max=array[i];
			}
		}
		for (int i = 1; i < array.length; i++) {
			if(array[i]<min)
			{
				min=array[i];
			}
		}
		System.out.println("최소값:"+ min);
		
		
		
		
		
		
		
	} // end main()

} // end class Array04Main




/*int[] arr = new int[5];

int total=0,avg=0,max=arr[0],min=arr[1];



for (int i = 0; i < arr.length; i++) {
	
	System.out.println("점수입력:");
	arr[i]=sc.nextInt();
	total+=arr[i];
	
}
System.out.println("총점:"+total);
System.out.println("평균:"+total/arr.length);

for (int i = 0; i < arr.length; i++) {
	if(arr[i]>max)
	{
		max=arr[i];
	}
}
System.out.println("최댓값="+max);

for (int i = 1; i < arr.length; i++) {
	
	min=(arr[i]<min) ?arr[i] :min;
	
}
System.out.println("최소값="+min);

*/


