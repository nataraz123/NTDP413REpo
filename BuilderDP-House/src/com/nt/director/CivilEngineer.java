package com.nt.director;

import com.nt.builder.HouseBuilder;
import com.nt.product.House;

public class CivilEngineer {
	private HouseBuilder builder;
	
	public CivilEngineer(HouseBuilder builder) {
		 this.builder=builder;
		 System.out.println("CivilEngineer:: 1-param constructor");
	}
	
	//defines the constructor process..
	public  House constructHouse() {
		House house=null;
		builder.buildBasement();
		builder.buildStructure();
		builder.buildRoofing();
		builder.buildInterior();
		house=builder.buildHouse();
		return house;
	}

}
