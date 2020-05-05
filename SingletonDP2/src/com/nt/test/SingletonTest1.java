package com.nt.test;

import com.nt.sdp.Printer;

public class SingletonTest1 {

	public static void main(String[] args) {
		Printer p1=null,p2=null;
		//p1=new Printer();  //not possible
		p1=Printer.getInstance();
		p2=Printer.getInstance();
		System.out.println(p1.hashCode()+"  "+p2.hashCode());
		System.out.println("(p1==p2?)"+(p1==p2));
		System.out.println(".....................................");
		p1.printData("hello");
		p2.printData("hai");
		
		/*try {
		 Class.forName("com.nt.sdp.Printer");
		}
		catch(Exception e) {
			e.printStackTrace();
		}*/

	}

}
