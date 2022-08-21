package br.com.solutionsprint.solution.service;

import java.util.List;

import br.com.solutionsprint.solution.model.Cliente;

public interface IClienteService {
    List<Cliente> getAllClientes();

    Cliente getClienteById(Long id);

    Cliente addCliente(Cliente cliente);

    Cliente updateCliente(Long id, Cliente cliente);

    void deleteCliente(long id);

}
