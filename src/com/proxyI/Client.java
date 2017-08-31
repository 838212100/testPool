package com.proxyI;

/**
 * 强制代理:
 * 指的是 通过真实角色查找代理，不允许直接访问真实角色
 * 高级模块只要调用getProxy方法就可以访问真实角色的所有方法
 * 根本不需要产生一个代理出来，代理的管理已经由真实角色自己完成
 * @author Administrator
 *
 */
public class Client {
	
	
	public static void main(String[] args) {
		
		IGamePlayer player = new GamePlayer("zhangsan");
		
		IGamePlayer proxy = player.getProxy(); 
		
		proxy.login("zhangsan", "password");
		
		proxy.killBoss();
		
		proxy.upgrade();
		
		
		
		
	}

}
