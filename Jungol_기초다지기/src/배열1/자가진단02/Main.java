package 배열1.자가진단02;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] array = new int[10];
		
		for(int i=0; i<10; i++)
		{
			array[i]=sc.nextInt();
			System.out.print(array[i]+" ");
		}

	}

}
