package pl.sda.orange.java2.carsharing.encoder;

import com.password4j.Password;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class PasswordEncoderImplementation implements PasswordEncoder {


    @Value("carshare")
private String pepper;


 @Override
    public String encode(String text){
     return Password
             .hash(text)
             .addPepper()
             .withBcrypt() //algorytm szyfrowania
             .getResult();
 }

    @Override
    public boolean check(String text, String hashed){
        return Password
                .check(text, hashed)
                .addPepper(pepper)
                .withBcrypt();
    }
}
