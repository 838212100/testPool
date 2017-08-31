package com.factory.factory2;

public class Client {

	
	public static void main(String[] args) {
		//������1
		AbstractCreator creator1 = new Creator1();
		//������2
		AbstractCreator creator2 = new Creator2();
		
		//��ƷA1
		AbstractProductA a1 = creator1.createProductA();
		//��ƷA2
		AbstractProductB b1 = creator1.createProductB();
		
		//��ƷA1
		AbstractProductA a2 = creator2.createProductA();
		//��ƷA2
		AbstractProductB b2 = creator2.createProductB();
		
		a1.doSomething();
		b1.doSomething();
		a2.doSomething();
		b2.doSomething();
		
		
	}
	
}
