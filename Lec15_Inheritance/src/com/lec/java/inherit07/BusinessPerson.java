package com.lec.java.inherit07;

public class BusinessPerson extends Person {
	
	private String company;
	
	

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	//메소드 재정의(Overriding)
	@Override //annotation:애노테이션.
	public void showInfo() {
		super.showInfo();
		System.out.println("회사:"+company);
	}
	
	
	//메소드 오버로딩(Overloading)
	public void showInfo(int id) {
		System.out.println("id:"+id);
		showInfo();
		
	
	}

	//오버라이딩 단축키 --> 알트+시프트+S,V
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "BusinessPerson:"+getName()+""+company;
		
//	
//	} final 메소드 오버라이딩 불가
//	@Override
//	public void whoAreYou() {
//		// TODO Auto-generated method stub
//		super.whoAreYou();
//	}
//	
	
	
	
	
	}	
}		

