package com.model.model3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Client {
	
	public static void main(String[] args) throws IOException {
		System.out.println("-----------H1�ͺź���-----------");
		System.out.println("H1�ͺź����Ƿ���Ҫ�������죿0-����Ҫ     1��Ҫ");
		String type = (new BufferedReader(new InputStreamReader(System.in))).readLine();
		HummerH1Model h1 = new HummerH1Model();
		if(type.equals("0")){
			h1.setAlarm(false);
		}
		h1.run();
		System.out.println("\n-----------H2�ͺź���-----------");
		HummerH2Model h2 = new HummerH2Model();
		h2.run();
		new InputStreamReader(System.in).read();
		System.out.println("=========");
	}

}
