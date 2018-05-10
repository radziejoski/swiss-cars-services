package pl.swisscarsservices.core.car;

import javax.persistence.*;
import java.io.Serializable;

//@Getter
//@Setter
//@EqualsAndHashCode
@Entity
@Table(schema = "swiss_cars", name = "car")
public class Car implements Serializable {
    private static final long serialVersionUID = -7760260277828000107L;

    @Id
    @SequenceGenerator(name = "car_id_seq_gen", sequenceName = "car_id_seq", allocationSize = 1)
    @GeneratedValue(generator = "car_id_seq_gen", strategy = GenerationType.SEQUENCE)
    private Long id;

    @Column(name = "mark", nullable = false)
    private String mark;

    @Column(name = "model", nullable = false)
    private String model;

    @Column(name = "year_book", nullable = false)
    private String yearBook;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getYearBook() {
        return yearBook;
    }

    public void setYearBook(String yearBook) {
        this.yearBook = yearBook;
    }
}
