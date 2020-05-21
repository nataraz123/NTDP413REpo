package com.nt.test;

import com.nt.factory.HouseFactory;
import com.nt.product.House;

public class BuidlerDPTest1 {
	public static void main(String[] args) {
		House house=null; 
		System.out.println("BuidlerDPTest.main()");
		//get Proudct object
		house=HouseFactory.getInstance("concrete");
		System.out.println(house);
		 
	}

}
