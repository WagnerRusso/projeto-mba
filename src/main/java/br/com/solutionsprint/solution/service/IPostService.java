package br.com.solutionsprint.solution.service;

import java.util.List;

import br.com.solutionsprint.solution.model.Cadastro;
import br.com.solutionsprint.solution.model.Post;

public interface IPostService {

    List<Post> getAllPost();

    Cadastro getPostById();

    Cadastro addPost(Post post);

    Cadastro updatePost(Post post);

    void deletePost(long id);
}
