package com.java.aluga.br.entity;

import java.io.Serializable;

import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

public class Avalista implements Serializable {
	
	
	
	private static final long serialVersionUID = 1L;
	
	
	private String viablidade;
	
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idPessoa")
	private Pessoa pessoa;
	
	
	

}
