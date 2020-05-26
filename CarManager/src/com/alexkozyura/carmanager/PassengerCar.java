package com.alexkozyura.carmanager;

public class PassengerCar extends Car {

	public PassengerCar(String mark, int yearOfProduction, int price, int weigth, Color color) {
		super(mark, yearOfProduction, price, weigth, color);
		
	}
	
	@Override
	public boolean isReadyToService() {
		if (distanceOnService > 10000) {
			return true;
		} else {
			return false;
		}
	}
}
