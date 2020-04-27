package com.lec.java.class03;

public class Numeric {
	
	private char ch;
	private byte operatior;
	private int operand1;
	private int operand2;
	public Numeric(char ch, byte operatior, int operand1, int operand2) {
		super();
		this.ch = ch;
		this.operatior = operatior;
		this.operand1 = operand1;
		this.operand2 = operand2;
	}
	public Numeric() {
		super();
	}
	public char getCh() {
		return ch;
	}
	public void setCh(char ch) {
		this.ch = ch;
	}
	public byte getOperatior() {
		return operatior;
	}
	public void setOperatior(byte operatior) {
		this.operatior = operatior;
	}
	public int getOperand1() {
		return operand1;
	}
	public void setOperand1(int operand1) {
		this.operand1 = operand1;
	}
	public int getOperand2() {
		return operand2;
	}
	public void setOperand2(int operand2) {
		this.operand2 = operand2;
	}
	//------------------------->    //소스 제너레이터 사용하면 편하게 사용 가능
	
	
	

}
