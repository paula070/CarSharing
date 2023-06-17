package pl.sda.orange.java2.carsharing.entity;

import jakarta.persistence.*;
import lombok.Data;
import pl.sda.orange.java2.carsharing.entity.User;


@Data
@Entity
public class ToDo {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String username;

    private String details;

    @ManyToOne(optional = false)
    private User owner;
}