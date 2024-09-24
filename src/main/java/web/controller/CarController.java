package web.controller;

import model.Car;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import service.CarService;
import service.CarServiceImpl;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarController {

    CarServiceImpl carService = new CarServiceImpl();

    @GetMapping(value = "/cars")
    public String getCars(@RequestParam(defaultValue = "5") int count, ModelMap model) {
        List<Car> cars = carService.getCarList(count);
        model.addAttribute("cars", cars);
        return "cars";
    }
}