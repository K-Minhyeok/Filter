package com.example.filter.controller;



import com.example.filter.dto.PostFilterRequest;
import com.example.filter.dto.PostListResponse;
import com.example.filter.dto.PostRequest;
import com.example.filter.entity.Post;
import com.example.filter.service.PostService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequiredArgsConstructor
@RequestMapping("/posts")
public class PostController {

    private final PostService postService; // final 키워드 추가

    @PostMapping
    public String post(@RequestBody PostRequest postRequest) { // @RequestBody 어노테이션 추가

        postService.savePost(postRequest);
        return "Ok";
    }

    @GetMapping("/filtered")
    public ResponseEntity<PostListResponse> getFilteredPost(@RequestBody PostFilterRequest postFilterRequest) {

        List<Post> posts = postService.getPostByCondition(postFilterRequest);
        PostListResponse response = new PostListResponse(posts);
        return ResponseEntity.ok(response);
    }
}
