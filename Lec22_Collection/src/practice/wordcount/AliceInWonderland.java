package practice.wordcount;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.StringTokenizer;

/* 1] 문서(문자열) 안의 단어의 빈도수를 계수해서 출력하기
 * 	- 대소문자 구분하지 않기 :   The 와 the 는 같은 단어
 *  - 2글자 이상만 계수하기
 *  - 구두점/기호 ",.\"\'`!?;:-()" 잘라내기
 *  - 공백 짤라내기
 * ex)
 * 	an : 234
 * 	the : 314
 * ...
 * 
 * hint]
 * 	split("\\s+")  --> String[]   
 * 	--> StringTokenizer  (혹은 정규표현식)
 *  	  --> HashMap<String, Integer>   <단어, 빈도수>  사용
 * ───────────────────────────────────────────────────────────    
 * 2] 빈도수 내림차순으로 정렬하여 출력하기
 * 	ex)
 *	1 the:113개
 *	2 she:95개
 *	3 to:85개
 *	...   
 *
 * hint]
 * 	Comparable<> 이나 Comparator<> 적용
 */

// TODO : 필요한 객체들 작성
// hint> 빈도수 담을 객체, Comparator<> ..

public class AliceInWonderland {

	public static void main(String[] args) {		
		System.out.println("실습: 단어 발생 빈도");
		HashMap<String, Integer> hmap = new HashMap<String, Integer>();
		     // 어떤 문자열이 얼만큼 나왔나//
		        //=String      =Integer
		String [] words = C.ALICE30.trim().toLowerCase().split("\\s+");

		// 발생빈도 작성
		// TODO ex)the 113
//		           she 92
		
		
		
		
		
		for(String e:words) {
			StringTokenizer tokenizer = new StringTokenizer(e,",.\\\"\\'`!?;:-()'");
			
		}
		
		for(int i=0; i<words.length; i++) {
			Integer v=hmap.get(Arrays.toString(words));
			if(v==null)
			{
				hmap.put(words[i],1);
			}
			else
			{
				hmap.put(words[i],v+1);
			}
			
		}
		
		
		for(Map.Entry<String, Integer>s:hmap.entrySet()){
			System.out.println(s.getKey()+":"+s.getValue()+"개");
		}
		
		
		// 결과 출력
		// TODO
		
		System.out.println("\n프로그램 종료");
	} // end main()

} // end class




