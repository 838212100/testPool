package com.model.model2;

/**
 * ע��
 * 	����ģ���еĻ�������������protected����
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
