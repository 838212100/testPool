package com.mediator.mediator3;

public class ConcreteColleague1 extends Colleague{
	//ͨ�����캯�������н���
	public ConcreteColleague1(Mediator _mediator) {
		super(_mediator);
	}
	//���з��� self-method
	public void selfMethod1(){
		System.out.println();
	}
	
	public void depMethod1(){
		//�����Լ���ҵ���߼�
		//�Լ����ܴ����ҵ���߼���ί�и��н��ߴ���
		super.mediator.doSomething1();
	}

}
