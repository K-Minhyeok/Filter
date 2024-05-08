package com.example.filter.service;

import com.example.filter.dto.PostFilterRequest;
import com.example.filter.dto.PostRequest;
import com.example.filter.entity.Post;
import com.example.filter.repository.PostRepository;
import com.example.filter.specification.PostSpecification;
import lombok.RequiredArgsConstructor;

import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;


import java.util.List;


@Service
@RequiredArgsConstructor
public class PostService {

    private final PostRepository postRepository;


    public long savePost(PostRequest postRequest) {

        Post post = Post.of(postRequest);
        Post ret = postRepository.save(post);

        return ret.getId();
    }

    public List<Post> getPostByCondition(PostFilterRequest postFilterRequest) {
        Specification<Post> spec = Specification.where(PostSpecification.withCategory(postFilterRequest.getCategory())
                .and(PostSpecification.withGender(postFilterRequest.getGender()))
                .and(PostSpecification.withYear(postFilterRequest.getYear())));


        return postRepository.findAll(spec);

    }







}
