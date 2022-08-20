package br.com.solutionsprint.solution.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.solutionsprint.solution.model.Cliente;
import br.com.solutionsprint.solution.repository.ClienteRepository;

@Service
public class ClienteService implements IClienteService {

    @Autowired
    ClienteRepository clienteRepository;

    @Override
    public List<Cliente> getAllClientes() {
        List<Cliente> listaClientes = new ArrayList<>();
        clienteRepository.findAll().forEach(e -> listaClientes.add(e));
        return listaClientes;
    }

    @Override
    public Cliente getClienteById() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Cliente addCliente(Cliente cliente) {
        return clienteRepository.save(cliente);
    }

    @Override
    public Cliente updateCliente(Cliente cliente) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void deleteCliente(long id) {
        // TODO Auto-generated method stub

    }

}
