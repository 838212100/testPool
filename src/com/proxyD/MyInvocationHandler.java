package com.proxyD;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class MyInvocationHandler implements InvocationHandler{
	//���������
	private Object target = null;
	//ͨ�����캯������һ������
	public MyInvocationHandler(Object _obj){
		this.target = _obj;
	}
	//ִ�б�����ķ���
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		return method.invoke(this.target, args);
	}
	

}
