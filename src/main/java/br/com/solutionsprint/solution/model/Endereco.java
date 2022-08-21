package br.com.solutionsprint.solution.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Endereco implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String rua;
    private int numero;
    private String bairro;
    private String estado;
    private int cep;
    private String descricao;

    // @ManyToOne(fetch = FetchType.EAGER)
    // @JoinColumn(name = "cliente_id", referencedColumnName = "id")
    // private Cliente cliente;

}
