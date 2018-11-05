package com.advtemplate;

public class Thing implements Cloneable{
	
	public Thing() {
		System.out.println("ִ�й��캯��");
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
