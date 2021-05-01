package com.training.methods;

public class Car {

	private String model;
	private int speed;
	private float price;

	public Car() {
		this("FORD",100);
		System.out.println("default constructor");
	}

	public Car(String model, int speed) {
//		this();
		this.model = model;
		this.speed = speed;
	}

	public Car(String model, int speed, float price) {
		this.model = model;
		this.speed = speed;
		this.price = price;
	}

	public Car(String model, float price) {
		this.model = model;
		this.price = price;
	}

	public Car(int speed, float price) {
		this.speed = speed;
		this.price = price;
	}
	public void setModel(String model) {
		if (model == null) {
			System.out.println("Invalid Model");
		} else {
			this.model = model;
		}
	}

	public String getModel() {
		return model;
	}

	public void setSpeed(int speed) {
		if (speed <= 0) {
			System.out.println("Invalid Speed");
		} else {
			this.speed = speed;
		}

	}

	public int getSpeed() {
		return speed;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public float getPrice() {
		return price;
	}

	@Override
	public String toString() {
		return "Car [model=" + model + ", speed=" + speed + ", price=" + price + "]";
	}
	
	public void drive() {
		System.out.println("Undefined Car");
	}

//	public String toString() {
//		return model + ":" + speed;
//	}
}
