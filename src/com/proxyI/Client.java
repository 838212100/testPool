package com.proxyI;

/**
 * ǿ�ƴ���:
 * ָ���� ͨ����ʵ��ɫ���Ҵ���������ֱ�ӷ�����ʵ��ɫ
 * �߼�ģ��ֻҪ����getProxy�����Ϳ��Է�����ʵ��ɫ�����з���
 * ��������Ҫ����һ���������������Ĺ����Ѿ�����ʵ��ɫ�Լ����
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
