package com.chidi.joblisting.controller;


import com.chidi.joblisting.repository.PostRepository;
import com.chidi.joblisting.model.Post;
import com.chidi.joblisting.repository.SearchRepository;
import io.swagger.v3.oas.annotations.Hidden;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.List;

@RestController
@CrossOrigin(origins = {"http://localhost:3000"})
public class PostController
{
    @Autowired
    PostRepository repo;

    @Autowired
    SearchRepository srepo;

    @Hidden
    @RequestMapping(value = "/")
   public void redirect(HttpServletResponse response) throws IOException {
        response.sendRedirect("/swagger-ui.html");

   }

   @GetMapping("/posts")
   @CrossOrigin
   public List<Post> getAllPosts(){

        return repo.findAll();



   }

   @GetMapping("/posts/{text}")
   @CrossOrigin
   public List<Post> search(@PathVariable String text){
        return srepo.findByText(text);
   }

   @PostMapping("/post")
   @CrossOrigin
    public Post addPost(@RequestBody Post post)
   {
       return repo.save(post);



   }
}
