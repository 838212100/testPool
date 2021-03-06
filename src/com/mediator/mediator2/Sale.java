package com.mediator.mediator2;

import java.util.Random;

public class Sale extends AbstractColleague{

	public Sale(AbstractMediator _mediator) {
		super(_mediator);
	}
	
	public void sellIBMComputer(int number){
		super.mdeiator.execute("sale.sell", number);
		System.out.println("销售IBM电脑"+number+"台");
	}
	
	public int getSaleStatus(){
		Random rand = new Random(System.currentTimeMillis());
		int saleStatus = rand.nextInt(100);
		System.out.println("IBM电脑的销售情况为："+saleStatus);
		return saleStatus;
	}
	
	public void offSale(){
		super.mdeiator.execute("sale.offsell");
	}
	
	

}
