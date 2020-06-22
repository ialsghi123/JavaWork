package com.lec.spring.aop02;

import com.lec.beans.Service;

public class MyService21 extends Service {

	@Override
	public void doAction() {
		// TODO Auto-generated method stub
		printInfo();  // 핵심기능

	}
	
	public void sa() {
		System.out.println("sa");
	}

}
