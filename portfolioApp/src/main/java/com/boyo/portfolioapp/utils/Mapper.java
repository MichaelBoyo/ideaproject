package com.boyo.portfolioapp.utils;

import com.boyo.portfolioapp.data.models.User;
import com.boyo.portfolioapp.dtos.requests.UserRequest;

public class Mapper {

    public static void mapRequestToUSer(UserRequest userRequest, User user) {
        user.setEmail(userRequest.getEmail());
        user.setFirstName(userRequest.getFirstName());
        user.setLastName(userRequest.getLastName());
        user.setUsername(userRequest.getUsername());
        user.setAboutMe(userRequest.getAboutMe());
    }
}
