package com.rta.socialmediablogapp.controller;

import com.rta.socialmediablogapp.dto.CommentsDto;
import com.rta.socialmediablogapp.service.CommentsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1")
public class CommentsController {

    @Autowired
     CommentsService commentsService;

    // create new comment /api/posts/{}/comments
    @PostMapping("/posts/{postId}/comments")
    public CommentsDto createCommentforPost(@PathVariable("postId") long postId, @RequestBody CommentsDto commentsDto){
        CommentsDto commentsDtoCreated = commentsService.createComment(postId,commentsDto);
        //return new RequestEntity(commentsDtoCreated, HttpStatus.CREATED);
        return commentsDtoCreated;


    }

}
