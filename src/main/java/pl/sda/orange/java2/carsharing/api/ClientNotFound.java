package pl.sda.orange.java2.carsharing.api;

import lombok.Value;


    @Value
    public class ClientNotFound extends RuntimeException {

        private final int id;
    }


