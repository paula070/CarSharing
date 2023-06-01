package pl.sda.orange.java2.carsharing.entity;

import org.springframework.boot.info.GitProperties;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Rental {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private double cost;

    public Samochód getCar() {
        return null;
    }
}
