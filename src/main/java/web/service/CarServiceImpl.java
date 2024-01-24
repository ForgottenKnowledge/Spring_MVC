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
        allCars.add(new Car("�������", "������", 111));
        allCars.add(new Car("�����", "������", 222));
        allCars.add(new Car("������", "������", 333));
        allCars.add(new Car("�������", "������", 444));
        allCars.add(new Car("������", "������", 555));
        return allCars.stream().limit(number).collect(Collectors.toList());
    }
}