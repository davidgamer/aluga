package com.java.aluga.br.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name ="funcionario")
public class Funcionario implements Serializable {

	
	
	
	private static final long serialVersionUID = 1L;
	
	private Double salario;
	
	private Double comissao;

	
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idPessoa")
	private Pessoa pessoa;
	
	
	
}
