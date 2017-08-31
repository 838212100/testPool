package com.factory.factory2;

/**
 * π§≥ß¿‡2
 * @author Administrator
 *
 */
public class Creator2 extends AbstractCreator{

	public AbstractProductA createProductA() {
		return new ProductA2();
	}

	public AbstractProductB createProductB() {
		return new ProductB2();
	}

}
