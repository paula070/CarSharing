package pl.sda.orange.java2.carsharing.entity;

import javax.persistence.*;
import java.time.LocalDate;

@Entity

public class Zwrot {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDate dataZwrotu;
    private double dopłata;
    private String uwagi;

    @ManyToOne
    private Pracownik pracownik;

    @OneToOne
    private Rezerwacja rezerwacja;

    // Gettery, settery i inne metody
}
