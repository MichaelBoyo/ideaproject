package com.boyo.portfolioapp.security;

import lombok.Data;

@Data
public class AuthRequest {
    private String username;
    private String password;
}
