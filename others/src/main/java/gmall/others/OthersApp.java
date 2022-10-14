package gmall.others;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class OthersApp {
    public static void main(String[] args) {
        SpringApplication.run(OthersApp.class, args);
    }

    @GetMapping("/hello")
    public String hello() {
        return ">>> Hello Spring Boot >>>";
    }
}
