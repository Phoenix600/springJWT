package com.pranay.example.SpringJWT.controller;

import com.pranay.example.SpringJWT.models.User;
import com.pranay.example.SpringJWT.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/home")
public class MyController {
    @Autowired
    private UserService service;
    @GetMapping("/info")
    public List<User> getDetails()
    {
//        return "Getting Admin Details";
        return service.getAllUser();
    }
}
