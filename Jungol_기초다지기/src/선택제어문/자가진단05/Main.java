package 선택제어문.자가진단05;

import java.util.Scanner;

// 두 개의 실수를 입력받아 모두 4.0 이상이면 "A", 모두 3.0 이상이면 "B", 아니면 "C" 라고 출력하는 프로그램을 작성하시오.
// 입력 4.3 3.5   출력 B

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double a,b;
		a=sc.nextDouble();
		b=sc.nextDouble();
		
		if(a>=4.0 && b>=4.0)
		{
			System.out.println("A");
		}
		else if(a>=3.0 && b>=3.0)
		{
			System.out.println("B");
		}
		else
		{
			System.out.println("C");
		}

	}

}
