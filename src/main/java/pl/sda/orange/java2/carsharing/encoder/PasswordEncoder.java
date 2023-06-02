package pl.sda.orange.java2.carsharing.encoder;

public interface PasswordEncoder {
    String encode(String text);
    boolean check(String text, String hased); //sprawdzanie czy haslo podawane do logowania jest prawidlowe
}
