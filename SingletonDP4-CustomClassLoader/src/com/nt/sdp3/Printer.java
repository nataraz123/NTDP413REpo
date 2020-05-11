package com.nt.sdp3;


public enum Printer  {
	
	INSTANCE;
	
	public static  Printer  getInstance() {
		System.out.println("Printer.getInstance()--->ENUM");
		return INSTANCE;
	}
	
	//b.method
	public  void printData(String msg) {
		System.out.println(msg);
	}
	
}
