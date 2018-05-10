package pl.swisscarsservices.core.car;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class CarServiceImpl implements CarService {

    @Autowired
    private CarRepository carRepository;

    @Override
    public Iterable<Car> findAll() {
        return carRepository.findAll();
    }

    @Override
    public Car getById(Long id) {
        return carRepository.findOne(id);
    }

}
