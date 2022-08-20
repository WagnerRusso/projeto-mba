package br.com.solutionsprint.solution.service;

import java.util.List;

import br.com.solutionsprint.solution.model.Cliente;

public interface IClienteService {
    List<Cliente> getAllClientes();

    Cliente getClienteById();

    Cliente addCliente(Cliente cliente);

    Cliente updateCliente(Cliente cliente);

    void deleteCliente(long id);

}
