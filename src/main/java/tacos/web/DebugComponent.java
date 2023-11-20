package tacos.web;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class DebugComponent {
    @Value("${spring.thymeleaf.cache}")
    private String springThymeleafCache;

    @PostConstruct
    public void postConstruct() {
        System.out.println("springThymeleafCache: " + springThymeleafCache);
    }
}
