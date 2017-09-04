package com.mediator.mediator3;

/**
 * 中介者模式
 * 降低类之间的耦合性
 * 缺点是中介者的类会因为依赖关系膨胀到很大，同事类越多，中介者的逻辑就越复杂
 * @author Administrator
 *
 */
public abstract class Mediator {
	//定义同事类
	protected ConcreteColleague1 c1;
	protected ConcreteColleague2 c2;
	//通过getter/setter方法把同事类注入进来
	public ConcreteColleague1 getC1() {
		return c1;
	}
	public void setC1(ConcreteColleague1 c1) {
		this.c1 = c1;
	}
	public ConcreteColleague2 getC2() {
		return c2;
	}
	public void setC2(ConcreteColleague2 c2) {
		this.c2 = c2;
	}
	//中介者模式的业务逻辑
	public abstract void doSomething1();
	public abstract void doSomething2();
	
	

}
