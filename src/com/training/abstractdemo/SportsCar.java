package com.training.abstractdemo;

public class SportsCar extends Car {

	@Override
	void start() {
		System.out.println("I am starting a sports car");
	}

	@Override
	void drive() {
		System.out.println("I am driving a sports car");
	}
}
