package com.sparta.sweetterbe.dto;

import com.sparta.sweetterbe.entity.Post;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;


@Getter
@Setter

public class PostResponseDto {

    private Long id;
    private String content;
    private String userId;
    private String username;
    private List<String> imageUrls;
//    private String imageUrl2;
//    private String imageUrl3;
//    private String imageUrl4;
    private int commentCount;
    private int retweetCount;
    private int likeCount;
    private LocalDateTime createdAt;


    @Builder
    public PostResponseDto(Post post){
        this.id = post.getId();
        this.content = post.getContent();
        this.imageUrls = post.getImageUrls();
        this.commentCount = post.getComments().size();
        this.retweetCount = post.getRetweets().size();
        this.likeCount = post.getLikes().size();
        this.userId = post.getUser().getUserId();
        this.username = post.getUser().getUsername();
        this.createdAt = post.getCreatedAt();
    }
}