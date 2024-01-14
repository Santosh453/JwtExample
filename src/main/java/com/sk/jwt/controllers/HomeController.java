package com.sk.jwt.controllers;

import com.sk.jwt.models.User;
import com.sk.jwt.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;
import java.util.List;

@RestController
@RequestMapping("/home")
public class HomeController {

    @Autowired
    private UserService userService;

    // http://loaclhost:8081/home/user
    @GetMapping("/users")
    public List<User> getUsers(){
        System.out.println("called user endpoint");
        return this.userService.getAllUsers();
    }

    @GetMapping("/current-user")
    public String getLogedInUser(Principal principal){
        return principal.getName();
    }
}
