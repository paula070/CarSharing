package pl.sda.orange.java2.carsharing.Controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
    public class StartPageController {

    @GetMapping("/")
    public String index() {
        return "index";
    }


    @Controller
    public class AboutController {

        @GetMapping("/")
        public String about() {
            return "Registration Form";
        }
    }

    @Controller
    public class ContactController {

        @GetMapping("/login-form")
        public String loginForm() {
            return "Login Form";
        }

    }
}