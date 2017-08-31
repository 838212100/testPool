package com.proxyP;

public class GamePlayerProxy implements IGamePlayer{
	
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
	}

	public IGamePlayer getProxy() {
		return this;
	}
	
	

}
