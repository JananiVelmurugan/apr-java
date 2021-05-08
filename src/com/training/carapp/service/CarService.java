package com.training.carapp.service;

import java.util.Map;

import com.training.carapp.exception.CarNotFoundException;
import com.training.carapp.model.Car;
import com.training.carapp.repository.CarRepository;

public class CarService {

	private CarRepository carRepository;

	public CarService() {
		carRepository = new CarRepository();
	}

	public void createCar(Car car) {
		carRepository.add(car);
	}

//	public Set<Car> findAllCars() {
//		return carRepository.findAll();
//	}

	public Map<Integer, Car> findAllCars() {
		return carRepository.findAll();
	}

	public Car findCarById(int id) throws CarNotFoundException {
		Car car = carRepository.findById(id);
		if (car == null) {
			throw new CarNotFoundException("Car is not found");
		} else {
			return car;
		}
	}

	public void updateCar(int id, Car car) {
		carRepository.update(id, car);
	}

	public void deleteCar(int id) {
		carRepository.delete(id);
	}
}
