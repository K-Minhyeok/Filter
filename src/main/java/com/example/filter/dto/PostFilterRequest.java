package com.example.filter.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PostFilterRequest {

    private String category;
    private String gender;
    private String year;

}
