package com.model.model3;

public class HummerH1Model extends HummerModel{

	private boolean alarmFlag = true;
	
	protected void start() {
		
		System.out.println("����H1����...");
		
	}

	
	protected void stop() {
		
		System.out.println("����H1ͣ��...");
		
	}

	
	protected void alarm() {
		
		System.out.println("����H1����...");
		
	}

	
	protected void engineBoom() {
		
		System.out.println("����H1����������������...");
		
	}
	
	protected boolean isAlarm(){
		return this.alarmFlag;
	}
	
	public void setAlarm(boolean isAlarm){
		this.alarmFlag = isAlarm;
	}

	
	

}
