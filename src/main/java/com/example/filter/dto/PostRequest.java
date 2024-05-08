package com.example.filter.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PostRequest {

    private String category;
    private String title;
    private String content;
    private String year;
    private String gender;
}
