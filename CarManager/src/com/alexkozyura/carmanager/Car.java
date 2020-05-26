package com.alexkozyura.carmanager;

public abstract class Car {

	String mark;
	int yearOfProduction;
	int price;
	int weigth;
	Color color;
	private int distance = 0;
	protected int distanceOnService = 0;

	public Car(String mark, int yearOfProduction, int price, int weigth, Color color) {
		this.mark = mark;
		this.yearOfProduction = yearOfProduction;
		this.price = price;
		this.weigth = weigth;
		this.color = color;
	}

	public Car() {
	}

	public void addDistance(int additionalDistance) {
		distance += additionalDistance;
		distanceOnService += additionalDistance;
	}

	public void addDistance(double additionalDistance) {
		distance += additionalDistance;
		distanceOnService += additionalDistance;
	}

	public int getDistance() {
		return distance;
	}

	public int getDistanceOnService() {
		return distanceOnService;
	}

	public abstract boolean isReadyToService();

	@Override
	public String toString() {
		return "Car [mark=" + mark + ", yearOfProduction=" + yearOfProduction + ", price=" + price + ", weigth="
				+ weigth + ", color=" + color + ", distance=" + distance + ", distanceOnService=" + distanceOnService
				+ ", isReadyToService()=" + isReadyToService() + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((color == null) ? 0 : color.hashCode());
		result = prime * result + ((mark == null) ? 0 : mark.hashCode());
		result = prime * result + price;
		result = prime * result + weigth;
		result = prime * result + yearOfProduction;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Car other = (Car) obj;
		if (color != other.color)
			return false;
		if (mark == null) {
			if (other.mark != null)
				return false;
		} else if (!mark.equals(other.mark))
			return false;
		if (price != other.price)
			return false;
		if (weigth != other.weigth)
			return false;
		if (yearOfProduction != other.yearOfProduction)
			return false;
		return true;
	}

}
