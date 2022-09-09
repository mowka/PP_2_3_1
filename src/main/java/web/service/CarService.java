package web.service;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.List;


public interface CarService {
    public List<Car> getCarList(int numberOfCars);
}
