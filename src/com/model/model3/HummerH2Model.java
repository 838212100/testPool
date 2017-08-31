package com.model.model3;

public class HummerH2Model extends HummerModel{

	
	protected void start() {
		
		System.out.println("悍马H2发动...");
		
	}

	
	protected void stop() {
		
		System.out.println("悍马H2停车...");
		
	}

	
	protected void alarm() {
		
		System.out.println("悍马H2鸣笛...");
		
	}
	
	
	protected void engineBoom() {
		
		System.out.println("悍马H2引擎声音是这样的...");
		
	}
	
	@Override
	protected boolean isAlarm(){
		return false;
	}
	
	

}
