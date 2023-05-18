package pl.sda.orange.java2.carsharing.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Samochód {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String marka;
    private String model;
    private String typNadwozia;
    private int rocznik;
    private String kolor;
    private int przebieg;
    private double kwota;

    public Samochód() {
    }

    public Samochód(String marka, String model, String typNadwozia, int rocznik, String kolor, int przebieg, double kwota) {
        this.marka = marka;
        this.model = model;
        this.typNadwozia = typNadwozia;
        this.rocznik = rocznik;
        this.kolor = kolor;
        this.przebieg = przebieg;
        this.kwota = kwota;
    }


    public void setMarka(String marka) {
        this.marka = marka;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setTypNadwozia(String typNadwozia) {
        this.typNadwozia = typNadwozia;
    }

    public void setRocznik(int rocznik) {
        this.rocznik = rocznik;
    }

    public void setKolor(String kolor) {
        this.kolor = kolor;
    }

    public void setPrzebieg(int przebieg) {
        this.przebieg = przebieg;
    }

    public void setKwota(double kwota) {
        this.kwota = kwota;
    }

    public String getMarka() {
        return marka;
    }

    public String getModel() {
        return model;
    }

    public double getKwota() {
        return kwota;
    }

    public String getTypNadwozia() {
        return typNadwozia;
    }

    public int getRocznik() {
        return rocznik;
    }

    public String getKolor() {
        return kolor;
    }

    public int getPrzebieg() {
        return przebieg;
    }
    public void wypożyczSamochód() {
        // Logika wypożyczania samochodu
    }

    public void zwrotSamochodu() {
        // Logika zwrotu samochodu
    }

    // Przeciążenie metody toString() (opcjonalnie)

    @Override
    public String toString() {
        return "Samochód{" +
                "id=" + id +
                ", marka='" + marka + '\'' +
                ", model='" + model + '\'' +
                ", typNadwozia='" + typNadwozia + '\'' +
                ", rocznik=" + rocznik +
                ", kolor='" + kolor + '\'' +
                ", przebieg=" + przebieg +
                ", kwota=" + kwota +
                '}';
    }
}
