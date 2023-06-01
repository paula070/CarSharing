package pl.sda.orange.java2.carsharing.restapi;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ClientRegistrationController {
//    private ClientRegistrationService clientRegistrationService;
    @GetMapping("/")
    public String home() {
        return "registration-form";
    }
}
