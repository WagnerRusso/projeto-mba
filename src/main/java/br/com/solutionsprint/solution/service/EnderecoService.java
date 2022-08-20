package br.com.solutionsprint.solution.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import br.com.solutionsprint.solution.model.Cliente;
import br.com.solutionsprint.solution.model.Endereco;
import br.com.solutionsprint.solution.repository.EnderecoRepository;

public class EnderecoService implements IEnderecoService {

    @Autowired
    private EnderecoRepository enderecoRepository;

    @Override
    public List<Endereco> getAllEndereco() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Cliente getEnderecoById() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Cliente addEndereco(Endereco endereco) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Cliente updateEndereco(Endereco endereco) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void deleteEndereco(long id) {
        // TODO Auto-generated method stub

    }

}
