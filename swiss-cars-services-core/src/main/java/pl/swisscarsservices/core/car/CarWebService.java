package pl.swisscarsservices.core.car;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class CarWebService {

    @Autowired
    private CarService carService;

    @ResponseBody
    @RequestMapping(value = "/getAll", method = RequestMethod.GET)
    public ResponseEntity<List<Car>> getAll() {
        List<Car> cars = new ArrayList<>();
        carService.findAll().forEach(cars::add);
        return new ResponseEntity<>(cars, HttpStatus.OK);
    }

    @RequestMapping(value = "/getById/{id}", method = RequestMethod.GET)
    public ResponseEntity<Car> getById(@PathVariable Long id) {
        Car car = carService.getById(id);
        return new ResponseEntity<>(car, HttpStatus.OK);
    }

}