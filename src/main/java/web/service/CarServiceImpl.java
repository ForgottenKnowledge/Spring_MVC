package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CarServiceImpl implements CarService {

    @Override
    public List<Car> getCarsList(int number) {
        List<Car> allCars = new ArrayList<>();
        allCars.add(new Car("Красный", "Жигуль", 111));
        allCars.add(new Car("Синий", "Жигуль", 222));
        allCars.add(new Car("Желтый", "Жигуль", 333));
        allCars.add(new Car("Зеленый", "Жигуль", 444));
        allCars.add(new Car("Черный", "Жигуль", 555));
        return allCars.stream().limit(number).collect(Collectors.toList());
    }
}