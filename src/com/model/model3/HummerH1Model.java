package com.model.model3;

public class HummerH1Model extends HummerModel{

	private boolean alarmFlag = true;
	
	protected void start() {
		
		System.out.println("悍马H1发动...");
		
	}

	
	protected void stop() {
		
		System.out.println("悍马H1停车...");
		
	}

	
	protected void alarm() {
		
		System.out.println("悍马H1鸣笛...");
		
	}

	
	protected void engineBoom() {
		
		System.out.println("悍马H1引擎声音是这样的...");
		
	}
	
	protected boolean isAlarm(){
		return this.alarmFlag;
	}
	
	public void setAlarm(boolean isAlarm){
		this.alarmFlag = isAlarm;
	}

	
	

}
