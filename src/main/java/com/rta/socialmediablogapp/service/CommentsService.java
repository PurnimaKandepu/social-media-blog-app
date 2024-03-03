package com.rta.socialmediablogapp.service;

import com.rta.socialmediablogapp.dto.CommentsDto;
import org.springframework.stereotype.Service;


public interface CommentsService {

    CommentsDto createComment(Long postId, CommentsDto commentsDto);
}
