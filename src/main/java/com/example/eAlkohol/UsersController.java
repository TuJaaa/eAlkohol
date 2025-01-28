package com.example.eAlkohol;

import ch.qos.logback.core.model.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@Controller
public class UsersController {

    private final UsersService usersService;

    public UsersController(UsersService usersService) {
        this.usersService = usersService;
    }

    @GetMapping("/")
    public String home() {
        // Nazwa pliku HTML w src/main/resources/templates
        return "login"; // Bez ".html"
    }

    @GetMapping("/main")
    public String main() {
        // Nazwa pliku HTML w src/main/resources/templates
        return "main"; // Bez ".html"
    }
}