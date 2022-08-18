package com.boyo.portfolioapp.dtos.responses;

import lombok.Data;

@Data
public class UserResponse {
    private String message;
    public UserResponse(String message){
        this.message=message;
    }
}
