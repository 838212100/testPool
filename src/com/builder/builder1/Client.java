package com.builder.builder1;

import java.util.ArrayList;

public class Client {
	
	public static void main(String[] args) {
		
		
		
		
//		ArrayList<String> sequence = new ArrayList<String>();
//		sequence.add("engine boom"); //�ͻ�Ҫ��run��ʱ���ȷ�������
//		sequence.add("start"); //��������
//		sequence.add("stop"); 
//		
//		BenzBuilder benzBuilder = new BenzBuilder();
//		
//		benzBuilder.setSequence(sequence);
//		
//		BenzModel benz = (BenzModel) benzBuilder.getCarModel();
//		
//		
//		benz.setSequence(sequence);
//		
//		benz.run();
		
		Director director = new Director();
		
		for (int i = 0; i < 10; i++) {
			director.getABenzModel().run();
		}
		
		
	}

}
