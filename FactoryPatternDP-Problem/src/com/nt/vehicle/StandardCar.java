package com.nt.vehicle;

import com.nt.tyre.Tyre;

public class StandardCar implements Car {
	private Tyre tyre;
	
	public  StandardCar(Tyre tyre) {
		System.out.println("StandardCar:: 1-param constructor");
		this.tyre=tyre;
	}

	@Override
	public void roadTest() {
		System.out.println("Driving Standard Car having "+tyre.info());

	}

}
