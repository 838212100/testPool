package com.proxy1;

public class Proxy implements Subject{
	
	//Ҫ�����ĸ�ʵ����
	private Subject subject = null;
	
	
	public Proxy(Subject _subject){
		this.subject = _subject;
	}
	
	public Proxy(Object...objects){
		
	}
	
	


	public void request() {
		this.before();
		
		this.subject.request();
		
		this.after();
	}
	
	private void before(){
		System.out.println("before");
	}
	
	private void after(){
		System.out.println("after");
	}

}
