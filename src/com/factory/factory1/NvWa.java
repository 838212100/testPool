package com.factory.factory1;

public class NvWa {
	
	public static void main(String[] args) {
		
		//��һ�������ߣ�����������
		HumanFactory maleHumanFactory = new MaleFactory();
		//�ڶ��������ߣ�Ů��������
		HumanFactory femaleHumanFactory = new FemaleFactory();
		//�����߽�����ϣ���ʼ��������
		Human maleYellowHuman = maleHumanFactory.createYellowHuman();
		Human femaleYellowHuman = femaleHumanFactory.createYellowHuman();
		femaleYellowHuman.getColor();
		femaleYellowHuman.talk();
		femaleYellowHuman.getSex();
		
		maleYellowHuman.getColor();
		maleYellowHuman.talk();
		maleYellowHuman.getSex();
		
	}

}
