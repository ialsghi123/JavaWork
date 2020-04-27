package com.lec.java.collection03;

public class Student_pract {
	String id;
	String name;
	Score score;
	
	public void Student_pract() {}

	public Student_pract(String id, String name, Score score) {
		super();
		this.id = id;
		this.name = name;
		this.score = score;
		
		
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Score getScore() {
		return score;
	}

	public void setScore(Score score) {
		this.score = score;
	}
	
	

}
