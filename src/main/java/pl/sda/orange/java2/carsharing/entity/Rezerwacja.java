package pl.sda.orange.java2.carsharing.entity;

import javax.persistence.*;
import java.time.LocalDate;
public class Rezerwacja {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDate dataRezerwacji;
    private LocalDate dataOd;
    private LocalDate dataDo;
    private double kwota;

    @ManyToOne
    private Klient klient;

    @ManyToOne
    private Samochód samochód;

    @ManyToOne
    private Oddział oddziałWypożyczenia;

    @ManyToOne
    private Oddział oddziałZwrotu;

    // Gettery, settery i inne metody
}
