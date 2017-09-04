package com.mediator.mediator2;

public class Purchase extends AbstractColleague{

	public Purchase(AbstractMediator _mediator) {
		super(_mediator);
	}
	//采购IBM电脑
	public void buyIBMcomputer(int number){
		super.mdeiator.execute("purchase.buy", number);
	}
	//不再采购IBM电脑
	public void refuseBuyIBM(){
		System.out.println("不再采购IBM电脑");
	}

}
