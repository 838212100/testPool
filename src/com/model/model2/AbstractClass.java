package com.model.model2;

/**
 * 注：
 * 	抽象模板中的基本方法尽量用protected类型
 * 	
 * @author Administrator
 *
 */
public abstract class AbstractClass {
	
	protected abstract void doSomething();
	
	protected abstract void doAnything();
	
	protected void templateMethod(){
		this.doAnything();
		this.doSomething();
	}

}
