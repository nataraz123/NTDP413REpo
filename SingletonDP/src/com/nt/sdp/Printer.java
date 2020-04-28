package com.nt.sdp;

public class Printer {
	//private static Printer INSTANCE=new Printer();  //eager Instantiation  (wrong pratice)
	private static Printer INSTANCE;
	
	/*static {
		INSTANCE=new Printer(); //eager Instantiation  (wrong pratice)
	}*/
	
	
	//private constructor
	private  Printer() {
		//no op
		System.out.println("Printer:: 0-param constructor");
	}
	
	
	/*public  static  Printer  getInstance() {
		return INSTANCE;
	}*/
	
	//static factory method
		public  static  Printer  getInstance() {
			if(INSTANCE==null)
				INSTANCE=new Printer();  //Lazy Instantiation  Good Pratice
			return INSTANCE;
		}
	
	//b.method
	public void  printData(String data) {
		System.out.println(data);
	}

}
