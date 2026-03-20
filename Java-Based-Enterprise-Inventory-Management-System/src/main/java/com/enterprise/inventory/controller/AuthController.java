package com.enterprise.inventory.controller;

import com.enterprise.inventory.entity.User;
import com.enterprise.inventory.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class AuthController {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    // Signup page
    @GetMapping("/signup")
    public String signupPage() {
        return "signup";
    }

    // Save signup data
    @PostMapping("/signup")
    public String registerUser(@ModelAttribute User user) {

        user.setPassword(passwordEncoder.encode(user.getPassword()));

        if(user.getRole().equals("ADMIN")){
            user.setRole("ADMIN");
        }else{
            user.setRole("USER");
        }

        userRepository.save(user);

        return "redirect:/login";
    }
}