package com.boyo.portfolioapp.dtos.requests;

import lombok.Data;

@Data
public class UserUpdateRequest {
    private Long id;
    private String firstName;
}
