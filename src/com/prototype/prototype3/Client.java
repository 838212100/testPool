package com.prototype.prototype3;

public class Client {
	
	public static void main(String[] args) {
		Thing thing = new Thing();
		thing.setValue("123");
		Thing cloneThing = thing.clone();
		cloneThing.setValue("aaa");
		System.out.println(thing.getValue());
	}

}
