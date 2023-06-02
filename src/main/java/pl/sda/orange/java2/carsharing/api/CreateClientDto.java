package pl.sda.orange.java2.carsharing.api;

import pl.sda.orange.java2.carsharing.entity.Client;

public record CreateClientDto(String username, String password) {
    public Client toCLient() {
        return Client
                .builder()
                .username(username)
                .password(password)
                .build();

    }
}
