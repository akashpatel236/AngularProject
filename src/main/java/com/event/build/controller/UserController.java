package com.event.build.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.event.build.model.User;
import com.event.build.model.UserRepository;


@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class UserController {
	 
	    @Autowired
	    private  UserRepository userRepository;
	 
	    @GetMapping(path="/users",produces="application/json")
	    public ArrayList<User> getUsers() {
	        return userRepository.getUserList();
	    }
	 
	    @PostMapping("/users")
	    void addUser(@RequestBody User user) {
	        userRepository.add(user);
	    }
	    
	    

}
