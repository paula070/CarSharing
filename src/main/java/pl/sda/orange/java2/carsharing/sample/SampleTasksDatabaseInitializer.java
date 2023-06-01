package pl.sda.orange.java2.carsharing.sample;

import lombok.val;


import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;
import pl.sda.orange.java2.carsharing.entity2.UserRepository;

import javax.transaction.Transactional;


@Profile("demo")
@Component
@Transactional
@RequiredArgsConstructor
public class SampleTasksDatabaseInitializer implements CommandLineRunner {
    private final ToDoService service;

    private final UserRepository userRepository;

    @Override
    public void run(String... args) throws Exception {
        val user = sampleUser();

        service.add(new CreateTodoDto("user1",  "password1"), user.getId());
        service.add(new CreateTodoDto("user2",  "password2"), user.getId());
        service.add(new CreateTodoDto("user3",  "password3"), user.getId());
        service.add(new CreateTodoDto("user4",  "password4"), user.getId());
        service.add(new CreateTodoDto("user5",  "password5"), user.getId());
    }

    private User sampleUser() {
        val user = new User();
        user.setLogin("example");
        return userRepository.saveAndFlush(user);
    }

}
