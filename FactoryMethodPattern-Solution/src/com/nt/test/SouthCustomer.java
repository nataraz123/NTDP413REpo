package com.nt.test;

import com.nt.bike.BajajBike;
import com.nt.factory.BajaBikeFactory;
import com.nt.factory.ChennaiBajajBikeFactory;
import com.nt.factory.NagpurBajajBikeFactory;

public class SouthCustomer {
	public static void main(String[] args) {
		System.out.println("South Customer.........");
		BajaBikeFactory factory=null;
		BajajBike bike=null;
		//get Bike
		factory=new ChennaiBajajBikeFactory();
		bike=factory.manifactureBike("pulsor");
		bike.drive();
		
 
		
	}
	
}
