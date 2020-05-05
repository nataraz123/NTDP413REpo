package com.nt.test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.nt.sdp.Printer;

public class DeserilziationSingletonTest {
	
	public static void  serialize(Object obj) {
		ObjectOutputStream oos=null;
		try {
			//create Stream pointing to the file
			oos=new ObjectOutputStream(new FileOutputStream("E:/stud.ser"));
			oos.writeObject(obj);
			oos.flush();
			
			System.out.println("Object Serialized");
		}//try
		catch(IOException ioe) {
			ioe.printStackTrace();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			try {
			if(oos!=null)
				oos.close();
			}catch(Exception e) {
				e.printStackTrace();
			}
			
		}
	}//method
	
	public static  Object   deSerialize() {
		ObjectInputStream ois=null;
		 Object obj=null;		
		try {
			ois=new ObjectInputStream(new FileInputStream("E:/stud.ser"));
			obj=ois.readObject();
			System.out.println("DeSerialization is done");
		
		}
		catch(IOException ioe) {
			ioe.printStackTrace();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
		try {
			if(ois!=null)
				ois.close();
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		return obj;
	}//method

	public static void main(String[] args) {
		Printer p1=null;
		Printer p2=null;
		//get SingleTon object
		p1=Printer.getInstance();
		//perform Serialization
		DeserilziationSingletonTest.serialize(p1);
		System.out.println(p1.hashCode());
		try {
	    //perform DeSerilization
		p2=(Printer)DeserilziationSingletonTest.deSerialize();
		System.out.println(p1.hashCode()+"   "+p2.hashCode());
		System.out.println("p1==p2?"+(p1==p2));
		}
		catch(Exception e) {
			e.printStackTrace();
		}
				
		
		

	}

}
