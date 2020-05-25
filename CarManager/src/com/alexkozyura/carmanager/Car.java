package com.alexkozyura.carmanager;

public class Car {

	String mark;
	int yearOfProduction;
	int price;
	int weigth;
	String color;

	public Car(String mark, int yearOfProduction, int price, int weigth, String color) {
		this.mark = mark;
		this.yearOfProduction = yearOfProduction;
		this.price = price;
		this.weigth = weigth;
		this.color = color;
	}

	public Car() {
	}

	@Override
	public String toString() {
		return "Car [mark=" + mark + ", yearOfProduction=" + yearOfProduction + ", price=" + price + ", weigth="
				+ weigth + ", color=" + color + "]";
	}
}
