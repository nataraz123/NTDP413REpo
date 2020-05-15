package com.nt.test;

import com.nt.bike.BajajBike;
import com.nt.factory.BajaBikeFactory;
import com.nt.factory.NagpurBajajBikeFactory;

public class NorthCustomer {
	public static void main(String[] args) {
		System.out.println("North Customer ............");
		BajaBikeFactory factory=null;
		BajajBike bike=null;
		//get Bike
		factory=new NagpurBajajBikeFactory();
		bike=factory.manifactureBike("pulsor");
		bike.drive();
		
 
		
	}
	
}
