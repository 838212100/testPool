package com.factory.factory1;

public class MaleFactory implements HumanFactory{

	public Human createYellowHuman() {
		return new MaleYellowHuman();
	}

	public Human createWhiteHuman() {
		return new MaleWhiteHuman();
	}

	public Human createBlackHuman() {
		return new MaleBlackHuman();
	}
	
}
