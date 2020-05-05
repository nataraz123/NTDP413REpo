package com.nt.test;

import java.lang.reflect.Constructor;

import com.nt.sdp.Printer;

public class ReflectionAPISingletonTest {

	public static void main(String[] args) {
		Printer p1=null,p2=null;
		Class c=null;
		Constructor cons[]=null;
		//get Onject
		p1=Printer.getInstance();
		
		//object creation using reflection api
		try {
			//Load class 
			c=Class.forName("com.nt.sdp.Printer");
			//get All the constructors of the loaded class
			cons=c.getDeclaredConstructors();
			//get Access to private constructor
			cons[0].setAccessible(true);
			// create Object using newInstance() method
			p2=(Printer)cons[0].newInstance();
			
			System.out.println(p1.hashCode()+"   "+p2.hashCode());
			System.out.println("p1==p2?"+(p1==p2));
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		

	}//main
}//class
