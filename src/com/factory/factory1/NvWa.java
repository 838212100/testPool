package com.factory.factory1;

public class NvWa {
	
	public static void main(String[] args) {
		
		//第一条生产线，男性生产线
		HumanFactory maleHumanFactory = new MaleFactory();
		//第二条生产线，女性生产线
		HumanFactory femaleHumanFactory = new FemaleFactory();
		//生产线建立完毕，开始生产人了
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
