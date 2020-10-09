package com.proyecto.web.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.proyecto.web.models.entity.Conductor;

public interface IConductorDao extends CrudRepository<Conductor, Long>{

}
