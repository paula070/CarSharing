package pl.sda.orange.java2.carsharing.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pl.sda.orange.java2.carsharing.entity.Client;
import pl.sda.orange.java2.carsharing.repository.ClientRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ClientRegistrationService {
    private final ClientRepository clientRepository;

    public List<Client> getAllClient() {
        return clientRepository.getAllClient();
    }

    public void saveClient(Client client) {
        clientRepository.saveClient(client);
    }

    public void registerClient(Client client) {
    }

//    public Client getClientById(Long id) {
//        return clientRepository
//                .getClientById(id));
////                .orElseThrow(() -> new ClientNotFoundException("Client with this id does not exist"));
//    }
//    @Autowired
//    public ClientRegistrationService(ClientRepository clientRepository) {
//        this.clientRepository = clientRepository;
//    }
//
//    public void registerClient(Client client) {
//        // Dodanie logiki rejestracji klienta (walidacja danych, szyfrowanie hasła, zapis do bazy danych)
//        clientRepository.save(client);
//        System.out.println("Zarejestrowano nowego klienta: " + client.getFirstName() + " " + client.getLastName());
//    }
}
