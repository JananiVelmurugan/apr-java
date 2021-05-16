package com.training.io;

import java.util.Scanner;

public class ScannerDemo {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the id");
		int id = scanner.nextInt();

		System.out.println("enter the name");
		String name = scanner.next();

		System.out.println(id + ":" + name);
		scanner.close();
		

	}
}
