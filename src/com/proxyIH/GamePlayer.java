package com.proxyIH;

public class GamePlayer implements IGamePlayer,IProxy {

	private String name = "";
	
	//构造函数限制谁能创建对象，并同时传递姓名
	public GamePlayer(String _name){
		this.name = _name;
	}
	
	public void login(String user, String password) {
		System.out.println("账号为："+user+"密码是："+password);
		System.out.println("我GamePlayer是login()方法的实际执行者");
	}

	
	public void killBoss() {
		System.out.println(this.name+"的玩家在打怪");
		System.out.println("我GamePlayer是killBoss()方法的实际执行者");
	}

	
	public void upgrade() {
		System.out.println(this.name+"升级了");
		System.out.println("我GamePlayer是upgrade()方法的实际执行者");
	}


	public void count() {
		System.out.println("共150元----------------");
	}

}
