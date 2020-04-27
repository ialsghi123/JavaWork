package practice.maxwords;

import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;
/* MaxWrod
	여러문장으로 구성된 문자열을 입력받은뒤 
	문자열에서 가장 단어의 개수가 많은 문장을 찾아서, 
	그 문장과 문장의 단어의 개수를 출력
	'문장'의 구분은  .(마침표) !(느낌표) ?(물음표) 로 한다.
	'단어'구분은 '공백' 으로 한다
	
	입력예]
	We test coders. Give us a try. Can you make it out? It's awesome.
	
	출력예]
	5개
	Can you make it out
 */
public class MaxWord {
	
	// TODO : 필요한 메소드 있으면 추가 작성
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String input=sc.nextLine(); //문자열 입력 받기
		
		
		
		StringTokenizer tokenizer = new StringTokenizer(input,".!?"); // 문장 구분
		System.out.println("토큰개수:"+tokenizer.countTokens());
		while(tokenizer.hasMoreTokens())
		{
			String s=tokenizer.nextToken().trim();
			
			
		}
		System.out.println(tokenizer.nextToken());
		System.out.println();
		
		String[] str=input.split("\\s");
	    System.out.println(Arrays.toString(str));
		
		System.out.println();
		
		
		
		
		sc.close();
	} // end main
} // end class
