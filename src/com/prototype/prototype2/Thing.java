package com.prototype.prototype2;

public class Thing implements Cloneable{
	
	public Thing(){
		System.out.println("���ǹ��캯��");
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
