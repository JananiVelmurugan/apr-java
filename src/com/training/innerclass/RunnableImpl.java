package com.training.innerclass;

public class RunnableImpl implements Runnable {

	@Override
	public void run() {
		System.out.println("run method");

	}
	public static void main(String[] args) {
		Runnable runnable = new RunnableImpl();
		Thread thread = new Thread(runnable);
		thread.start();
	}

}
