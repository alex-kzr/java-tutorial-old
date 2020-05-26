package com.alexkozyura.carmanager;

import java.util.ArrayList;
import java.util.List;

public class CarManager {

	public static void main(String[] args) {

		PassengerCar prius = new PassengerCar("Toyota", 2008, 15000, 1200, Color.GREY);

		Bus laguna = new Bus("Renault", 2000, 9700, 2000, Color.WHITE);
		
		PassengerCar prius2 = new PassengerCar("Toyota", 2008, 15000, 1200, Color.GREY);
		
		List<Car> cars = new ArrayList<>();

		cars.add(prius);
		cars.add(laguna);
		cars.add(prius2);
		
		System.out.println(cars);
		
		prius.addDistance(15000);
		
		prius.addDistance(15000);
		
		System.out.println(prius);
		System.out.println(laguna);

		
		System.out.println(prius.equals(prius2));
		System.out.println(prius.equals(laguna));

	}
}
