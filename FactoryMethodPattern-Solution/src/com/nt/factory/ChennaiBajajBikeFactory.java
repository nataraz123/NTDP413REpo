package com.nt.factory;

import com.nt.bike.BajajBike;
import com.nt.bike.BajajDiscover;
import com.nt.bike.BajajPlatina;
import com.nt.bike.BajajPulsor;

public class ChennaiBajajBikeFactory extends BajaBikeFactory {
	
	public  void paint() {
		System.out.println("Painiting bike");
	}
	public  void  assemble() {
		System.out.println("Assembling the bike");
	}
	
	public   void roadTest() {
		System.out.println("roadTesting  the bike");
	}
	
	public   void oiling() {
		System.out.println("oiling  the bike");
	}
	
	
	public   BajajBike  buildBike(String model) {
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
		
	   return bike;
		
	}

}
