package com.lec.java.class06;

public class Practice_Main {

	public static void main(String[] args) {
		
		Practice_Score main=new Practice_Score();
		main.dispalyInfo();
		
		System.out.println();
		Practice_Score main1=new Practice_Score("ㅇㅇㅇ",34,34,63);
		main1.dispalyInfo();
		
		int total=main1.calcTotal();
		System.out.println(total);
		

	}

}
