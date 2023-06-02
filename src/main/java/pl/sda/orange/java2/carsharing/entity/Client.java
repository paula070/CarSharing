package pl.sda.orange.java2.carsharing.entity;

import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import pl.sda.orange.java2.carsharing.api.AuthDataDto;

import javax.persistence.*;

//@RequiredArgsConstructor
@EqualsAndHashCode
@Builder
@Getter
@Entity
@Table(name = "clients")
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String firstName;

    private String lastName;

    private String email;

    private String password;

    private String username;


    public Client(Long id, String firstName, String lastName, String email, String password) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.username = username; // dodac
        this.password = password;
    }
    public Client withPassword(String newPassword) {
        return Client
                .builder()
                .username(username)
                .password(newPassword)
                .build();
    }

    public AuthDataDto toAuthDataDto(){
        return new AuthDataDto(username, firstName, lastName );

    }

    public Client() {
    }

    public Long getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }


    public String getPassword() {
        return password;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}