package 배열1.자가진단01;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		char[] arr = new char[10];
		Scanner sc= new Scanner(System.in);
		
		
		
		for(int i=0; i<10; i++)
		{
			arr[i]=sc.next().charAt(0);
			System.out.print(arr[i]);
			
		}


	}

}
