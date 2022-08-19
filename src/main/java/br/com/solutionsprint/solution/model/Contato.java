package br.com.solutionsprint.solution.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Contato {

    @Id
    @GeneratedValue
    private int id;
    private String nome;
    private int idade;
}
