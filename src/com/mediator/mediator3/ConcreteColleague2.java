package com.mediator.mediator3;

public class ConcreteColleague2 extends Colleague{

	public ConcreteColleague2(Mediator _mediator) {
		super(_mediator);
	}
	
	public void selfMethod2(){
		System.out.println();
	}
	
	public void depMethod2(){
		//�����Լ���ҵ���߼�
		//�Լ����ܴ����ҵ���߼���ί�и��н��ߴ���
		super.mediator.doSomething2();
	}
	

}
