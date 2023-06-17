package pl.sda.orange.java2.carsharing.configuration;


import lombok.RequiredArgsConstructor;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pl.sda.orange.java2.carsharing.entity.UserRepository;


import java.util.List;

@Service
    @Transactional
    @RequiredArgsConstructor
    public class AppUserDetailsService implements UserDetailsService {

        private final UserRepository repository;

        @Override
        public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
            return repository.findByEmail(username)
                    .stream().map(user -> new User(
                            user.getEmail(),
                            user.getPassword(),
                            List.of(new SimpleGrantedAuthority("USER")))
                    ).findFirst().orElseThrow(() -> new UsernameNotFoundException(username));
        }
    }
