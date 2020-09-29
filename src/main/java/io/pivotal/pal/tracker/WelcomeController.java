package io.pivotal.pal.tracker;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

    String word = "hello";

    public WelcomeController(@Value("${welcome.message}") String a_welcome_message) {
        word = a_welcome_message;
    }

    @GetMapping("/")
    public String sayHello() {
        return word;
    }
}
