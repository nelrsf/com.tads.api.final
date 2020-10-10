package com.proyecto.web.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
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
import org.springframework.http.HttpStatus;

import com.proyecto.web.models.entity.Conductor;
import com.proyecto.web.models.services.IConductorService;


@CrossOrigin(origins= {"http://localhost:4200",
                       "https://frontend-final-tads.web.app"})
@RestController
@RequestMapping("/api")
public class ConductorRestController {
	
	@Autowired
	private IConductorService conductorService;
	
	@GetMapping("/conductor")
	public List<Conductor> index(){
		return conductorService.findAll();
	}
	
	@GetMapping("/conductor/{id}")
	public Conductor show(@PathVariable Long id) {
		return this.conductorService.findById(id);
	}
	
	@PostMapping("/conductor")
	@ResponseStatus(HttpStatus.CREATED)
	public Conductor create(@RequestBody Conductor conductor) {
		this.conductorService.save(conductor);
		return conductor;
	}
	
	
	@PutMapping("/conductor/{id}")
	@ResponseStatus(HttpStatus.CREATED)
	public Conductor update(@RequestBody Conductor conductor, @PathVariable long id) {
		Conductor actualConductor = this.conductorService.findById(id);
		actualConductor.setNombre(conductor.getNombre());
		actualConductor.setApellido(conductor.getApellido());
		actualConductor.setDireccion(conductor.getDireccion());
		actualConductor.setTelefono(conductor.getTelefono());
		actualConductor.setCamion(conductor.getCamion());
		this.conductorService.save(conductor);
		return actualConductor;
	}
	
	@DeleteMapping("/conductor/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete(@PathVariable long id) {
		Conductor actualConductor = this.conductorService.findById(id);
		this.conductorService.delete(actualConductor);
	}
}
