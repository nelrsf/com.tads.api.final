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

import com.proyecto.web.models.entity.Paquete;
import com.proyecto.web.models.services.IPaqueteService;


@CrossOrigin(origins= {"http://localhost:4200",
                       "https://frontend-final-tads.web.app"})
@RestController
@RequestMapping("/api")
public class PaqueteRestController {
	
	@Autowired
	private IPaqueteService paqueteService;
	
	@GetMapping("/paquete")
	public List<Paquete> index(){
		return paqueteService.findAll();
	}
	
	@GetMapping("/paquete/{id}")
	public Paquete show(@PathVariable Long id) {
		return this.paqueteService.findById(id);
	}
	
	@PostMapping("/paquete")
	@ResponseStatus(HttpStatus.CREATED)
	public Paquete create(@RequestBody Paquete paquete) {
		this.paqueteService.save(paquete);
		return paquete;
	}
		
	
	@PutMapping("/paquete/{id}")
	@ResponseStatus(HttpStatus.CREATED)
	public Paquete update(@RequestBody Paquete paquete, @PathVariable long id) {
		Paquete actualPaquete = this.paqueteService.findById(id);
		actualPaquete.setDestinatario(paquete.getDestinatario());
		actualPaquete.setRemitente(paquete.getRemitente());
		actualPaquete.setDescripcion(paquete.getDescripcion());
		actualPaquete.setPeso(paquete.getPeso());
		this.paqueteService.save(paquete);
		return actualPaquete;
	}
	
	@DeleteMapping("/paquete/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete(@PathVariable long id) {
		Paquete actualPaquete = this.paqueteService.findById(id);
		this.paqueteService.delete(actualPaquete);
	}
}
