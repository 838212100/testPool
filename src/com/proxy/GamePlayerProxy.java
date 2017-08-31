package com.proxy;

public class GamePlayerProxy implements IGamePlayer{
	
	private IGamePlayer gamePalyer = null;
	
	public GamePlayerProxy (String name){
		try {
			this.gamePalyer = new GamePlayer(this,name);
		} catch (Exception e) {
			
		}
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
	
	

}
