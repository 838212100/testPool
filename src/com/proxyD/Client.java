package com.proxyD;

public class Client {
	
	public static void main(String[] args) {
		//����һ������ ���������ˣ�
		Subject subject = new RealSubject();
		//����һ��Handler ������
		Subject proxy1 = SubjectDynamicProxy.newProxyInstance(subject);
		//����������� �����棩
//		Subject proxy = 
//				DynamicProxy.newProxyInstance(subject.getClass().getClassLoader(), subject.getClass().getInterfaces(), handler);//ִ��ǰ�÷���
		proxy1.doSomething("Finish");
	}

}
