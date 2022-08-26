package br.com.solutionsprint.solution.service;

import java.util.List;

import br.com.solutionsprint.solution.model.Cadastro;

public interface ICadastroService {
    List<Cadastro> getAllCadastro();

    Cadastro getCadastroById(Long id);

    Cadastro addCadastro(Cadastro cadastro);

    Cadastro updateCadastro(Long id, Cadastro cadastro);

    void deleteCadastro(long id);

}
