package com.example.filter.entity;

import com.example.filter.dto.PostRequest;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String category;
    private String title;
    private String content;
    private String year;
    private String gender;


    public static Post of(PostRequest postRequest) {
        return Post.builder()
                .category(postRequest.getCategory())
                .title(postRequest.getTitle())
                .content(postRequest.getContent())
                .year(postRequest.getYear())
                .gender(postRequest.getGender())
                .build();
    }
}
