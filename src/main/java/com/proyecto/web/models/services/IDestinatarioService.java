package com.proyecto.web.models.services;

import java.util.List;

import com.proyecto.web.models.entity.Destinatario;


public interface IDestinatarioService {
	
	public List<Destinatario>  findAll();
	public void save(Destinatario destinatario);
	public Destinatario findById(Long id);
	public void delete(Destinatario destinatario);

}
