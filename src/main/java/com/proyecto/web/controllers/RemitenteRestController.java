package com.proyecto.web.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
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
	
	@PostMapping("/remitente")
	@ResponseStatus(HttpStatus.CREATED)
	public Remitente create(@RequestBody Remitente remitente) {
		this.remitenteService.save(remitente);
		return remitente;
	}
	
	
	@PutMapping("/remitente/{id}")
	@ResponseStatus(HttpStatus.CREATED)
	public Remitente update(@RequestBody Remitente remitente, @PathVariable long id) {
		Remitente actualRemitente = this.remitenteService.findById(id);
		actualRemitente.setNombre(remitente.getNombre());
		actualRemitente.setApellido(remitente.getApellido());
		actualRemitente.setDireccion(remitente.getDireccion());
		actualRemitente.setTelefono(remitente.getTelefono());
		this.remitenteService.save(actualRemitente);
		return actualRemitente;
	}
	
	@DeleteMapping("/remitente/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete(@PathVariable long id) {
		Remitente actualRemitente = this.remitenteService.findById(id);
		this.remitenteService.delete(actualRemitente);
	}
	
	
}
