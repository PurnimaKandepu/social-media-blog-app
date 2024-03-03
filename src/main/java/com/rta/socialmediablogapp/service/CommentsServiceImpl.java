package com.rta.socialmediablogapp.service;

import com.rta.socialmediablogapp.dto.CommentsDto;
import com.rta.socialmediablogapp.dto.PostDto;
import com.rta.socialmediablogapp.entity.Comments;
import com.rta.socialmediablogapp.entity.Post;
import com.rta.socialmediablogapp.exception.ResouceNotFoundException;
import com.rta.socialmediablogapp.repository.CommentsRepository;
import com.rta.socialmediablogapp.repository.PostRepoitory;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CommentsServiceImpl implements CommentsService{

    @Autowired
   private CommentsRepository commentsRepository;
    @Autowired
    private PostRepoitory postRepoitory;

    @Autowired
    private ModelMapper modelMapper;

    public CommentsDto createComment(Long postId,CommentsDto commentsDto){
        Post post = postRepoitory.findById(postId).orElseThrow(() -> new ResouceNotFoundException("Post","id",String.valueOf(postId)));
        Comments comments = mapDtoToEntity(commentsDto);
        comments.setPost(post);
        comments = commentsRepository.save(comments);
        commentsDto = mapEntityToDto(comments);
        return commentsDto;
    }

    private Comments  mapDtoToEntity(CommentsDto commentsDto) {
        Comments comments = modelMapper.map(commentsDto,Comments.class);
        return comments;
    }
    private CommentsDto  mapEntityToDto(Comments comments) {
        CommentsDto commentsDto = modelMapper.map(comments,CommentsDto.class);
        return commentsDto;
    }

}
