package com.lec.java.method01;

import java.util.Scanner;

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
		
		Scanner sc= new Scanner(System.in);


	
	}
	// method name: showMenu
		// return: void
		// arguments: none
		// 기능: 유저가 가위/바위/보 선택할 수 있는 메뉴 출력
	
	public static void showMenu()
	{
		System.out.println("-----------------------");
		System.out.println("[1] 가위");
		System.out.println("[2] 바위");
		System.out.println("[3] 보");
		System.out.println("[0] 종료");
		System.out.println("-----------------------");
		System.out.println("선택");
	}
	
	

	// method name: inputChoice
	// return: int (유저의 가위(0)/바위(1)/보(2) 선택 내용)
	// arguments: Scanner sc (입력장치)
	
	public static int inputChoice(Scanner sc) {
		
		int input=0;
		while(true) {
			
			input=sc.nextInt();
			if(input>=0 && input<=3)
			{
				return input;
			}
			System.out.println("다시 입력하세요");
		}
	}
	
	
	// method name: displayChoice
		// return: void
		// arguments:
		//   1) int user: 유저의 선택(가위(0)/바위(1)/보(2))
		//   2) int com: 컴퓨터의 선택(가위(0)/바위(1)/보(2))
	
	public static void displayChoice(int user,int com)
	{
		System.out.println("사용자 vs 컴퓨터");
		String users=null;
		
		switch(user) {
		case 1:
			users="가위";
			break;
		case 2:
			users="바위";
			break;
		case 3:
			users="보";
			break;
		}
		
		String coms=null;
		switch(com)
		{
		case 1:
			coms="가위";
			break;
		case 2:
			coms="바위";
			break;
		case 3:
			coms="보";
			break;
			
		}
		System.out.println(users +"vs"+ coms);
		
		
	}
	
	
	
	// method name: getHandType
		// return: String ("가위"/"바위"/"보")
		// arguments: int choice(0, 1, 2)
	
	
	// method name: computeResult
		// return: void
		// arguments:
		//   1) int user: 유저의 선택(가위(0)/바위(1)/보(2))
		//   2) int com: 컴퓨터의 선택(가위(0)/바위(1)/보(2))
	
	public static void computerResult(int user,int com) {
		
	}
	
	
}



