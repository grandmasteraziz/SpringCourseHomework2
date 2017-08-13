package com.koddata.rentacar.service;

import com.koddata.rentacar.model.Car;
import com.koddata.rentacar.repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarService {


    private CarRepository carRepository;

    public CarService() {
    }

    @Autowired
    public CarService(CarRepository carRepository) {

        this.carRepository = carRepository;
    }


    public List<Car> getAllCar()
    {
        List<Car> cars = new ArrayList<>();
        carRepository.findAll().forEach(cars::add);

        return cars;
    }

    public void addCar(Car car)
    {
        carRepository.save(car);
    }



}
