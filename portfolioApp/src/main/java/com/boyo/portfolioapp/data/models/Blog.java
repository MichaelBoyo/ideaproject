package com.boyo.portfolioapp.data.models;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;
@Data
public class Blog {
    private List<Posts> posts = new ArrayList<>();
}
