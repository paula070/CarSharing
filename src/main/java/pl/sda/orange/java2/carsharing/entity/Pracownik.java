package pl.sda.orange.java2.carsharing.entity;

import javax.persistence.*;

@Entity
    public class Pracownik {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        private String imie;
        private String nazwisko;

        @ManyToOne
        private Oddział oddzial;

        // konstruktor, gettery, settery, etc.
    }

