package br.com.solutionsprint.solution.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.solutionsprint.solution.model.Post;
import br.com.solutionsprint.solution.service.PostService;

@RestController
@RequestMapping("/post")
public class PostController {

    private PostService postService;

    @RequestMapping("postTeste")
    public String teste() {
        return "Controller Post";
    }

    @PostMapping("addpost/{id}")
    public ResponseEntity<Post> addPostById(@PathVariable("id") Long id, @RequestBody Post post) {
        return null;
    }
}
