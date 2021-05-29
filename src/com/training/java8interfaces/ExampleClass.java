package com.training.java8interfaces;

public class ExampleClass implements SampleInterface, SampleInterfaceTwo {

	@Override
	public int size() {
		return 0;
	}

	public ExampleClass() {
		getCount();
	}

	public static void main(String[] args) {
		ExampleClass example = new ExampleClass();
	}

	@Override
	public int getCount() {
		return SampleInterface.super.getCount();
	}

//	@Override
	// static methods cannot be overridden
//	public void getItems() {
//		SampleInterface.getItems();
//	}

}
