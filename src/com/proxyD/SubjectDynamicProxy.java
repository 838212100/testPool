package com.proxyD;

import java.lang.reflect.InvocationHandler;

/**
 * 
 * @author Administrator
 *
 */
public class SubjectDynamicProxy extends DynamicProxy{
	
	public static <T> T newProxyInstance(Subject subject){
		
		//���ClassLoader
		ClassLoader loader = subject.getClass().getClassLoader();
		//��ýӿ�����
		Class<?>[] classes = subject.getClass().getInterfaces();
		//���handler
		InvocationHandler handler = new MyInvocationHandler(subject);
		return newProxyInstance(loader, classes, handler);
	}

}
