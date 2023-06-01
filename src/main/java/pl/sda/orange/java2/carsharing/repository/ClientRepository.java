package pl.sda.orange.java2.carsharing.repository;

import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Repository;
import pl.sda.orange.java2.carsharing.entity.Client;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@Repository
public class ClientRepository {


    private final IClientRepository clientRepository;

    public List<Client> getAllClient() {
        return clientRepository.findAll();
    }

    public void saveClient(Client client) {
        clientRepository.save(client);
    }

    public Optional<Client> getClientById(Long id) {
        return clientRepository.findById(id);
    }
}
