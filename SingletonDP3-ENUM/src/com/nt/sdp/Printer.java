package com.nt.sdp;

import com.nt.commons.Utility;

public enum Printer implements Utility   {
	
	INSTANCE;
	//INSTANCE1;   do not create more than one constant.. becoz for more constants more objects will be created...   
	
	//b.method
	public  void printData(String msg) {
		System.out.println(msg);
	}
	
	/*public  Object  doClone() throws CloneNotSupportedException{
		return  super.clone();
	}
	  Though u try to cloning like this..  we still get exception becoz   the clone() of 
	  java.lang.Enum class is always throwing  CloneNotSupportedException
	*/
	
	
	

}
