package com.lec.java.lambda03;

public class Main {

	public static void main(String[] args) {
		Operable Squared =(x,y)->Math.pow(x,y);
		System.out.println("Squared="+Squared.operate(3, 4));
		
		

	}

}
