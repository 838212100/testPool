package com.factory.factory2;

public class Client {

	
	public static void main(String[] args) {
		//工厂类1
		AbstractCreator creator1 = new Creator1();
		//工厂类2
		AbstractCreator creator2 = new Creator2();
		
		//产品A1
		AbstractProductA a1 = creator1.createProductA();
		//产品A2
		AbstractProductB b1 = creator1.createProductB();
		
		//产品A1
		AbstractProductA a2 = creator2.createProductA();
		//产品A2
		AbstractProductB b2 = creator2.createProductB();
		
		a1.doSomething();
		b1.doSomething();
		a2.doSomething();
		b2.doSomething();
		
		
	}
	
}
