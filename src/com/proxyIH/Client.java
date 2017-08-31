package com.proxyIH;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * 强制代理:
 * 指的是 通过真实角色查找代理，不允许直接访问真实角色
 * 高级模块只要调用getProxy方法就可以访问真实角色的所有方法
 * 根本不需要产生一个代理出来，代理的管理已经由真实角色自己完成
 * @author Administrator
 *
 */
public class Client {
	
	
	public static void main(String[] args) throws Throwable{
		//定义一个痴迷的玩家  实现类
		IGamePlayer player = new GamePlayer("zhangsan");
		//定义一个handler  代理类
		InvocationHandler handler = new GamePlayIH(player);
		//开始打游戏，记下时间戳
		System.out.println("开始时间是：2017-08-15 10:40");
		//获得类的 class loader
		ClassLoader cl = player.getClass().getClassLoader();
		
		Class<?>[] cls = new Class<?>[]{};//player.getClass().getInterfaces();
		
		//动态产生一个代理者  通过代理者调用实现类方法
		IGamePlayer proxy = (IGamePlayer) Proxy.newProxyInstance(cl, cls, handler);
		
		proxy.login("zhangsan", "password");
		
		proxy.killBoss();
		
		proxy.upgrade();
		
		proxy.count();
		
		/*
		 * 首先，需要一个借口 和 实现借口的类（我们要代理的对象）
		 * 然后我们要自己写一个在要代理类的方法执行时，能够做额外工作的类，而这个类必须实现InvocationHandler借口，作为动态代理类
		 * 为什么要实现它呢？因为代理类的实例在调用实现类的方法的时候，不会调真正的实现类的这个方法， 
         * 而是转而调用这个类的invoke方法（继承时必须实现的方法），在这个方法中你可以调用真正的实现类的这个方法
		 * 第三步，在要用代理类的实例去调用实现类的方法
		 * 
		 */
		
		/** 
		 * 所谓代理呢也就是在调用实现类的方法时，可以在方法执行前后做额外的工作，这个就是代理。
		 * 
         * 这里要解释下中部那段长长的代码的意思，以及具体做了哪些工作？ 
         * 第一，根据player.getClass().getClassLoader()这个要代理类的类加载器和 
         * player.getClass().getInterfaces()要代理类所实现的所有的接口 
         * 作为参数调用Proxy.getProxyClass(ClassLoader loader, Class<?>... interfaces) 
         * 的方法返回代理类的java.lang.Class对象，也就是得到了java动态生成的代理类$Proxy0的Class对象。 
         * 同时，java还让这个动态生成的$Proxy0类实现了要代理类的实现的所有接口，并继承了Proxy接口。 
         * 第二，实例化这个动态生成的$Proxy0类的一个实例，实例化代理类的构造函数为Proxy(InvocationHandler h)， 
         * 也就是说要实例化这个动态生成的$Proxy0类，必须给它一个InvocationHandler参数，也就是我们自己实现的用来在代理类 
         * 方法执行前后做额外工作的类ReadyInvocationHandler。 
         * 这段代码Proxy.newProxyInstance(player.getClass().getClassLoader(),player.getClass().getInterfaces(),new ReadyInvocationHandler(player)) 
         * 得到的其实是一个类名叫$Proxy0 extends Proxy implements XiangQinInterface的类。 
         * 第三，将这个$Proxy0类强制转型成XiangQinInterface类型，调用xiangQin方法。 
         */  
	}

}
