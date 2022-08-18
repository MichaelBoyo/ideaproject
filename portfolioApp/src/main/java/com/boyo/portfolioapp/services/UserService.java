package com.boyo.portfolioapp.services;

import com.boyo.portfolioapp.data.models.User;
import com.boyo.portfolioapp.dtos.requests.UserRequest;
import com.boyo.portfolioapp.dtos.requests.UserUpdateRequest;
import com.boyo.portfolioapp.dtos.responses.UserResponse;

public interface UserService {
    UserResponse addUSer(UserRequest userRequest);
    User getUser(String email);
    UserResponse updateUSer(UserUpdateRequest userUpdateRequest);
    UserResponse deleteUser(String id);
}
