package com.lec.java.class01;

public class Main {

	public static void main(String[] args) {
		
		Mycomputer mc= new Mycomputer();
		mc.displayStatus();
		mc.computerPowerOnOff();
		mc.monitorPowerOnOff();
		mc.volumeUp();
		mc.volumeUp();
		mc.volumeUp();
		mc.volumeDown();
		mc.displayStatus();
		
		
		System.out.println();
		Mycomputer mc1=new Mycomputer();
		
		mc1.displayStatus();
		mc1.monitorPowerOnOff();
		mc1.volumeUp();
		mc1.volumeUp();
		mc1.displayStatus();
		
		System.out.println(mc);
		System.out.println(mc1);
		
		mc=mc1;

	}

}
