package pl.sda.orange.java2.carsharing.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.sda.orange.java2.carsharing.entity.Client;

public interface IClientRepository extends JpaRepository<Client, Long> {
}
