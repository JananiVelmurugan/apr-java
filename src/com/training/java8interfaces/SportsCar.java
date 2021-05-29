package com.training.java8interfaces;

public class SportsCar implements Car {

	@Override
	public void drive() {
		System.out.println("Driving sports car");

	}

	@Override
	public void start() {
		Car.super.start();
	}

	@Override
	public void start(String key) {
		Car.super.start(key);
	}

	
	public void stop() {
		System.out.println("Stopping a sports car");
	}

}
