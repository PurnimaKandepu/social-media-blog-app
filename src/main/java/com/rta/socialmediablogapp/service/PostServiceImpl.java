package com.rta.socialmediablogapp.service;

import com.rta.socialmediablogapp.dto.PostDto;
import com.rta.socialmediablogapp.entity.Post;
import com.rta.socialmediablogapp.exception.ResouceNotFoundException;
import com.rta.socialmediablogapp.repository.PostRepoitory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class PostServiceImpl implements PostService{

    @Autowired
    private PostRepoitory postRepoitory;
    @Override
    public PostDto createPost(PostDto postDto) {
         Post post =mapDtoToEntity(postDto);
        Post savedPost = postRepoitory.save(post);
        PostDto newPostDto = mapEntityToDto(savedPost);
        return newPostDto;
    }

    public List<PostDto> getAllPosts(){
        List<Post> posts =  postRepoitory.findAll();
        List<PostDto> postDtoList= posts.stream().map(post->mapEntityToDto(post)).collect(Collectors.toList());
        return postDtoList;
    }

    public PostDto getPostById(Long id){

        Post post = postRepoitory.findById(id).orElseThrow(()->new ResouceNotFoundException("Post","id",String.valueOf(id)));
        PostDto postDto = mapEntityToDto(post);
        return postDto;
    }

    public PostDto updatePost(PostDto postDto,Long id){
        Post existingPost = postRepoitory.findById(id).orElseThrow(()->new ResouceNotFoundException("Post","id",String.valueOf(id)));
        existingPost.setTitle(postDto.getTitle());
        existingPost.setDescription(postDto.getDescription());
        existingPost.setContent(postDto.getContent());
        Post savedPost = postRepoitory.save(existingPost);
        return mapEntityToDto(savedPost);
    }
 //   PostDto updatePostField(PostDto postDto, Long id){

   // }
    public void deletePost(Long id){
        Post existingPost = postRepoitory.findById(id).orElseThrow(()->new ResouceNotFoundException("Post","id",String.valueOf(id)));

        postRepoitory.delete(existingPost);
    }
    private PostDto mapEntityToDto(Post post) {
        PostDto postDto = new PostDto();
        postDto.setId(post.getId());
        postDto.setDescription(post.getDescription());
        postDto.setTitle(post.getTitle());
        postDto.setContent(post.getContent());
       return postDto;

    }

    private Post  mapDtoToEntity(PostDto postDto) {
        Post newPost = new Post();
        newPost.setDescription(postDto.getDescription());
        newPost.setTitle(postDto.getTitle());
        newPost.setContent(postDto.getContent());
        return newPost;
    }
}
