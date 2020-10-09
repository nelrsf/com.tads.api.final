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
@Table(name="destinatario")
public class Destinatario implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4728837038521413322L;
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

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	
	
	

}
