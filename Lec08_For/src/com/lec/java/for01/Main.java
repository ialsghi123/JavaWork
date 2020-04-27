package com.lec.java.for01;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

	public static void main(String[] args) {
		String input;
		String regex;  // 정규표현식
		Pattern pat;
		Matcher matcher;
		
		regex="\\d\\d";
		pat = Pattern.compile(regex);
		
		input="09";
		matcher=pat.matcher(input);
		
		if(matcher.matches()) {
			System.out.println("매칭");
		}
		else
		{
			System.out.println("매칭X");
		}
	}

}
