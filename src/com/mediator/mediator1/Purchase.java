package com.mediator.mediator1;
/**
 * �ɹ�����
 * @author Administrator
 *
 */
public class Purchase {
	
	//�ɹ�IBM����
	public void buyIBMcomputer(int number){
		//���ʿ��
		Stock stock = new Stock();
		//��������
		Sale sale = new Sale();
		//���Ե��������
		int saleStatus = sale.getSaleStatus();
		if(saleStatus > 80){//���������
			System.out.println("�ɹ�IBM���ԣ�"+number+"̨");
			stock.increase(number);
		}else{//�����������
			int buyNumber = number/2;
			System.out.println("�ɹ�IBM���ԣ�"+buyNumber+"̨");
		}
		
	}
	
	public void refuseBuyIBM(){
		System.out.println("���ٲɹ�IBM����");
	}

}
