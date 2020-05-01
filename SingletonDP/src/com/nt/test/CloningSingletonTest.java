package com.nt.test;

import com.nt.sdp.Printer;

public class CloningSingletonTest {

	public static void main(String[] args) {
		Printer p1=null;
		Printer p2=null,p3=null;
		p1=Printer.getInstance();
		try {
		//do cloning
		p2=(Printer)p1.clone();
		p3=(Printer)p2.clone();
		System.out.println(p1.hashCode()+"   "+p2.hashCode()+"  "+p3.hashCode());
		System.out.println("(p1==p2?)"+(p1==p2));
		}
		catch(CloneNotSupportedException cnf) {
			cnf.printStackTrace();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
	   
	}

}
