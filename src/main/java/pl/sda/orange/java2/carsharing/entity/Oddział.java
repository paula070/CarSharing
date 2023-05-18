package pl.sda.orange.java2.carsharing.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Oddział {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String adres;

    private String miasto;

    @OneToMany
    private List<Pracownik> pracownicy;

    @OneToMany
    private List<Samochód> dostepneAuta;

    public Oddział() {
        pracownicy = new ArrayList<>();
        dostepneAuta = new ArrayList<>();
    }

    // Dodaj konstruktor, gettery i settery dla wszystkich pól

    public void dodajPracownika(Pracownik pracownik) {
        pracownicy.add(pracownik);
    }

    public void usunPracownika(Pracownik pracownik) {
        pracownicy.remove(pracownik);
    }

    public void dodajDostepneAuto(Samochód samochód) {
        dostepneAuta.add(samochód);
    }

    public void usunDostepneAuto(Samochód samochód) {
        dostepneAuta.remove(samochód);
    }
}