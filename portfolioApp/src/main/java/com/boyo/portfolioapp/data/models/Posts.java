package com.boyo.portfolioapp.data.models;

import lombok.Data;

import java.time.LocalDateTime;
@Data
public class Posts {
    private LocalDateTime datePosted;
    private String title;
    private String body;
}
