package com.proyecto.web.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.proyecto.web.models.entity.Remitente;
import com.proyecto.web.models.services.IRemitenteService;

@CrossOrigin(origins= {"http://localhost:4200"})
@RestController
@RequestMapping("/api")
public class RemitenteRestController {
	
	@Autowired
	private IRemitenteService remitenteService;
	
	@GetMapping("/remitente")
	public List<Remitente> index(){
		return remitenteService.findAll();
	}
	
	@GetMapping("/remitente/{id}")
	public Remitente show(@PathVariable Long id) {
		return this.remitenteService.findById(id);
	}
}
