package sia.takocloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
public class TakoCloudApplication {

    public static void main(String[] args) {
        SpringApplication.run(TakoCloudApplication.class, args);
    }

    @Controller
    public static class HomeController {
        @GetMapping("/")
        public String home() {
            return "home";
        }
    }
}
