package 배열1.자가진단09;


/*
 * 95 100 88 65 76 89 58 93 77 99   출력 100 99 95 93 89 88 77 76 65 58
 */
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		int temp=0;
		int[] arr = new int[10];
		
		for(int i=0; i<10; i++)
		{
			System.out.println("배열값은:");
			arr[i]=sc.nextInt();
			
			if(arr[i]<arr[i+1])
			{
				temp=arr[i];
				arr[i]=arr[i+1];
				arr[i+1]=temp;
						
			}
			
			
		}
		

	}

}
