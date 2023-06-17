package pl.sda.orange.java2.carsharing.entity;

import jakarta.persistence.*;
import lombok.Data;


@Entity
@Data
@Table(name = "\"User\"")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String email;

    private String password;

    private String firstName;

    private String lastName;

    private UserType type;
}
