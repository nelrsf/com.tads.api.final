package com.proyecto.web.models.services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.proyecto.web.models.dao.IPaqueteDao;
import com.proyecto.web.models.entity.Paquete;


@Service
public class PaqueteServiceImpl implements IPaqueteService{
	
	@Autowired
	private IPaqueteDao paqueteDao;

	@Override
	@Transactional
	public List<Paquete> findAll() {		
		return (List<Paquete>) paqueteDao.findAll();
	}

	@Override
	public void save(Paquete paquete) {
		paqueteDao.save(paquete);
		
	}

	@Override
	@Transactional
	public Paquete findById(Long id) {		
		return paqueteDao.findById(id).orElse(null);
	}

	@Override
	@Transactional
	public void delete(Paquete paquete) {
		paqueteDao.delete(paquete);
		
	}

}
