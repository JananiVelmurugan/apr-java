package com.training.collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

import com.training.methods.Car;

public class CollectionDemo {
	public static void main(String[] args) {
//		ArrayList numbers = new ArrayList<>();
//		numbers.add("Arun");
//		numbers.add(12);
//		numbers.add(false);
//		for(Object t : numbers) {
//			
//		}
//		System.out.println(numbers);

		ArrayList<String> list = new ArrayList<>();
		list.add("Arun");
		list.add("Sumitha");
		list.add("Vignesh");
		System.out.println(list);

		ArrayList<Car> carList = new ArrayList<>();
		carList.add(new Car("FORD", 123));
		carList.add(new Car("AUDI", 234));
		carList.add(new Car("BMW", 345));
		System.out.println(carList);
		for (Car car : carList) {
			String name = car.getModel();
			if (name.equalsIgnoreCase("audi")) {
				System.out.println("Found Audi");
			}
		}

		HashSet<String> set = new HashSet<>();
		set.add("Arun");
		set.add("Sumitha");
		set.add("Vignesh");
		set.add("Arun");
		set.add("Vignesh");
		System.out.println(set);

		HashMap<String, String> map = new HashMap<>();
		map.put("Arun", "Anthoni");
		map.put("Sumitha", "Velmani");
		map.put("Vignesh", "R");
		System.out.println(map);

	}
}
