package pl.sda.orange.java2.carsharing;

public class StatusSamochodu {
    private String nazwa;
    private String opis;

    public StatusSamochodu() {
    }

    public StatusSamochodu(String nazwa, String opis) {
        this.nazwa = nazwa;
        this.opis = opis;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public String getOpis() {
        return opis;
    }

    public void setOpis(String opis) {
        this.opis = opis;
    }

    // Przeciążenie metody toString() (opcjonalnie)

    @Override
    public String toString() {
        return "StatusSamochodu{" +
                "nazwa='" + nazwa + '\'' +
                ", opis='" + opis + '\'' +
                '}';
    }
}
