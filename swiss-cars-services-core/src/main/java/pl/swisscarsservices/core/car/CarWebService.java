package pl.swisscarsservices.core.car;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CarWebService {

    @Autowired
    private CarService carService;

    @RequestMapping(value = "/getAll", method = RequestMethod.GET)
    public ResponseEntity<List<Car>> getAll()
    {
        List<Car> cars = carService.search();
        return new ResponseEntity<>(cars, HttpStatus.OK);
    }
}
