package com.proyecto.web.models.services;

import java.util.List;

import com.proyecto.web.models.entity.Paquete;


public interface IPaqueteService {
	
	public List<Paquete>  findAll();
	public void save(Paquete paquete);
	public Paquete findById(Long id);
	public void delete(Paquete paquete);

}
