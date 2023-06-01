package pl.sda.orange.java2.carsharing.api;

import com.fasterxml.jackson.annotation.JsonCreator;
import lombok.Data;

@Data
public class CreateToDoDto {

    }

    @JsonCreator
    public CreateTodoDto(String name, String details) {
        this.name = name;
        this.details = details;
    }
}
