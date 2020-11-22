package br.com.todolist.model;


import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

public class ListaTarefa implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue
    private Long id;

    @Column(name = "descricao", nullable = false, length = 120)
    private String descricao;

    @Temporal(TemporalType.DATE)
    @Column(name = "data_cadastro")
    private Date dataCadastro;

    @Temporal(TemporalType.DATE)
    @Column(name = "data_execucao")
    private Date dataExecucao;

    @Temporal(TemporalType.DATE)
    @Column(name = "data_conclusao")
    private Date dataConclusao;

    @Column(name = "observacao", length = 120)
    private String observacao;



}
