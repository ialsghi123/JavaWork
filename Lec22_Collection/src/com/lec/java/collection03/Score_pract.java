package com.lec.java.collection03;

public class Score_pract {
	private int korean;
	private int english;
	private int math;
	
	public Score_pract() {
		
	}
	

	public Score_pract(int korean, int english, int math) {
		super();
		this.korean = korean;
		this.english = english;
		this.math = math;
	}


	public int getKorean() {
		return korean;
	}

	public void setKorean(int korean) {
		this.korean = korean;
	}

	public int getEnglish() {
		return english;
	}

	public void setEnglish(int english) {
		this.english = english;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}
	
	
}
