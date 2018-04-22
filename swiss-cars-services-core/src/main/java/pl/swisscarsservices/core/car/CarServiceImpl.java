package pl.swisscarsservices.core.car;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
@Transactional
public class CarServiceImpl implements CarService{

    @Override
    public List<Car> search() {
        return createCarList();
    }

    private static List<Car> createCarList()
    {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car(1L, "Opel", "Corsa", "2002"));
        cars.add(new Car(2L, "Ford", "Mustang", "1974"));
        cars.add(new Car(3L, "BMW", "E39", "1999"));

        return cars;
    }

}
