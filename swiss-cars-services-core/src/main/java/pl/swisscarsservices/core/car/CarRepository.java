package pl.swisscarsservices.core.car;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarRepository extends CrudRepository<Car, Long> {

    Car save(Car persisted);

    Car findOne(Long id);

    @Override
    Iterable<Car> findAll();
}
