package com.training.java8interfaces;

@FunctionalInterface
public interface Car {
	// SAM
	void drive();

	default void start() {
		System.out.println("Starting a car");
	}
	default void start(String key) {
		System.out.println("Starting a car with key");
	}
	
	static void stop() {
		System.out.println("Stopping a car");
	}
	
	static void stop(String key) {
		System.out.println("Stopping a car");
	}
}
