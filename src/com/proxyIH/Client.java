package com.proxyIH;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * ǿ�ƴ���:
 * ָ���� ͨ����ʵ��ɫ���Ҵ���������ֱ�ӷ�����ʵ��ɫ
 * �߼�ģ��ֻҪ����getProxy�����Ϳ��Է�����ʵ��ɫ�����з���
 * ��������Ҫ����һ���������������Ĺ����Ѿ�����ʵ��ɫ�Լ����
 * @author Administrator
 *
 */
public class Client {
	
	
	public static void main(String[] args) throws Throwable{
		//����һ�����Ե����  ʵ����
		IGamePlayer player = new GamePlayer("zhangsan");
		//����һ��handler  ������
		InvocationHandler handler = new GamePlayIH(player);
		//��ʼ����Ϸ������ʱ���
		System.out.println("��ʼʱ���ǣ�2017-08-15 10:40");
		//������ class loader
		ClassLoader cl = player.getClass().getClassLoader();
		
		Class<?>[] cls = new Class<?>[]{};//player.getClass().getInterfaces();
		
		//��̬����һ��������  ͨ�������ߵ���ʵ���෽��
		IGamePlayer proxy = (IGamePlayer) Proxy.newProxyInstance(cl, cls, handler);
		
		proxy.login("zhangsan", "password");
		
		proxy.killBoss();
		
		proxy.upgrade();
		
		proxy.count();
		
		/*
		 * ���ȣ���Ҫһ����� �� ʵ�ֽ�ڵ��ࣨ����Ҫ����Ķ���
		 * Ȼ������Ҫ�Լ�дһ����Ҫ������ķ���ִ��ʱ���ܹ������⹤�����࣬����������ʵ��InvocationHandler��ڣ���Ϊ��̬������
		 * ΪʲôҪʵ�����أ���Ϊ�������ʵ���ڵ���ʵ����ķ�����ʱ�򣬲����������ʵ�������������� 
         * ����ת������������invoke�������̳�ʱ����ʵ�ֵķ����������������������Ե���������ʵ������������
		 * ����������Ҫ�ô������ʵ��ȥ����ʵ����ķ���
		 * 
		 */
		
		/** 
		 * ��ν������Ҳ�����ڵ���ʵ����ķ���ʱ�������ڷ���ִ��ǰ��������Ĺ�����������Ǵ���
		 * 
         * ����Ҫ�������в��Ƕγ����Ĵ������˼���Լ�����������Щ������ 
         * ��һ������player.getClass().getClassLoader()���Ҫ���������������� 
         * player.getClass().getInterfaces()Ҫ��������ʵ�ֵ����еĽӿ� 
         * ��Ϊ��������Proxy.getProxyClass(ClassLoader loader, Class<?>... interfaces) 
         * �ķ������ش������java.lang.Class����Ҳ���ǵõ���java��̬���ɵĴ�����$Proxy0��Class���� 
         * ͬʱ��java���������̬���ɵ�$Proxy0��ʵ����Ҫ�������ʵ�ֵ����нӿڣ����̳���Proxy�ӿڡ� 
         * �ڶ���ʵ���������̬���ɵ�$Proxy0���һ��ʵ����ʵ����������Ĺ��캯��ΪProxy(InvocationHandler h)�� 
         * Ҳ����˵Ҫʵ���������̬���ɵ�$Proxy0�࣬�������һ��InvocationHandler������Ҳ���������Լ�ʵ�ֵ������ڴ����� 
         * ����ִ��ǰ�������⹤������ReadyInvocationHandler�� 
         * ��δ���Proxy.newProxyInstance(player.getClass().getClassLoader(),player.getClass().getInterfaces(),new ReadyInvocationHandler(player)) 
         * �õ�����ʵ��һ��������$Proxy0 extends Proxy implements XiangQinInterface���ࡣ 
         * �����������$Proxy0��ǿ��ת�ͳ�XiangQinInterface���ͣ�����xiangQin������ 
         */  
	}

}
