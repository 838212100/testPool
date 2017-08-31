package com.proxy1;

public class RealSubject implements Subject {


	public void request() {
		
		System.out.println("我是实际方法的执行者");

	}

}
