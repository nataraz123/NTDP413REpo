package com.nt.sdp;

import com.nt.commons.CommonsUtil;

public class Printer  extends  CommonsUtil {
	//private static Printer INSTANCE=new Printer();  //eager Instantiation  (wrong pratice)
	private static Printer INSTANCE1;
	private static final  long serialVersionUID=345L;
	//private int a;
	
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
	}
	*/
	
	/*//static factory method
		public synchronized static  Printer  getInstance() {
			if(INSTANCE==null)
				INSTANCE=new Printer();  //Lazy Instantiation  Good Pratice
			return INSTANCE;
		}*/
	
	//static factory method
	public  static  Printer  getInstance() {
	   if(INSTANCE1==null) {			//1st NULL check
			 synchronized (Printer.class) {
				if(INSTANCE1==null) //2nd NULL check
					INSTANCE1=new Printer();  //Lazy Instantiation  Good Pratice
			 }//synchroized
	     }//if
				return INSTANCE1;
			}//method
	
	//b.method
	public void  printData(String data) {
		System.out.println(data);
	}
	
	//solving cloning problem of singleton  (recomanded)
	@Override
	public   Object clone()throws CloneNotSupportedException {
		throw new CloneNotSupportedException("Cloning is not allowed on this signleton java class");
	}
	
	/*//solving cloning problem of singleton  (not recomanded)
		@Override
		public   Object clone()throws CloneNotSupportedException {
			//return  INSTANCE;
			return this;
		}*/
	
	

}
