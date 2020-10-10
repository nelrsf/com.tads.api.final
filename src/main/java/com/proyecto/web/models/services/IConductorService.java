package com.proyecto.web.models.services;

import java.util.List;

import com.proyecto.web.models.entity.Conductor;



public interface IConductorService {
	
	public List<Conductor>  findAll();
	public void save(Conductor conductor);
	public Conductor findById(Long id);
	public void delete(Conductor conductor);

}
