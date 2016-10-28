
package com.java.aluga.br.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;



@Entity
@Table(name="propietario")
public class Propietario implements Serializable {
	
	
	
	private int numImoveis;
	
	

	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idPessoa")
	private Pessoa pessoa;
	
}
