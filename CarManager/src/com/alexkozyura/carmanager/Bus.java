package com.alexkozyura.carmanager;

public class Bus extends Car {

	public Bus(String mark, int yearOfProduction, int price, int weigth, Color color) {
		super(mark, yearOfProduction, price, weigth, color);
		
	}

	@Override
	public boolean isReadyToService() {
		if (distanceOnService > 50000) {
			return true;
		} else {
			return false;
		}
	}
	
	
}
