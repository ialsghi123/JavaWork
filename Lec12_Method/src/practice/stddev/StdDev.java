package practice.stddev;

import java.util.Random;

public class StdDev {

	public static void main(String[] args) {

		Random rand = new Random();
		int[] arr = new int[5];
	 
		
		
		
		
		for (int i = 0; i < arr.length; i++) {
			
			
			arr[i]= rand.nextInt(100)+1;
			
			System.out.print(arr[i]+" ");
			
			
			
		}
		System.out.println();
		
		double avg = calcAvg(arr);
		System.out.println("평균:"+avg);
		System.out.println();
		
		
		double Var = calcVariance(arr);
		System.out.println("분산:"+Var);
		
		
		System.out.println();
		double Std = calcStdDev(arr);
		System.out.println("표준편차:"+Std);
		
		// 임의정수 5개로 초기화한 정수로
		// 평균, 분산, 표준편차 구하기

	} // end main
	
	/**
	 * 메소드 이름 : calcAvg
	 * 매개변수 : int []
	 * 리턴값 : double
	 * 
	 * 주어진 배열의 '평균값' 리턴
	 */
	
	
	
	public static double calcAvg(int[] arr) {
		
		double avg=0;
		double sum=0;
		
		for (int i = 0; i < arr.length; i++) {
			
					
			sum+=arr[i];
			
		}
		avg=sum/arr.length;
		return avg;
		
			
	}
	
	
	/**
	 * 메소드 이름 : calcVariance
	 * 매개변수 : int []
	 * 리턴값 : double
	 * 
	 * 주어진 배열의 '분산값' 리턴
	 */
	public static double calcVariance(int[] arr) {
		
		
		double var; 
		double t = 0;
		
		for (int i = 0; i < arr.length; i++) {
			
			 t += ((arr[i] - calcAvg(arr)) * (arr[i] - calcAvg(arr)));
			 
		}
		var = t/arr.length;
		
		return var;
		
	}
	
	/**
	 * 메소드 이름 : calcStdDev
	 * 매개변수 : int []
	 * 리턴값 : double
	 * 
	 * 주어진 배열의 '표준편차' 리턴
	 */
	public static double calcStdDev(int[] arr)
	{
		double var = 0;
		double std;
		std=Math.sqrt(calcVariance(arr));
		
		return std;
	}

} // end class
