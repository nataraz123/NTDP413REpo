package com.nt.factory;

import com.nt.tyre.ApolloTyre;
import com.nt.tyre.MRFTyre;
import com.nt.tyre.MechallinTyre;
import com.nt.tyre.Tyre;
import com.nt.vehicle.Car;
import com.nt.vehicle.LuxoryCar;
import com.nt.vehicle.SportsCar;
import com.nt.vehicle.StandardCar;

public class CarFactory {
	
	//static factory method having factory pattern logic
	public  static  Car getCarInstance(String carType) {
		Car car=null;
		Tyre tyre=null;
		if(carType.equalsIgnoreCase(CarType.TYPE_STANDARD)) {
			tyre=new ApolloTyre();
			car=new StandardCar(tyre);
		}
		else if(carType.equalsIgnoreCase(CarType.TYPE_LUXORY)) {
			tyre=new MechallinTyre();
			car=new LuxoryCar(tyre);
		}
		else if(carType.equalsIgnoreCase(CarType.TYPE_SPORTS)) {
			tyre=new MRFTyre();
			car=new SportsCar(tyre);
		}
		else {
			throw new IllegalArgumentException("invalid Car type");
		}
			
			return car;
		
	}//method

}//class
