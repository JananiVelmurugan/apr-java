package com.training.abstractdemo;

public abstract class Car {

	// abstract method - method declaration - hiding method implementation
	abstract void start();
	
	// concrete method - method implementation
	void drive() {
		System.out.println("Drive cannot be defined");
	}
	
}
