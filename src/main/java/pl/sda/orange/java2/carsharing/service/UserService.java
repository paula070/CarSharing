package pl.sda.orange.java2.carsharing.service;


import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import lombok.val;

import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import pl.sda.orange.java2.carsharing.api.UserDto;
import pl.sda.orange.java2.carsharing.api.EmailAlreadyTaken;
import pl.sda.orange.java2.carsharing.entity.User;
import pl.sda.orange.java2.carsharing.entity.UserRepository;

import static sun.awt.image.MultiResolutionCachedImage.map;

@Service
@Transactional
@RequiredArgsConstructor
public class UserService {

    private final UserRepository repository;

   // private final UserConverter converter;

    private final PasswordEncoder passwordEncoder;

//    public Optional<UserDto> getOne(int id) {
//        return repository.findById(id).map(converter::map);
//    }
//
//    public Page<UserDto> find(PageRequest page) {
//        return repository.findAll(page).map(converter::map);
//    }

    public UserDto register(String email, String password) {
        if (repository.findByEmail(email).isPresent()) {
            throw new EmailAlreadyTaken(email);
        }

        val user = new User();
        user.setEmail(email);
        user.setPassword(passwordEncoder.encode(password));
        return map(repository.saveAndFlush(user));
    }
}
