package com.example.filter.specification;


import com.example.filter.entity.Post;
import org.springframework.data.jpa.domain.Specification;

public class PostSpecification {


    public static Specification<Post> withCategory(String category) {
        if(category != null && !category.isEmpty()) {
            return (root, query, criteriaBuilder) -> criteriaBuilder.equal(root.get("category"), category);
        }
        return null;
    }

    public static Specification<Post> withGender(String gender) {
        if(gender != null && !gender.isEmpty()) {
            return (root, query, criteriaBuilder) -> criteriaBuilder.equal(root.get("gender"), gender);
        }
        return null;
    }

    public static Specification<Post> withYear(String year) {
        if(year != null && !year.isEmpty()){
        return (root, query, criteriaBuilder) -> criteriaBuilder.equal(root.get("year"), year);
    }
        return null;
    }

}
