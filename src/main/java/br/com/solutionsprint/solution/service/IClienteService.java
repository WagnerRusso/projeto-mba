package br.com.solutionsprint.solution.service;

import java.util.List;

import br.com.solutionsprint.solution.model.Cadastro;

public interface IClienteService {
    List<Cadastro> getAllClientes();

    Cadastro getClienteById(Long id);

    Cadastro addCliente(Cadastro cadastro);

    Cadastro updateCliente(Long id, Cadastro cadastro);

    void deleteCliente(long id);

}
