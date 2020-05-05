package com.nt.sdp;

import com.nt.commons.CommonsUtil;

public class Printer  extends  CommonsUtil {
	
	private static boolean flag=false;
	
	private Printer() {
		if(flag==true)
			throw new IllegalArgumentException("obj already created");
		flag=true;
		System.out.println("Printer:: 0-param constructor");
	}
	
	
	//static factory method
	public static   Printer  getInstance() {
		return  PrinterHolder.INSTANCE;
	}
	
	//b.method
	public  void printData(String msg) {
		System.out.println(msg);
	}
	
	//nested/static inner class
	private static class PrinterHolder{
		private static Printer INSTANCE=new Printer();
		
	}//class
	
	//to stop cloning
	public  Object clone() throws CloneNotSupportedException{
		throw new CloneNotSupportedException("cloning is not allowed");
	}
	
	
	//To stop Deserialization
	public  Object readResolve() {
		return PrinterHolder.INSTANCE;
		//throw new IllegalArgumentException("DerSerialization is not allowed");
	}
	
	

}
