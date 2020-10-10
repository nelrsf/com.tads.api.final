package com.proyecto.web.models.services;

import java.util.List;

import com.proyecto.web.models.entity.Remitente;


public interface IRemitenteService {
	
	public List<Remitente>  findAll();
	public void save(Remitente remitente);
	public Remitente findById(Long id);
	public void delete(Remitente remitente);

}
