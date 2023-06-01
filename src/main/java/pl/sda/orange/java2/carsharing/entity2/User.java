package pl.sda.orange.java2.carsharing.entity2;

import lombok.Data;
import pl.sda.orange.java2.carsharing.entity2.ToDo;

import javax.persistence.*;
import java.util.Set;

@Entity
@Data
@Table(name = "\"User\"")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String login;

    private String passwordHash;


    @OneToMany(cascade = CascadeType.ALL, mappedBy = "owner", fetch = FetchType.LAZY, orphanRemoval = true)
    private Set<ToDo> tasks;
}
