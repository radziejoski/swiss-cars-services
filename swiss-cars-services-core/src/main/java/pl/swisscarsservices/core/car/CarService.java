package pl.swisscarsservices.core.car;

public interface CarService {

    Iterable<Car> findAll();

    Car getById(Long id);
}
