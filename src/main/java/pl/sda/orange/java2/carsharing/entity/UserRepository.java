package pl.sda.orange.java2.carsharing.entity;

import org.springframework.data.jpa.repository.JpaRepository;


import java.util.Set;

    public interface UserRepository extends JpaRepository<User, Integer> {

        Set<User>findByEmail(String email);
    }


