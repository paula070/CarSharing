package pl.sda.orange.java2.carsharing;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import pl.sda.orange.java2.carsharing.configuration.AppSpringConfig;

public class App {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(AppSpringConfig.class);
    }
}
