package com.example.grupo4.Entity.Component;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class Auditoria {

	
	@Column(name="create_up")
	private LocalDateTime creatUp;

	@Column(name="update_up")
	private LocalDateTime updateUp;
	
	@Column(name="delete_up")
	private LocalDateTime deleteUp;
}
