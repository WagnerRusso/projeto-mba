package br.com.solutionsprint.solution.service;

import java.util.List;

import br.com.solutionsprint.solution.model.Cliente;
import br.com.solutionsprint.solution.model.Endereco;

public interface IEnderecoService {

    List<Endereco> getAllEndereco();

    Cliente getEnderecoById();

    Cliente addEndereco(Endereco endereco);

    Cliente updateEndereco(Endereco endereco);

    void deleteEndereco(long id);
}
