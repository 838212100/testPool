package com.prototype.prototype2;

public class Thing implements Cloneable{
	
	public Thing(){
		System.out.println("我是构造函数");
	}
	
	@Override
	public Thing clone(){
		Thing thing = null;
		try {
			thing = (Thing) super.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return thing;
	}

}
