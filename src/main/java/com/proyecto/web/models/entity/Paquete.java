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
	
	 @ManyToOne(optional = false, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private Destinatario destinatario;
	 
	 @ManyToOne(optional = false, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	    private Remitente remitente;

}
