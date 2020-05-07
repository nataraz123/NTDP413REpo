package com.nt.test;

import com.nt.sdp.Printer;

public class SingletonTest1 {

	public static void main(String[] args) {
		Printer p1=null,p2=null;
		
		p1=Printer.INSTANCE;
		p2=Printer.INSTANCE;
		System.out.println(p1.hashCode()+"   "+p2.hashCode());
		System.out.println("p1==p2?"+(p1==p2));
		System.out.println(p1.getClass()+"   "+p2.getClass());
		p1.printData("hello");
		
		

	}

}
