package com.mediator.mediator2;

/**
 * 中介者模式
 * 
 * 定义抽象中介者：
 * 具体中介者：实现抽象中介者中的execute方法，通过传入的参数，取不同的方法
 * 
 * 定义一个抽象同事类：定义构造传入抽象中介者
 * 进、销、存三个类需要继承同事类，再实现一些自己需要的方法
 * 
 * 就是说，中介者模式将进、销、存的方法由自己来实现，一些特殊的自由的部分分别放在进、销、存第三个类中
 * 
 * 在场景类中增加了一个中介者，然后分别传递到三个同事类中，三个类都具有相同的特
 * 性：只负责处理自己的活动（行为），与自己无关的活动就丢给中介者处理，程序运行的结
 * 果是相同的。从项目设计上来看，加入了中介者，设计结构清晰了很多，而且类间的耦合性
 * 大大减少，代码质量也有了很大的提升。
 * 
 * 中介者模式降低了对象之间的耦合性
 * @author Administrator
 *
 */
public class Client {
	
	public static void main(String[] args) {
		AbstractMediator mediator = new Mediator();
		
		System.out.println("----------------采购人员采购电脑---------------");
		Purchase purchase = new Purchase(mediator);
		purchase.buyIBMcomputer(100);
		System.out.println("\n----------------销售人员销售电脑---------------");
		Sale sale = new Sale(mediator);
		sale.sellIBMComputer(1);
		System.out.println("\n----------------库房管理人员清库处理---------------");
		Stock stock = new Stock(mediator);
		stock.clearStock();
	}

}
