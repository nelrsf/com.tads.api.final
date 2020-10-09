package com.proyecto.web.models.services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.proyecto.web.models.dao.IRemitenteDao;
import com.proyecto.web.models.entity.Remitente;

@Service
public class RemitenteServiceImpl implements IRemitenteService{
	
	@Autowired
	private IRemitenteDao remitenteDao;

	@Override
	@Transactional
	public List<Remitente> findAll() {		
		return (List<Remitente>) remitenteDao.findAll();
	}

	@Override
	public void save(Remitente remitente) {
		remitenteDao.save(remitente);
		
	}

	@Override
	@Transactional
	public Remitente findById(Long id) {		
		return remitenteDao.findById(id).orElse(null);
	}

	@Override
	@Transactional
	public void delete(Remitente remitente) {
		remitenteDao.delete(remitente);
		
	}

}
