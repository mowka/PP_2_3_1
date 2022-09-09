package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CarServiceImpl implements CarService{

    private List<Car> carList;

    {
        carList = new ArrayList<>();
        carList.add(new Car("Tesla", 1, 17900));
        carList.add(new Car("Honda", 2, 10250));
        carList.add(new Car("Mercedes Benz", 3, 13900));
        carList.add(new Car("Opel", 4, 5400));
        carList.add(new Car("Maserati", 4, 14100));
    }

    @Override
    public List<Car> getCarList(int numberOfCars) {
        return carList.stream().limit(numberOfCars).toList();
    }
}
