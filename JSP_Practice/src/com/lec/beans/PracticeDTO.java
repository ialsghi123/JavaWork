package com.lec.beans;

public class PracticeDTO {
	private int uid;
	private String subject;
	private String name;
	private String content;
	private int viewCnt;
	private int recommend;
	private String regDate;
	
	public PracticeDTO() {
		super();
		System.out.println("PracticeDTO() 객체 생성");
	}

	public PracticeDTO(int uid, String subject, String name, String content, int viewCnt,int recommend) {
		super();
		this.uid = uid;
		this.subject = subject;
		this.name = name;
		this.content = content;
		this.viewCnt = viewCnt;
		this.recommend = recommend;
		System.out.println("PracticeDTO(uid, subject, content, name, viewCnt,recommend) 객체 생성");

	}


	public int getUid() {
		System.out.println("getUid() 호출");
		return uid;
	}

	public void setUid(int uid) {
		System.out.println("setUid(" + uid + ") 호출");
		this.uid = uid;
	}

	public String getSubject() {
		System.out.println("getSubject() 호출");
		return subject;
	}

	public void setSubject(String subject) {
		System.out.println("setSubject(" + subject + ") 호출");
		this.subject = subject;
	}

	public String getContent() {
		System.out.println("getContent() 호출");
		return content;
	}

	public void setContent(String content) {
		System.out.println("setContent("+ content +")");
		this.content = content;
	}

	public String getName() {
		System.out.println("getName() 호출");
		return name;
	}

	public void setName(String name) {
		System.out.println("setName(" + name + ")");
		this.name = name;
	}

	public int getViewCnt() {
		System.out.println("getViewCnt() 호출");
		return viewCnt;
	}

	public void setViewCnt(int viewCnt) {
		System.out.println("setViewCnt(" + viewCnt + ")");
		this.viewCnt = viewCnt;
	}

	public String getRegDate() {
		System.out.println("getRegDate() 호출");
		return regDate;
	}

	public void setRegDate(String regDate) {
		System.out.println("setRegDate(" + regDate + ")");
		this.regDate = regDate;
	}
	
	public int getRecommend() {
		System.out.println("getRecommend() 호출");
		return recommend;
	}
	
	public void setRecommend(int recommend) {
		System.out.println("setRecommend(" + recommend + ")");
		this.recommend = recommend;
	}
	
	@Override
	public String toString() {
		
		return "WriteDTO] " + uid + " : " + subject + " : " + content  + " : " + name + " : " 
				+ viewCnt + " : " + regDate + " : " + recommend;
	}

	

}
