package practice.game369;

import java.util.Scanner;

/*369게임
1~100 까지의 자연수를 나열하되,
10개 단위로 줄바꿈을 하고
숫자에 3,6,9 중 하나라도 있으면 * 표시를 하기

369 게임
1	2	*	4	5	*	7	8	*	10	
11	12	*	14	15	*	17	18	*	20	
21	22	*	24	25	*	27	28	*	*	
*	*	*	*	*	*	*	*	*	40	
41	42	*	44	45	*	47	48	*	50	
51	52	*	54	55	*	57	58	*	*	
*	*	*	*	*	*	*	*	*	70	
71	72	*	74	75	*	77	78	*	80	
81	82	*	84	85	*	87	88	*	*	
*	*	*	*	*	*	*	*	*	100	

*/

public class Game369 {
	public static void main(String[] args) {
		
		
		
		
		
		for(int i=1; i<=100; i++)
		{
			if(i%10==3 || i%10==6 || i%10==9 ||i/10==3 || i/10==6 || i/10==9)
			{
				System.out.printf("* ");
			}
			else
			{
				System.out.printf(i+" ");
			}
			
			if(i%10==0)
			{
				System.out.println();
			}
			
			
		}
		System.out.println();
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
