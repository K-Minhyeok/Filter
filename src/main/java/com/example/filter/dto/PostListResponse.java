package com.example.filter.dto;

import com.example.filter.entity.Post;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;

@Getter
@NoArgsConstructor(access = lombok.AccessLevel.PROTECTED)
public class PostListResponse {

    private List<Post> posts;

    public PostListResponse(List<Post> posts) {
        this.posts = posts;
    }
}