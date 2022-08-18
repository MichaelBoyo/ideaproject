package com.boyo.portfolioapp.controller;

import com.boyo.portfolioapp.data.models.User;
import com.boyo.portfolioapp.dtos.requests.UserRequest;
import com.boyo.portfolioapp.dtos.responses.UserResponse;
import com.boyo.portfolioapp.Exceptions.EmailAlreadyRegisteredException;
import com.boyo.portfolioapp.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/portfolio")
public class AppController {
    @Autowired
    private UserService userService;

    @PostMapping("/user")
    public ResponseEntity<UserResponse> registerUser(@RequestBody UserRequest userRequest){
        try {
            return new ResponseEntity<>(userService.addUSer(userRequest), HttpStatus.OK);
        }catch (EmailAlreadyRegisteredException e){
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }

    }
    @GetMapping("/user/{email}")
    public User getUser(@PathVariable String email){
        return userService.getUser(email);
    }

    @DeleteMapping("/user/{email}")
    public ResponseEntity<UserResponse> deleteUser(@PathVariable String email){
        try {
            return new ResponseEntity<>(userService.deleteUser(email), HttpStatus.OK);
        }catch (EmailAlreadyRegisteredException e){
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }


}
