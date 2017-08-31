package com.proxyP;

public class GamePlayer implements IGamePlayer {

	private String name = "";
	
	private IGamePlayer proxy = null;

	//���캯������˭�ܴ������󣬲�ͬʱ��������
	public GamePlayer(String _name){
		this.name = _name;
	}
	
	public void login(String user, String password) {
		if(this.isProxy()){
			System.out.println("�˺�Ϊ��"+user+"�����ǣ�"+password);
			System.out.println("��GamePlayer��login()������ʵ��ִ����");
		}else{
			System.out.println("��ʹ��ָ���Ĵ������");
		}
		

	}

	
	public void killBoss() {
		if(this.isProxy()){
			System.out.println(this.name+"������ڴ��");
			System.out.println("��GamePlayer��killBoss()������ʵ��ִ����");
		}else{
			System.out.println("��ʹ��ָ���Ĵ������");
		}

	}

	
	public void upgrade() {
		if(this.isProxy()){
			System.out.println(this.name+"������");
			System.out.println("��GamePlayer��upgrade()������ʵ��ִ����");
		}else{
			System.out.println("��ʹ��ָ���Ĵ������");
		}

	}

	public IGamePlayer getProxy() {
		this.proxy = new GamePlayerProxy(this);
		return this.proxy;
	}
	
	//У���Ƿ��Ǵ������
	private boolean isProxy(){
		if(this.proxy == null){
			return false;
		}else{
			return true;
		}
	}
	
	

}
