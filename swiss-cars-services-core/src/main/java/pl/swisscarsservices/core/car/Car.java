package pl.swisscarsservices.core.car;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Car {
    private Long id;
    private String mark;
    private String model;
    private String yearBook;

    public Car(){}

    public Car(Long id, String mark, String model, String yearBook)
    {
        this.id = id;
        this.mark = mark;
        this.model = model;
        this.yearBook = yearBook;
    }
}
