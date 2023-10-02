package com.example.grupo4.Entity;

import com.example.grupo4.Entity.Component.Generica;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name="continente")
public class Continente extends Generica{
	
	@Column(name="name", length = 50)
	private String name;
	
	@Column(name="odigo", length = 50)
	private String odigo;	
	
}
