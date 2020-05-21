package com.nt.builder;

import com.nt.foundation.ConcreteFoundation;
import com.nt.interior.WoodenInterior;
import com.nt.product.House;
import com.nt.roofing.ConcreteSlabRoofing;
import com.nt.structure.ConcreteAndSteelStructure;

public class ConcreteAndBrickHouseBuilder implements HouseBuilder {
	private House house;
	
	

	public ConcreteAndBrickHouseBuilder(House house) {
		System.out.println("ConcreteAndBrickHouseBuilder:1 -param constructor");
		this.house = house;
	}

	@Override
	public void buildBasement() {
		house.setFoundation(new ConcreteFoundation());
	}

	@Override
	public void buildStructure() {
		house.setStructure(new ConcreteAndSteelStructure());
	}

	@Override
	public void buildRoofing() {
		house.setRoofing(new ConcreteSlabRoofing());
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
