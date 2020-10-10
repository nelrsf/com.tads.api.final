package com.proyecto.web.models.services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.proyecto.web.models.dao.IDestinatarioDao;
import com.proyecto.web.models.entity.Destinatario;


@Service
public class DestinatarioServiceImpl implements IDestinatarioService{
	
	@Autowired
	private IDestinatarioDao destinatarioDao;

	@Override
	@Transactional
	public List<Destinatario> findAll() {		
		return (List<Destinatario>) destinatarioDao.findAll();
	}

	@Override
	public void save(Destinatario remitente) {
		destinatarioDao.save(remitente);
		
	}

	@Override
	@Transactional
	public Destinatario findById(Long id) {		
		return destinatarioDao.findById(id).orElse(null);
	}

	@Override
	@Transactional
	public void delete(Destinatario destinatario) {
		destinatarioDao.delete(destinatario);
		
	}

}
