package com.mediator.mediator2;

public class Purchase extends AbstractColleague{

	public Purchase(AbstractMediator _mediator) {
		super(_mediator);
	}
	//�ɹ�IBM����
	public void buyIBMcomputer(int number){
		super.mdeiator.execute("purchase.buy", number);
	}
	//���ٲɹ�IBM����
	public void refuseBuyIBM(){
		System.out.println("���ٲɹ�IBM����");
	}

}