package com.nt.test;

import com.nt.tyre.ApolloTyre;
import com.nt.tyre.MRFTyre;
import com.nt.tyre.MechallinTyre;
import com.nt.tyre.Tyre;
import com.nt.vehicle.Car;
import com.nt.vehicle.LuxoryCar;
import com.nt.vehicle.SportsCar;
import com.nt.vehicle.StandardCar;

public class CarDealer3 {

	public static void main(String[] args) {
		System.out.println("Budget car Dealear");
		Tyre tyre=null;
		Car car=null;
		
		tyre=new ApolloTyre();
		car=new StandardCar(tyre);
		car.roadTest();

	}

}
