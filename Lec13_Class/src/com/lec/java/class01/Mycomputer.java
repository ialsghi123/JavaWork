package com.lec.java.class01;

public class Mycomputer {
	private boolean computerPower;
	private boolean monitorPower;
	private int volume;
	
	public void displayStatus() {
		System.out.println("computer 상태");
		System.out.println("----------------------------");
		System.out.println("전원 상태:"+computerPower);
		System.out.println("모니터 상태:"+monitorPower);
		System.out.println("볼륨 상태:"+volume);
		System.out.println("----------------------------");
	}
	
	public void computerPowerOnOff() {
		if(computerPower) {
			computerPower=false;
			System.out.println("컴퓨터가 꺼져있습니다");
		}else {
			computerPower=true;
			System.out.println("컴퓨터가 켜져있습니다");
		}
	}
	
	public void monitorPowerOnOff()
	{
		if(monitorPower) {
			monitorPower=false;
			System.out.println("모니터가 꺼져있습니다");
		} else {
			monitorPower=true;
			System.out.println("모니터가 켜져있습니다");
		}
	}
	
	public int volumeUp() {
		volume++;
		System.out.println("현재볼륨:"+volume);
		return volume;
	}
	
	
	public int volumeDown() {
		volume--;
		System.out.println("현재볼륨:"+volume);
		return volume;
	}
}





