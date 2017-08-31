package com.proxyP;

public class GamePlayer implements IGamePlayer {

	private String name = "";
	
	private IGamePlayer proxy = null;

	//构造函数限制谁能创建对象，并同时传递姓名
	public GamePlayer(String _name){
		this.name = _name;
	}
	
	public void login(String user, String password) {
		if(this.isProxy()){
			System.out.println("账号为："+user+"密码是："+password);
			System.out.println("我GamePlayer是login()方法的实际执行者");
		}else{
			System.out.println("请使用指定的代理访问");
		}
		

	}

	
	public void killBoss() {
		if(this.isProxy()){
			System.out.println(this.name+"的玩家在打怪");
			System.out.println("我GamePlayer是killBoss()方法的实际执行者");
		}else{
			System.out.println("请使用指定的代理访问");
		}

	}

	
	public void upgrade() {
		if(this.isProxy()){
			System.out.println(this.name+"升级了");
			System.out.println("我GamePlayer是upgrade()方法的实际执行者");
		}else{
			System.out.println("请使用指定的代理访问");
		}

	}

	public IGamePlayer getProxy() {
		this.proxy = new GamePlayerProxy(this);
		return this.proxy;
	}
	
	//校验是否是代理访问
	private boolean isProxy(){
		if(this.proxy == null){
			return false;
		}else{
			return true;
		}
	}
	
	

}
