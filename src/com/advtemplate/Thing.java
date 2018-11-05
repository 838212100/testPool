package com.advtemplate;

public class Thing implements Cloneable{
	
	public Thing() {
		System.out.println("执行构造函数");
	}

	@Override
	protected Thing clone() {
		Thing thing = null;
		try {
			
			thing =  (Thing) super.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return thing;
	}
	
	

}
