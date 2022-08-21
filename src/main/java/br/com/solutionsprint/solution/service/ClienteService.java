package br.com.solutionsprint.solution.service;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.solutionsprint.solution.model.Cliente;
import br.com.solutionsprint.solution.repository.ClienteRepository;

@Service
public class ClienteService implements IClienteService {

    @Autowired
    ClienteRepository clienteRepository;

    @Override
    @Transactional
    public List<Cliente> getAllClientes() {
        List<Cliente> listaClientes = new ArrayList<>();
        clienteRepository.findAll().forEach(e -> listaClientes.add(e));
        return listaClientes;
    }

    @Override
    @Transactional
    public Cliente getClienteById(Long id) {

        Cliente cliente = clienteRepository.findById(id).get();

        return cliente;
    }

    @Override
    @Transactional
    public Cliente addCliente(Cliente cliente) {
        return clienteRepository.save(cliente);
    }

    @Override
    @Transactional
    public Cliente updateCliente(Long id, Cliente cliente) {

        Cliente cl = clienteRepository.findById(id).get();

        cl.setNome(cliente.getNome());
        cl.setIdade(cliente.getIdade());
        cl.setEmail(cliente.getEmail());
        cl.setCpf(cliente.getCpf());
        cl.setRg(cliente.getRg());

        return clienteRepository.save(cl);
    }

    @Override
    @Transactional
    public void deleteCliente(long id) {
        clienteRepository.delete(clienteRepository.findById(id).get());
    }

}
