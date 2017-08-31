package com.prototype.prototypefinal;

import java.util.ArrayList;

/**
 * Ҫʹ��clone��������ĳ�Ա�����ϾͲ�Ҫ����final�ؼ���
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
