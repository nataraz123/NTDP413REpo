package com.nt.vehicle;

import com.nt.tyre.Tyre;

public class LuxoryCar implements Car {
	private Tyre tyre;
	
	public  LuxoryCar(Tyre tyre) {
		System.out.println("LuxoryCar::1 -param constructor");
		this.tyre=tyre;
	}

	@Override
	public void roadTest() {
		System.out.println("Driving Luxory Car having "+tyre.info());

	}

}
