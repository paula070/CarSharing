package pl.sda.orange.java2.carsharing.service;

import lombok.val;
import org.springframework.stereotype.Component;
import pl.sda.orange.java2.carsharing.api.UserDto;
import pl.sda.orange.java2.carsharing.entity.User;



@Component
public class UserConverter {

    public UserDto map(User entity) {
        val dto = new UserDto();
        dto.setId(entity.getId());
        //dto.setUsername(entity.getUsername());
        return dto;
    }
}