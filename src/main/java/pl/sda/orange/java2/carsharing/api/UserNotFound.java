package pl.sda.orange.java2.carsharing.api;

import lombok.Value;

    @Value
    public class UserNotFound extends RuntimeException {

        private final int id;
    }