package com.authentication.server.models.usuario;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Getter
@Table(name = "usuario")
public class Usuario {
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "idUsuario")
    private Integer id;

	@Column(name = "nombre")
	private String nombre;
	
	@Column(name = "correo")
	private String correo;
	
	@Column(name = "password")
	private String password;

}
