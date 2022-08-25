package br.com.solutionsprint.solution.service;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.solutionsprint.solution.model.Cadastro;
import br.com.solutionsprint.solution.repository.CadastroRepository;

@Service
public class CadastroService implements IClienteService {

    @Autowired
    CadastroRepository clienteRepository;

    @Override
    @Transactional
    public List<Cadastro> getAllClientes() {
        List<Cadastro> listaClientes = new ArrayList<>();
        clienteRepository.findAll().forEach(e -> listaClientes.add(e));
        return listaClientes;
    }

    @Override
    @Transactional
    public Cadastro getClienteById(Long id) {

        Cadastro cliente = clienteRepository.findById(id).get();

        return cliente;
    }

    @Override
    @Transactional
    public Cadastro addCliente(Cadastro cadastro) {
        return clienteRepository.save(cadastro);
    }

    @Override
    @Transactional
    public Cadastro updateCliente(Long id, Cadastro cadastro) {

        Cadastro cl = clienteRepository.findById(id).get();

        cl.setNome(cadastro.getNome());
        cl.setEmail(cadastro.getEmail());

        return clienteRepository.save(cl);
    }

    @Override
    @Transactional
    public void deleteCliente(long id) {
        clienteRepository.delete(clienteRepository.findById(id).get());
    }

}
