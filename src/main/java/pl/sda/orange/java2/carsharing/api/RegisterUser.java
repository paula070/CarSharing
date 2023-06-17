package pl.sda.orange.java2.carsharing.api;

import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class RegisterUser {

    @NotNull
    private String email;

    @NotNull
    private String password;
}
