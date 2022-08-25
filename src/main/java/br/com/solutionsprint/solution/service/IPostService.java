package br.com.solutionsprint.solution.service;

import java.util.List;

import br.com.solutionsprint.solution.model.Cadastro;
import br.com.solutionsprint.solution.model.Post;

public interface IPostService {

    List<Post> getAllEndereco();

    Cadastro getEnderecoById();

    Cadastro addEndereco(Post post);

    Cadastro updateEndereco(Post post);

    void deleteEndereco(long id);
}
