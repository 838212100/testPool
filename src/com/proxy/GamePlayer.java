package com.proxy;

public class GamePlayer implements IGamePlayer {

	private String name = "";
	//���캯������˭�ܴ������󣬲�ͬʱ��������
	public GamePlayer(IGamePlayer _gamePlayer ,String _name) throws Exception{
		if(_gamePlayer == null){
			System.out.println("���ܴ�����ʵ��ɫ");
			throw new Exception("���ܴ�����ʵ��ɫ");
		}else{
			this.name = _name;
		}
	}
	
	public void login(String user, String password) {
		
		System.out.println("�˺�Ϊ��"+user+"�����ǣ�"+password);
		System.out.println("��GamePlayer��login()������ʵ��ִ����");

	}

	
	public void killBoss() {
		
		System.out.println(this.name+"������ڴ��");
		System.out.println("��GamePlayer��killBoss()������ʵ��ִ����");

	}

	
	public void upgrade() {
		
		System.out.println(this.name+"������");
		System.out.println("��GamePlayer��upgrade()������ʵ��ִ����");

	}

}
