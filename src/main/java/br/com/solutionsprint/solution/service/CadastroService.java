package br.com.solutionsprint.solution.service;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.solutionsprint.solution.model.Cadastro;
import br.com.solutionsprint.solution.repository.CadastroRepository;

@Service
public class CadastroService implements ICadastroService {

    @Autowired
    CadastroRepository clienteRepository;

    @Override
    @Transactional
    public List<Cadastro> getAllCadastro() {
        List<Cadastro> listaClientes = new ArrayList<>();
        clienteRepository.findAll().forEach(e -> listaClientes.add(e));
        return listaClientes;
    }

    @Override
    @Transactional
    public Cadastro getCadastroById(Long id) {

        Cadastro cliente = clienteRepository.findById(id).get();

        return cliente;
    }

    @Override
    @Transactional
    public Cadastro addCadastro(Cadastro cadastro) {
        return clienteRepository.save(cadastro);
    }

    @Override
    @Transactional
    public Cadastro updateCadastro(Long id, Cadastro cadastro) {

        Cadastro cl = clienteRepository.findById(id).get();

        cl.setNome(cadastro.getNome());
        cl.setEmail(cadastro.getEmail());

        return clienteRepository.save(cl);
    }

    @Override
    @Transactional
    public void deleteCadastro(long id) {
        clienteRepository.delete(clienteRepository.findById(id).get());
    }

}
