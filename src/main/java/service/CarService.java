package service;

import model.Car;

import java.util.List;

public interface CarService {
    public List<Car> getCarList();
    public List<Car> getCarList(int count);
}
