package com.nt.factory;

import com.nt.bike.BajajBike;
import com.nt.bike.BajajDiscover;
import com.nt.bike.BajajPlatina;
import com.nt.bike.BajajPulsor;

public class ChennaiBajajBikeFactory {
	
	public static void paint() {
		System.out.println("Painiting bike");
	}
	public static void  assemble() {
		System.out.println("Assembling the bike");
	}
	
	public static  void roadTest() {
		System.out.println("roadTesting  the bike");
	}
	
	public static  void oiling() {
		System.out.println("oiling  the bike");
	}
	
	
	public   static BajajBike  buildBike(String model) {
		BajajBike bike=null;
		if(model.equalsIgnoreCase("pulsor")) {
			bike=new BajajPulsor();
			System.out.println("Creating pulsor bike");
		}
		else if(model.equalsIgnoreCase("discover")) {
			bike=new BajajDiscover();
			System.out.println("Creating discover bike");
		}
		else if(model.equalsIgnoreCase("platina")) {
			bike=new BajajPlatina();
			System.out.println("Creating platina bike");
		}
		else {
			throw new IllegalArgumentException("invalid bike ");
		}
		  paint();
		assemble();
	     roadTest();
	     oiling();
	   return bike;
		
	}

}
