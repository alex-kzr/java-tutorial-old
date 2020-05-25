package com.alexkozyura.carmanager;

public class CarManager {

	public static void main(String[] args) {

		PassengerCar prius = new PassengerCar("Toyota", 2008, 15000, 1200, Color.GREY);

		prius.addDistance(15000);
		
		Bus laguna = new Bus("Renault", 2000, 9700, 2000, Color.WHITE);
		
		prius.addDistance(15000);
		
		System.out.println(prius);
		System.out.println(laguna);

		Car prius2 = new Car("Toyota", 2008, 15000, 1200, Color.GREY);

		System.out.println(prius.equals(prius2));
		System.out.println(prius.equals(laguna));

	}
}
