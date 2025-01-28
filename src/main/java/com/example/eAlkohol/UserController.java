package com.example.eAlkohol;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class UserController {

    private final UsersService usersService;

    public UserController(UsersService usersService) {
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

    @PostMapping("/loginReq")
    public String loginUser(@RequestParam String username,
                            @RequestParam String password) {
        try {
            usersService.loginUser(username, password);
            return "main";
        } catch (Exception e) {
            return "Error: " + e.getMessage();
        }
    }

    @PostMapping("/registerReq")
    public String registerUser(@RequestParam String username,
                               @RequestParam String password,
                               @RequestParam String confirmPassword) {
        try {
            usersService.registerUser(username, password, confirmPassword);
            return "main";
        } catch (Exception e) {
            return "Error: " + e.getMessage();
        }
    }
}