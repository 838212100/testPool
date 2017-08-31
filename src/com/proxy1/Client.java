package com.proxy1;

public class Client {
	
	public static void main(String[] args) {
		Subject subject  = new Proxy(new Proxy());
		subject.request();
	}

}
