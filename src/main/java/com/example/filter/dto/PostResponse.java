package com.example.filter.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor(access = lombok.AccessLevel.PROTECTED)
@AllArgsConstructor
public class PostResponse {

    private String category;
    private String title;
    private String content;
    private String year;
    private String gender;

    public PostResponse(PostRequest postRequest) {
        this.category = postRequest.getCategory();
        this.title = postRequest.getTitle();
        this.content = postRequest.getContent();
        this.year = postRequest.getYear();
        this.gender = postRequest.getGender();
    }

}
