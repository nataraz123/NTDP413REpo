package com.nt.test;

import com.nt.factory.CarFactory;
import com.nt.tyre.MechallinTyre;
import com.nt.tyre.Tyre;
import com.nt.vehicle.Car;
import com.nt.vehicle.LuxoryCar;

public class CarDealer1 {

	public static void main(String[] args) {
		System.out.println("Luxory car Dealear");
		Car car=null;
		//get Instance
		car=CarFactory.getCarInstance("luxory");
		car.roadTest();
				
		
		

	}

}
