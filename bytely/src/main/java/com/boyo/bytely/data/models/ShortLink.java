package com.boyo.bytely.data.models;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document("shortlinks")

public class ShortLink {
    @Id
    private String id;
    private String normalUrl;
    private String shortUrl;
}
