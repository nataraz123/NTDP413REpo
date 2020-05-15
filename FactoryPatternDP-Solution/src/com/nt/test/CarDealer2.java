package com.nt.test;

import com.nt.factory.CarFactory;
import com.nt.tyre.MRFTyre;
import com.nt.tyre.MechallinTyre;
import com.nt.tyre.Tyre;
import com.nt.vehicle.Car;
import com.nt.vehicle.LuxoryCar;
import com.nt.vehicle.SportsCar;

public class CarDealer2 {

	public static void main(String[] args) {
		System.out.println("Sports car Dealear");
		Car car=null;
	     car=CarFactory.getCarInstance("sports");
	     car.roadTest();

	}

}
