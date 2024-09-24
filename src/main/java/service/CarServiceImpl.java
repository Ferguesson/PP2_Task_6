package service;

import model.Car;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarServiceImpl implements CarService {

    private List<Car> carList = new ArrayList<>();


    public CarServiceImpl() {
        carList.add(new Car("Toyota Camry", 1989, "Silver"));
        carList.add(new Car("Ford Focus", 2008, "Black"));
        carList.add(new Car("Lada 2112", 2006, "Silver"));
        carList.add(new Car("Volkswagen Multivan", 2017, "White and Blue"));
        carList.add(new Car("Mercedes Benz S-Klasse", 2011, "Black"));
    }

    @Override
    public List<Car> getCarList() {
        return carList;
    }

    @Override
    public List<Car> getCarList(int count) {
        if (count <= 0) {
            return new ArrayList<>();
        }
        if (count > carList.size()) {
            return carList;
        }
        return carList.subList(0, count);
    }
}
