package com.example.eAlkohol;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Service
public class UsersService {
    private final UserRepository userRepository;

    public UsersService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Autowired
    private PasswordEncoderImpl passwordEncoder;

    public @ResponseBody void loginUser(@RequestParam String username, @RequestParam String password) {
        List<User> users = userRepository.findAll();
        for(User user : userRepository.findAll()) {
            if(user.getName().equals(username)
            && passwordEncoder.matches(password, user.getUserPassword())) {
                //log user in

            }
        }
    }
    public @ResponseBody void registerUser(@RequestParam String username,
                                           @RequestParam String password,
                                           @RequestParam String confirmPassword) {
        for(User user : userRepository.findAll()) {
            if(user.getName().equals(username)) {
                //notify user

                return;
            }
        }

        User user = new User();
        user.setName(username);
        String encodedPassword = passwordEncoder.encode(password);
        user.setUserPassword(encodedPassword);
        userRepository.save(user);
        System.out.println("User registered successfully");
    }
}
