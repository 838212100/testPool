package com.prototype.prototype1;

import java.util.Random;

public class Client {
	
	private static int MAX_COUTN = 6;
	
	public static void main(String[] args) {
		int i =0;
		Mail mail = new Mail(new AdvTemplate());
		mail.setTail("XX���а�Ȩ����");
		while(i < MAX_COUTN){
			Mail cloneMail = mail.clone();
			cloneMail.setAppellation(getRandString(5)+"������Ůʿ��");
			cloneMail.setReceiver(getRandString(5)+"@"+getRandString(8)+".com");
			sendMail(cloneMail);
			i++;
		}
		
	}
	
	public static void sendMail(Mail mail){
		System.out.println("���⣺"+mail.getSubject() + "\t�ռ��ˣ�"
					+mail.getReceiver()+"\t...���ͳɹ���");
	}
	
	public static String getRandString(int maxLength){
		String source = "abcdefghijklmnopqrskuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
		StringBuffer sb = new StringBuffer();
		Random rand = new Random();
		for (int i = 0; i < maxLength; i++) {
			sb.append(source.charAt(rand.nextInt(source.length())));
		}
		return sb.toString();
	}

}
