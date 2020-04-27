package com.lec.java.regexp05;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* 대표적인 정규 표현식 
 *  구글링 하면 대표적인 정규표현식들이 많이 구할수 있습니다.
 *  각 정규표현식들을 작성해보고
 *	매칭되는 문자열과 그렇지 않은 것들을 출력해봅시다.   
 */
public class RegExp05Main {

	public static void main(String[] args) {
		System.out.println("많이 쓰는 정규표현식");

		String regex, intput, title;
		String [] arrInput;
		
		//─────────────────────────────────────────
		title = "URL";
		regex = "^(https?):\\/\\/([^:\\/\\s]+)(:([^\\/]*))?((\\/"
				+ "[^\\s/\\/]+)*)?\\/?"
				+ "([^#\\s\\?]*)(\\?([^#\\s]*)"
				+ ")?(#(\\w*))?$"; // TODO
		arrInput = new String[] {
			"http://www.daum.net",
			"http://www.google.com",
			"dafffjj"
		};
		System.out.println(title);
		regExpTest(regex, arrInput);

		
		//─────────────────────────────────────────
		title = "email";
		regex = "^[a-zA-Z0-9]+@[a-zA-Z0-9]+$";
				
		
		arrInput = new String[] {
			"iadfddfj@naver.com",
			"adfafnaver.com"
		};
		System.out.println(title);
		regExpTest(regex, arrInput);

		//─────────────────────────────────────────
		title = "주민등록번호";
		regex = "^(?:[0-9]{2}(?:0[1-9]|1[0-2])(?:0[1-9]|[1,2][0-9]|3[0,1]))-[1-4][0-9]{6}$"; // TODO
		arrInput = new String[] {
			"930203-1068312",
			"001225-43216"
		};
		System.out.println(title);
		regExpTest(regex, arrInput);
		
		//─────────────────────────────────────────
		title = "날짜 YYYY-MM-DD";
		regex = "^(19|20)\\d{2}-(0[1-9]|1[012])-(0[1-9]|[12][0-9]|3[0-1])$"; // TODO
		arrInput = new String[] {
			"2015-05-03",
			"20-05-03"
				
		};
		System.out.println(title);
		regExpTest(regex, arrInput);
		
		//─────────────────────────────────────────
		title = "자연수";
		regex = "$|^[0-9]$|^[1-9][0-9]*$"; // TODO
		arrInput = new String[] {
			"1234",
		    "-1"
		};
		System.out.println(title);
		regExpTest(regex, arrInput);

		//─────────────────────────────────────────
		title = "정수";
		regex = "^[0-9]*$"; // TODO
		arrInput = new String[] {
			"12345",
			"adfdaf"
				
		};
		System.out.println(title);
		regExpTest(regex, arrInput);

		//─────────────────────────────────────────
		title = "소수";
		regex = "^[+-]?\\d*(\\.?\\d*)$"; // TODO
		arrInput = new String[] {
			"32",
			"32.123",
			"32.23434"
		};
		System.out.println(title);
		regExpTest(regex, arrInput);

		//─────────────────────────────────────────
		title = "소숫점 둘째자리까지";
		regex = "$|^-$|^-?[0-9]([.]\\d{0,2})?$|^-?[1-9][0-9]*([.]\\d{0,2})?$"; // TODO
		arrInput = new String[] {
			"32.1",
			"32.22",
			"32.243"
		};
		System.out.println(title);
		regExpTest(regex, arrInput);

		//─────────────────────────────────────────
		title = "통화표시 (￦)";
		regex = ""; // TODO
		arrInput = new String[] {
			// TODO
		};
		System.out.println(title);
		regExpTest(regex, arrInput);

		System.out.println("프로그램 종료");

	} // end main()

	// 도우미 함수
	public static void regExpTest(String regex, String[] arrInput) {
		for (String input : arrInput)
			regExpTest(regex, input);
	}

	public static void regExpTest(String regex, String input) {
		System.out.println("[정규표현식 매칭 테스트]-----------------");
		System.out.println("정규표현식: " + regex);
		System.out.println("입력문자열: " + input);

		if(Pattern.matches(regex, input)) {
			System.out.println("   ●매칭●");
		} else {
			System.out.println("   Ⅹ매칭 없슴Ⅹ");
		}
		
		System.out.println();
	} // end regExpTest()

} // end class
