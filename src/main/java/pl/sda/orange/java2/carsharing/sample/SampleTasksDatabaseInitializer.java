//package pl.sda.orange.java2.carsharing.sample;
////do rejestracji uzytkownikow
//import lombok.RequiredArgsConstructor;
//import lombok.val;
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.context.annotation.Profile;
//import org.springframework.stereotype.Component;
//import pl.sda.orange.java2.carsharing.api.CreateTodoDto;
//import pl.sda.orange.java2.carsharing.entity.User;
//import pl.sda.orange.java2.carsharing.entity.UserRepository;
//
//import javax.transaction.Transactional;
//
//@Profile("demo")
//@Component
//@Transactional
//@RequiredArgsConstructor
//public class SampleTasksDatabaseInitializer implements CommandLineRunner  {
//
//    private final UserRepository userRepository;
//    private final ToDoService service;
//
//    @Override
//    public void run(String... args) throws Exception {
//        val client = sampleClient();
////mockowanie danych
//        service.add(new CreateTodoDto("user1",  "password1"), client.getId());
//
//    }
//    private User sampleClient() {
//        val user = new User();
////user.setLogin("example"); ??
//        return userRepository.saveAndFlush(user);
//    }
//}
