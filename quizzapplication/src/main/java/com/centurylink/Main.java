package com.centurylink;

public class Main {
	static  int staticFinalInt =99999;
	public static void main(String[] args) {
		
		int intVariable=43;
		String stValue ="value11";
		staticFinalInt +=1;
		System.out.println("Hello world!");
		
		intVariable= 10;
		stValue ="updated value --";
			args = new String[10];
		for (int i = 0; i < 10; i++) {
			args[i] ="val"+i;
			System.out.println("Hello world!"+ i);
		}
		System.out.println(stValue);
		stValue ="updated value -- at line 17";
		System.out.println(stValue);
		intVariable= 67;
		intVariable = 978;
		stValue = "ddd";
		System.out.println(stValue);
	}
}