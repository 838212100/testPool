package com.proxyIH;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class GamePlayIH implements InvocationHandler{
	
	//��������
	//Class cls = null;
	//�������ʵ��
	Object obj = null;
	//��Ҫ����˭
	public GamePlayIH(Object _obj){
		this.obj = _obj;
	}

	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
//		System.out.println(proxy.getClass().getSimpleName());
//		System.out.println("��������׼��");
		Object result = method.invoke(this.obj, args);
		if(method.getName().equalsIgnoreCase("login")){
			System.out.println("�����ڵ�¼����˺�");
		}
		return result;
	}
	
	

}
