package pl.sda.orange.java2.carsharing.api;

import lombok.Value;

@Value
public class TodoOwnerNotFound extends RuntimeException {


    private final int id;

    private final int ownerId;
}
