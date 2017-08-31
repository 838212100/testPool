package com.prototype.prototype3;

import java.util.ArrayList;

public class Thing implements Cloneable{

	private ArrayList<String> arrayList = new ArrayList<String>();
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

	public void setValue(String value){
		this.arrayList.add(value);
	}
	
	public ArrayList<String> getValue(){
		return this.arrayList;
	}
	
}
