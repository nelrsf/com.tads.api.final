package com.proyecto.web.models.services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.proyecto.web.models.dao.IConductorDao;
import com.proyecto.web.models.entity.Conductor;



@Service
public class ConductorServiceImpl implements IConductorService{
	
	@Autowired
	private IConductorDao conductorDao;

	@Override
	@Transactional
	public List<Conductor> findAll() {		
		return (List<Conductor>) conductorDao.findAll();
	}

	@Override
	public void save(Conductor conductor) {
		conductorDao.save(conductor);
		
	}

	@Override
	@Transactional
	public Conductor findById(Long id) {		
		return conductorDao.findById(id).orElse(null);
	}

	@Override
	@Transactional
	public void delete(Conductor conductor) {
		conductorDao.delete(conductor);
		
	}

}
