package com.boyo.portfolioapp.data.models;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class Project {
    private LocalDateTime dateStarted;
    private LocalDateTime dateEnded;
    private String projectTitle;
    private String description;
}

