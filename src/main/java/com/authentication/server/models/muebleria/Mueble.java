package com.authentication.server.models.muebleria;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

import java.sql.Date;

@Entity
@Setter
@Getter
@Table(name = "mueble")
public class Mueble {

	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	@Column(name = "idmueble")
	private Integer id;

	@Column(name = "nombre")
	private String nombre;

	@Column(name = "direccion")
	private String direccion;

	@Column(name = "antiguedad")
	private String antiguedad;

	@Column(name = "habitaciones")
	private Integer habitaciones;

	@Column(name = "estufa")
	private Boolean estufa;

	@Column(name = "banios")
	private Boolean banios;

	@Column(name = "estacionamiento")
	private Boolean estacionamiento;

	@Column(name = "capacidad")
	private Integer capacidad;

	@Column(name = "fechaalta")
	private Date fechaalta;

	@Column(name = "fechamodificacion")
	private Date fechamodificacion;
}