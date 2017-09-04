package com.mediator.mediator3;

public class ConcreteColleague2 extends Colleague{

	public ConcreteColleague2(Mediator _mediator) {
		super(_mediator);
	}
	
	public void selfMethod2(){
		System.out.println();
	}
	
	public void depMethod2(){
		//处理自己的业务逻辑
		//自己不能处理的业务逻辑，委托给中介者处理
		super.mediator.doSomething2();
	}
	

}
