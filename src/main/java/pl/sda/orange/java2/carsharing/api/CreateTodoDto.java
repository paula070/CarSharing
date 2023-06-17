package pl.sda.orange.java2.carsharing.api;

import com.fasterxml.jackson.annotation.JsonCreator;

public class CreateTodoDto {
    private String email;

    private String password;

    public CreateTodoDto() {
    }
//    public Client toCLient() {
//        return Client
//                .builder()
//                .username(toCLient().getUsername())
//                .password(toCLient().getPassword())
//                .build();
//
//    }
//    public CreateTodoDto() {
//    }

    @JsonCreator
    public CreateTodoDto(String username, String password) {
        this.email = email;
        this.password = password;
    }
}
