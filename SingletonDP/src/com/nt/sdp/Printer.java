package com.nt.sdp;

import com.nt.commons.CommonsUtil;

public class Printer  extends  CommonsUtil {
	//private static Printer INSTANCE=new Printer();  //eager Instantiation  (wrong pratice)
	private static Printer INSTANCE;
	private static final  long serialVersionUID=345L;
	private static boolean flag=false;
	
	/*static {
		INSTANCE=new Printer(); //eager Instantiation  (wrong pratice)
	}*/
	
	
	//private constructor
	private  Printer() {
		if(flag==true)
			  throw new IllegalArgumentException("Object already created...");
		flag=true;
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
	   if(INSTANCE==null) {			//1st NULL check
			 synchronized (Printer.class) {
				if(INSTANCE==null) //2nd NULL check
					INSTANCE=new Printer();  //Lazy Instantiation  Good Pratice
			 }//synchroized
	     }//if
				return INSTANCE;
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
			return  INSTANCE;
			
		}*/
	
	
	/*   //solving DeSerialization Problem of singleton class (not recomanded)
	 public    Object  readResolve() {
	   System.out.println("Printer.readResolve()");
	  // return  this;
	   return  INSTANCE;
	   
	 }*/
	 
	 
	   //solving DeSerialization Problem of singleton class ( recomanded)
		 public    Object  readResolve() {
			 System.out.println("Printer.readResolve()");
		  throw new IllegalArgumentException("Printer do not want to support Deserilziation");
		   
		 }
		
	
	

}
