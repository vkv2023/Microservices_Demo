package com.user.controller;


import com.user.entity.User;
import com.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    //Added Rest Tea,ple
    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/{userId}")
    public User getUser(@PathVariable("userId") Long userId){

//        return this.userService.getUser(userId);
        User user = this.userService.getUser(userId);
        List contacts = this.restTemplate.getForObject("http://localhost:9002/contact/user/"+user.getUserId(), List.class);
        user.setContactList(contacts);
        return user;
    }
}
