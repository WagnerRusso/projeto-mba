package br.com.solutionsprint.solution.model;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.Data;

@Data
@Entity
public class Post implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String titulo;

    private LocalDate data;

    private String texto;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "cadastro_id", referencedColumnName = "id")
    private Cadastro cadastro;

}
