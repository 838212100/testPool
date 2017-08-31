package com.builder.builder1;

import java.util.ArrayList;

public class Director {
	
	private ArrayList<String> sequence = new ArrayList<String>();
	
	private BenzBuilder benzBuilder = new BenzBuilder();
	
	private BMWBuilder bmwBuilder = new BMWBuilder();
	
	public BenzModel getABenzModel(){
		
		this.sequence.clear();
		
		this.sequence.add("start");
		
		this.sequence.add("stop");
		
		this.benzBuilder.setSequence(sequence);
		
		return (BenzModel) this.benzBuilder.getCarModel();
		
	}
	
	public BenzModel getBBenzModel(){
		this.sequence.clear();
		this.sequence.add("engine boom");
		this.sequence.add("start");
		this.sequence.add("stop");
		this.benzBuilder.setSequence(this.sequence);
		return (BenzModel)this.benzBuilder.getCarModel();
	}

	/*
	* C�ͺŵı������Ȱ������ȣ���ҫ���Ȼ��������Ȼ��ֹͣ
	*/
	public BMWModel getCBMWModel(){
	this.sequence.clear();
	this.sequence.add("alarm");
	this.sequence.add("start");
	this.sequence.add("stop");
	this.bmwBuilder.setSequence(this.sequence);
	return (BMWModel)this.bmwBuilder.getCarModel();
	}
	/*
	* D���͵ı���ֻ��һ�����ܣ������ܣ������������ܣ���Զ��ֹͣ
	*/
	public BMWModel getDBMWModel(){
	this.sequence.clear();
	this.sequence.add("start");
	this.bmwBuilder.setSequence(this.sequence);
	return (BMWModel)this.benzBuilder.getCarModel();
	}
}
