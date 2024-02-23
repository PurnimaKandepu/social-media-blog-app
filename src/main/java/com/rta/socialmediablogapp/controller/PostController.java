package com.rta.socialmediablogapp.controller;

import com.rta.socialmediablogapp.dto.PostDto;
import com.rta.socialmediablogapp.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/posts")
public class PostController {

    @Autowired
    PostService postService;

    // /api/posts
    @PostMapping
    public ResponseEntity<PostDto> createPost(@RequestBody PostDto postDto){
        PostDto newPostDto = postService.createPost(postDto);
        return new ResponseEntity(newPostDto, HttpStatus.CREATED);
    }

    // /api/posts

    @GetMapping
    public List<PostDto> getAllPosts(){
        List<PostDto> postDtoList= postService.getAllPosts();
        return postDtoList;
    }
    // /api/posts/{id}

    @GetMapping("/{id}")
    public ResponseEntity<PostDto> getPostById(@PathVariable Long id){
        PostDto postDto=  postService.getPostById(id);
        return ResponseEntity.ok(postDto);
    }
    // /api/posts/{id}
    @PutMapping("/{id}")
    public ResponseEntity<PostDto> updatePost(@RequestBody PostDto postDto,@PathVariable Long id){
        PostDto updatedPostDto=  postService.updatePost(postDto,id);
        return ResponseEntity.ok(updatedPostDto);
    }

    // /api/posts/{id}
 /*   @PatchMapping("/{id}")
    public ResponseEntity<PostDto> updatePost(@RequestBody PostDto postDto,@PathVariable Long id){
        PostDto updatedPostDto=  postService.updatePostField(postDto,id);
        return ResponseEntity.ok(updatedPostDto);
    }

  */
    // /api/posts/{id}
    @DeleteMapping("/{id}")
    public ResponseEntity<String>  deletePost(@PathVariable Long id){
       postService.deletePost(id);
        return ResponseEntity.ok("Post deleted successfully for resource id ::"+id);
    }


}
