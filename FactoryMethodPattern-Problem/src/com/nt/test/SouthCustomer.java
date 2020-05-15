package com.nt.test;

import com.nt.bike.BajajBike;
import com.nt.factory.ChennaiBajajBikeFactory;
import com.nt.factory.NagpurBajajBikeFactory;

public class SouthCustomer {
	public static void main(String[] args) {
		BajajBike bike=null;
		//get Bike
		bike=ChennaiBajajBikeFactory.buildBike("pulsor");
		bike.drive();
 
		
	}
	
}
