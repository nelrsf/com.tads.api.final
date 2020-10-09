package com.proyecto.web.models.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

@Entity
@Table(name="conductor")
public class Conductor implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 8019493183631131067L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@Column(nullable=false)
	@NotEmpty(message="No puede estar vacio")
	private String nombre;
	
	@Column(nullable=false)
	@NotEmpty(message="No puede estar vacio")
	private String apellido;
	
	@Column(nullable=false)
	@NotEmpty(message="No puede estar vacio")
	private String direccion;
	
	@Column(nullable=false)
	@NotEmpty(message="No puede estar vacio")
	private String telefono;
	
	//private String camion;

}
