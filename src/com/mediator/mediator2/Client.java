package com.mediator.mediator2;

/**
 * �н���ģʽ
 * 
 * ��������н��ߣ�
 * �����н��ߣ�ʵ�ֳ����н����е�execute������ͨ������Ĳ�����ȡ��ͬ�ķ���
 * 
 * ����һ������ͬ���ࣺ���幹�촫������н���
 * ������������������Ҫ�̳�ͬ���࣬��ʵ��һЩ�Լ���Ҫ�ķ���
 * 
 * ����˵���н���ģʽ������������ķ������Լ���ʵ�֣�һЩ��������ɵĲ��ֱַ���ڽ������������������
 * 
 * �ڳ�������������һ���н��ߣ�Ȼ��ֱ𴫵ݵ�����ͬ�����У������඼������ͬ����
 * �ԣ�ֻ�������Լ��Ļ����Ϊ�������Լ��޹صĻ�Ͷ����н��ߴ����������еĽ�
 * ������ͬ�ġ�����Ŀ������������������н��ߣ���ƽṹ�����˺ܶ࣬�������������
 * �����٣���������Ҳ���˺ܴ��������
 * 
 * �н���ģʽ�����˶���֮��������
 * @author Administrator
 *
 */
public class Client {
	
	public static void main(String[] args) {
		AbstractMediator mediator = new Mediator();
		
		System.out.println("----------------�ɹ���Ա�ɹ�����---------------");
		Purchase purchase = new Purchase(mediator);
		purchase.buyIBMcomputer(100);
		System.out.println("\n----------------������Ա���۵���---------------");
		Sale sale = new Sale(mediator);
		sale.sellIBMComputer(1);
		System.out.println("\n----------------�ⷿ������Ա��⴦��---------------");
		Stock stock = new Stock(mediator);
		stock.clearStock();
	}

}
