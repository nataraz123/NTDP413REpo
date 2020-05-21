package com.nt.builder;

import com.nt.foundation.ConcreteFoundation;
import com.nt.foundation.IceFoundation;
import com.nt.foundation.StoneFoundation;
import com.nt.foundation.WoodenFoundation;
import com.nt.interior.IceInterior;
import com.nt.interior.MarbleAndGraniteInterior;
import com.nt.interior.WoodenInterior;
import com.nt.product.House;
import com.nt.roofing.ConcreteSlabRoofing;
import com.nt.roofing.IceRoofing;
import com.nt.roofing.SandStoneRoofing;
import com.nt.roofing.WoodenRoofing;
import com.nt.structure.ConcreteAndSteelStructure;
import com.nt.structure.IceStructure;
import com.nt.structure.TallStoneStructure;
import com.nt.structure.WoodenStructure;

public class MarbleHouseBuilder implements HouseBuilder {
	private House house;
	
	public MarbleHouseBuilder(House house) {
		System.out.println("MarbleHouseBuilder:1 -param constructor");
		this.house = house;
	}

	@Override
	public void buildBasement() {
		house.setFoundation(new StoneFoundation());
	}

	@Override
	public void buildStructure() {
		house.setStructure(new TallStoneStructure());
	}

	@Override
	public void buildRoofing() {
		house.setRoofing(new SandStoneRoofing());
	}

	@Override
	public void buildInterior() {
		house.setInterior(new MarbleAndGraniteInterior());

	}

	@Override
	public House buildHouse() {
		return house;
	}

}
