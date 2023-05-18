package pl.sda.orange.java2.carsharing.entity;

import javax.persistence.*;
import java.time.LocalDate;

@Entity

public class Wypożyczenie {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDate dataWypożyczenia;
    private String uwagi;

    @ManyToOne
    private Pracownik pracownik;

    @OneToOne
    private Rezerwacja rezerwacja;

    // Gettery, settery i inne metody
}
