package com.example.grupo4.Entity;

import com.example.grupo4.Entity.Component.Generica;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="pais")
public class Pais extends Generica{
	
	@Column(name="name", length = 50)
	private String name;
	
	@Column(name="odigo", length = 50)
	private String odigo;	
	
	@ManyToOne(fetch = FetchType.EAGER, optional = false)
	@JoinColumn(name = "Contiente_id", nullable = false)
	private Continente ContienteId;
	
}
