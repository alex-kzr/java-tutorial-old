package com.alexkozyura.carmanager;

public class CarManager {

	public static void main(String[] args) {

		Car prius = new Car("Toyota", 2008, 15000, 1200, Color.GREY);

		Car laguna = new Car();
		laguna.mark = "Renault";
		laguna.color = Color.WHITE;
		laguna.yearOfProduction = 2000;
		laguna.weigth = 2000;
		laguna.price = 9700;
		
		System.out.println(prius);
		System.out.println(laguna);
		
		Car prius2 = new Car("Toyota", 2008, 15000, 1200, Color.GREY);
		
		System.out.println(prius.equals(prius2));
		System.out.println(prius.equals(laguna));
	}
}
