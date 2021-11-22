package zw.co.nseye.agrocheck;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = { SecurityAutoConfiguration.class })
public class AgrocheckApplication {

    public static void main(String[] args) {
        SpringApplication.run(AgrocheckApplication.class, args);
    }

}
