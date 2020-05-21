package com.nt.factory;

import javax.print.attribute.standard.MediaSize.Engineering;

import com.nt.builder.ConcreteAndBrickHouseBuilder;
import com.nt.builder.HouseBuilder;
import com.nt.builder.IglooHouseBuilder;
import com.nt.builder.MarbleHouseBuilder;
import com.nt.builder.WoodenHouseBuilder;
import com.nt.director.CivilEngineer;
import com.nt.product.House;

public class HouseFactory {
	
	
	public  static House    getInstance(String houseType) {
		CivilEngineer engineer=null;
		HouseBuilder builder=null;
		House house=null;
		if(houseType.equalsIgnoreCase("concrete")) {
			builder=new ConcreteAndBrickHouseBuilder(new House());
		}
		else if(houseType.equalsIgnoreCase("wooden"))
			builder=new  WoodenHouseBuilder(new House());
		else if(houseType.equalsIgnoreCase("igloo"))
			builder=new IglooHouseBuilder(new House());
		else if(houseType.equalsIgnoreCase("stone"))
			builder=new MarbleHouseBuilder(new House());
		else
			throw new IllegalArgumentException("Invalid HouseType");
		
		engineer=new CivilEngineer(builder);
		house=engineer.constructHouse();
		return house;
	}

}
