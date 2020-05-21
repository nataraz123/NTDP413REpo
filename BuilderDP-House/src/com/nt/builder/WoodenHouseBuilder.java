package com.nt.builder;

import com.nt.foundation.ConcreteFoundation;
import com.nt.foundation.WoodenFoundation;
import com.nt.interior.WoodenInterior;
import com.nt.product.House;
import com.nt.roofing.ConcreteSlabRoofing;
import com.nt.roofing.WoodenRoofing;
import com.nt.structure.ConcreteAndSteelStructure;
import com.nt.structure.WoodenStructure;

public class WoodenHouseBuilder implements HouseBuilder {
	private House house;
	
	

	public WoodenHouseBuilder(House house) {
		System.out.println("WoodenHouseBuilder:1 -param constructor");
		this.house = house;
	}

	@Override
	public void buildBasement() {
		house.setFoundation(new WoodenFoundation());
	}

	@Override
	public void buildStructure() {
		house.setStructure(new WoodenStructure());
	}

	@Override
	public void buildRoofing() {
		house.setRoofing(new WoodenRoofing());
	}

	@Override
	public void buildInterior() {
		house.setInterior(new WoodenInterior());

	}

	@Override
	public House buildHouse() {
		return house;
	}

}
