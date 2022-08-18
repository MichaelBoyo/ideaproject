package com.boyo.bytely.data.models;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document("links")
public class Link {
    @Id
    private String id;
    private String url;
    public Link(String url){
        this.url=url;
    }
}
