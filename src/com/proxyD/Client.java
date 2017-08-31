package com.proxyD;

public class Client {
	
	public static void main(String[] args) {
		//定义一个主题 （被代理人）
		Subject subject = new RealSubject();
		//定义一个Handler （代理）
		Subject proxy1 = SubjectDynamicProxy.newProxyInstance(subject);
		//定义主题代理 （切面）
//		Subject proxy = 
//				DynamicProxy.newProxyInstance(subject.getClass().getClassLoader(), subject.getClass().getInterfaces(), handler);//执行前置方法
		proxy1.doSomething("Finish");
	}

}
