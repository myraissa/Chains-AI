package com.student.information.system.controller;


import com.student.information.system.model.User;
import com.student.information.system.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;




@RestController
@RequestMapping("/Users")
public class UserRestController {

    @Autowired
    private UserService userService;


    @GetMapping(value = "/login/{email}")
    public User getUserByEmail(@PathVariable("email") String email) {

        return userService.findByEmail(email);
    }



    @PostMapping(value = "/save")
    public String saveOrUpdateUser(@RequestBody User user) {
        userService.saveOrUpdateUser(user);
        return ("user added successfully");
    }



}
