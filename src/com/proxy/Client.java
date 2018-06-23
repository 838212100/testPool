package com.proxy;

public class Client {
	
	
	public static void main(String[] args) {
		
//		IGamePlayer player = new GamePlayer();
		
//		player.login("zhangsan", "password");
//		
//		player.killBoss();
//		
//		player.upgrade();
		
		IGamePlayer playProxy = new GamePlayerProxy("zhangsan");
		
		playProxy.login("zhangsan", "password");
		
		playProxy.killBoss();
		
		playProxy.upgrade();
		
		
	}

}
