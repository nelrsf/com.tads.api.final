package com.proyecto.web.models.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

@Entity
@Table(name="paquete")
public class Paquete implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -3481619253998559263L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	//@ManyToOne(optional = false, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@NotEmpty(message="No puede estar vacio")
	private Long destinatario;
	 
	//@ManyToOne(optional = false, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @NotEmpty(message="No puede estar vacio")
    private Long remitente;
    
    @NotEmpty(message="No puede estar vacio")
    private Long conductor;
	 
    @NotEmpty(message="No puede estar vacio")
	private String descripcion;
	
    @NotEmpty(message="No puede estar vacio")
	private Long peso;

	
	
	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Long getPeso() {
		return peso;
	}

	public void setPeso(Long peso) {
		this.peso = peso;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getDestinatario() {
		return destinatario;
	}

	public void setDestinatario(Long destinatario) {
		this.destinatario = destinatario;
	}

	public Long getRemitente() {
		return remitente;
	}

	public void setRemitente(Long remitente) {
		this.remitente = remitente;
	}

	public Long getConductor() {
		return conductor;
	}

	public void setConductor(Long conductor) {
		this.conductor = conductor;
	}

}
