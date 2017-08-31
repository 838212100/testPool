package com.prototype.prototypefinal;

import java.util.ArrayList;

/**
 * 要使用clone方法，类的成员变量上就不要增加final关键字
 * @author Administrator
 *
 */
public class Thing {
	
//	private final ArrayList<String> arrayList = new ArrayList<String>();
	private ArrayList<String> arrayList = new ArrayList<String>();
	
	@Override
	public Thing clone(){
		Thing thing = null;
		try {
			thing = (Thing) super.clone();
			this.arrayList = (ArrayList<String>) this.arrayList.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return thing;
	}

}
