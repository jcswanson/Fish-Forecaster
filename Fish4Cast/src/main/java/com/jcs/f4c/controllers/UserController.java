package com.jcs.f4c.controllers;

import com.jcs.f4c.repository.UserRepository;
import com.jcs.f4c.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UserController {

    @Autowired
    private UserRepository userRepository;



    @GetMapping("/login")
    public String login(){
        return "home/login";

    }
    @GetMapping("/home")
    public String goToUserHome(){
        return "user/home";
    }
    @GetMapping("/signup")
    public String showNewUserForm(Model model){
        User user = new User();
        model.addAttribute("user", user);
        return "home/signup";

    }

    @PostMapping("/signupUser")
    public String saveUser(@ModelAttribute("user") User user){
        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        String encodedPassword = passwordEncoder.encode(user.getPassword());
        user.setPassword(encodedPassword);
        userRepository.save(user);
        return "redirect:/home";

    }
}
