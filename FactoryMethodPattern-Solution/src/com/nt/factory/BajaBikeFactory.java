package com.nt.factory;

import com.nt.bike.BajajBike;

public abstract class BajaBikeFactory {
	public abstract  void  paint();
	public abstract  void  assemble();
	public abstract  void roadTest();
	public abstract  void  oiling();
	public abstract  BajajBike  buildBike(String model);
	
	public  BajajBike  manifactureBike(String model) {
		BajajBike bike=null;
		//get Bike
		bike=buildBike(model);
		paint();
		assemble();
		roadTest();
		oiling();
		return bike;
	}


}
