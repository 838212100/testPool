package com.model.model3;

public class HummerH2Model extends HummerModel{

	
	protected void start() {
		
		System.out.println("����H2����...");
		
	}

	
	protected void stop() {
		
		System.out.println("����H2ͣ��...");
		
	}

	
	protected void alarm() {
		
		System.out.println("����H2����...");
		
	}
	
	
	protected void engineBoom() {
		
		System.out.println("����H2����������������...");
		
	}
	
	@Override
	protected boolean isAlarm(){
		return false;
	}
	
	

}
