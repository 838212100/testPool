package com.proxyI;

public class GamePlayerProxy implements IGamePlayer ,IProxy{
	
	private IGamePlayer gamePalyer = null;
	
	
	public GamePlayerProxy(IGamePlayer _gamePlayer){
		this.gamePalyer = _gamePlayer;
	}
	

	public void login(String user, String password) {
		this.gamePalyer.login("zhangsan", "password");
	}

	public void killBoss() {
		this.gamePalyer.killBoss();
	}

	public void upgrade() {
		this.gamePalyer.upgrade();
		this.count();
	}

	public IGamePlayer getProxy() {
		return this;
	}


	public void count() {
		System.out.println("费用为：150元");
	}
	
	

}
