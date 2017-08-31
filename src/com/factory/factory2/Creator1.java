package com.factory.factory2;

/**
 * π§≥ß¿‡1
 * @author Administrator
 *
 */
public class Creator1 extends AbstractCreator{

	public AbstractProductA createProductA() {
		return new ProductA1();
	}

	public AbstractProductB createProductB() {
		return new ProductB1();
	}

}
