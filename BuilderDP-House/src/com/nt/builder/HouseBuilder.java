package com.nt.builder;
//Builder interface
import com.nt.product.House;

public interface HouseBuilder {
	public  void buildBasement();
	public  void buildStructure();
	public  void buildRoofing();
	public  void buildInterior();
	public House buildHouse();
	

}
