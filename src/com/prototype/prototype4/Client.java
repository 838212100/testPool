package com.prototype.prototype4;

public class Client {
	
	public static void main(String[] args) {
		Thing thing = new Thing();
		thing.setValue("123");
		Thing clonList = thing.clone();
		clonList.setValue("aaa");
		System.out.println(thing.getValue());
	}

}
