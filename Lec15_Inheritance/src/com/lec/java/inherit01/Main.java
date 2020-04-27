package com.lec.java.inherit01;

import java.util.HashMap;

/*
간단한 가위, 바위, 보 게임을 만듭니다.
(실행화면은 다음 페이지에)

showMenu / inputChoice / displayChoice
/ computeResult  메소드들을 어떻게 
구현해볼수 있을까요? 


main() 메소드는 오른쪽과 같이 구성하고
변경하지 않는 상태에서
나머지 메소드들을 구현하여 완성해보세요

필요하다면 클래스의 멤버변수등을 추가해도
좋습니다
*/

public class Main {

	public static void main(String[] args) {
		
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "사람");
		map.put(2, "야구");
		System.out.println(map.get(2));
	
		

	}//end main
	
	
	

}//end class
