package com.proyecto.web.models.entity;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
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
	 
	private String MotivoDevolucion;

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

	public String getMotivoDevolucion() {
		// TODO Auto-generated method stub
		return this.MotivoDevolucion;
	}

	public void setMotivoDevolucion(String motivoDevolucion) {
		// TODO Auto-generated method stub
		this.MotivoDevolucion = motivoDevolucion;
	}
	 
	 

}
