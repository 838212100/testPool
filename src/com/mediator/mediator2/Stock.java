package com.mediator.mediator2;

public class Stock extends AbstractColleague{

	public Stock(AbstractMediator _mediator) {
		super(_mediator);
	}
	
	private static int COMPUTER_NUMBER = 100;
	
	public void increase(int number){
		COMPUTER_NUMBER = COMPUTER_NUMBER + number;
		System.out.println("�������Ϊ��"+COMPUTER_NUMBER);
	}
	
	public void decrease(int number){
		COMPUTER_NUMBER = COMPUTER_NUMBER - number;
		System.out.println("�������Ϊ��"+COMPUTER_NUMBER);
	}
	
	public int getStockNumber(){
		return COMPUTER_NUMBER;
	}
	
	public void clearStock(){
		System.out.println("����������Ϊ��"+COMPUTER_NUMBER);
		super.mdeiator.execute("stock.clear");
	}
	

}
