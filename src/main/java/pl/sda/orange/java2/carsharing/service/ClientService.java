package pl.sda.orange.java2.carsharing.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pl.sda.orange.java2.carsharing.api.AuthDataDto;
import pl.sda.orange.java2.carsharing.api.CreateClientDto;
import pl.sda.orange.java2.carsharing.encoder.PasswordEncoder;
import pl.sda.orange.java2.carsharing.entity.Client;
import pl.sda.orange.java2.carsharing.repository.IClientRepository;

@Service
@RequiredArgsConstructor
public class ClientService {
    private  final PasswordEncoder passwordEncoder;
    private final IClientRepository iClientRepository;

    public Client register(CreateClientDto client) {
        return iClientRepository
                .save(client
                        .toCLient()
                        .withPassword(passwordEncoder.encode(client.password())));

    }
//    public AuthDataDto login(String username, String password){
//        return iClientRepository
//                .findById(id)
//                .filter(client -> passwordEncoder.check(password, client.getPassword()))//sprawdzenie c zy dane lgoowania zgadzaja sie
//                .map(Client::toAuthDataDto)
//                .orElseThrow(()-> new IllegalStateException("Authentication failed"));
//
// }
//
}