package com.rta.socialmediablogapp.service;

import com.rta.socialmediablogapp.dto.PostDto;
import com.rta.socialmediablogapp.repository.PostRepoitory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


public interface PostService {

      PostDto createPost(PostDto postDto);


      List<PostDto>  getAllPosts();

      PostDto getPostById(Long id);


      PostDto updatePost(PostDto postDto, Long id);

      void deletePost(Long id);

    //  PostDto updatePostField(PostDto postDto, Long id);
}
