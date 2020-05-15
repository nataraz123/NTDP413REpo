package com.nt.test;

import com.nt.bike.BajajBike;
import com.nt.factory.NagpurBajajBikeFactory;

public class NorthCustomer {
	public static void main(String[] args) {
		BajajBike bike=null;
		//get Bike
		bike=NagpurBajajBikeFactory.buildBike("pulsor");
		bike.drive();
 
		
	}
	
}
