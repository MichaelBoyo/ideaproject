package com.boyo.portfolioapp.services;

import com.boyo.portfolioapp.Exceptions.EmailAlreadyRegisteredException;
import com.boyo.portfolioapp.Exceptions.UserNotFoundException;
import com.boyo.portfolioapp.data.models.Role;
import com.boyo.portfolioapp.data.models.User;
import com.boyo.portfolioapp.data.repositories.UserArchive;
import com.boyo.portfolioapp.data.repositories.UserRepository;
import com.boyo.portfolioapp.dtos.requests.UserRequest;
import com.boyo.portfolioapp.dtos.requests.UserUpdateRequest;
import com.boyo.portfolioapp.dtos.responses.UserResponse;
import com.boyo.portfolioapp.utils.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private UserArchive userArchive;
    @Autowired
    private PasswordEncoder passwordEncoder;
    @Override
    public UserResponse addUSer(UserRequest userRequest) {
        for(User user: userRepository.findAll()){
            if(user.getEmail().equalsIgnoreCase(userRequest.getEmail())){
                throw new EmailAlreadyRegisteredException("email already exist ");
            }
        }
        User user = new User();
        user.setPassword(passwordEncoder.encode(userRequest.getPassword()));
        Mapper.mapRequestToUSer(userRequest,user);
        user.addRole(Role.USER);
        userRepository.save(user);
        return new UserResponse(user.getEmail()+" registered successfully");
    }

    @Override
    public User getUser(String email) {
        return userRepository.findUserByEmail(email).orElseThrow(
                ()->new UserNotFoundException("user with email "+email+" not found"));
    }

    @Override
    public UserResponse updateUSer(UserUpdateRequest userUpdateRequest) {
        return null;
    }

    @Override
    public UserResponse deleteUser(String email) {
        User user = getUser(email);
        userArchive.save(user);
        userRepository.delete(user);
        return new UserResponse(user.getEmail()+" deleted successfully");
    }
}
