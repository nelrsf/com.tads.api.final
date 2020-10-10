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

import com.proyecto.web.models.entity.Destinatario;
import com.proyecto.web.models.services.IDestinatarioService;


@CrossOrigin(origins= {"http://localhost:4200",
                       "https://frontend-final-tads.web.app"})
@RestController
@RequestMapping("/api")
public class DestinatarioRestController {
	
	@Autowired
	private IDestinatarioService destinatarioService;
	
	@GetMapping("/destinatario")
	public List<Destinatario> index(){
		return destinatarioService.findAll();
	}
	
	@GetMapping("/destinatario/{id}")
	public Destinatario show(@PathVariable Long id) {
		return this.destinatarioService.findById(id);
	}
	
	@PostMapping("/destinatario")
	@ResponseStatus(HttpStatus.CREATED)
	public Destinatario create(@RequestBody Destinatario destinatario) {
		this.destinatarioService.save(destinatario);
		return destinatario;
	}
	
	
	@PutMapping("/destinatario/{id}")
	@ResponseStatus(HttpStatus.CREATED)
	public Destinatario update(@RequestBody Destinatario destinatario, @PathVariable long id) {
		Destinatario actualDestinatario = this.destinatarioService.findById(id);
		actualDestinatario.setNombre(destinatario.getNombre());
		actualDestinatario.setApellido(destinatario.getApellido());
		actualDestinatario.setDireccion(destinatario.getDireccion());
		actualDestinatario.setTelefono(destinatario.getTelefono());
		this.destinatarioService.save(destinatario);
		return actualDestinatario;
	}
	
	@DeleteMapping("/destinatario/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete(@PathVariable long id) {
		Destinatario actualDestinatario = this.destinatarioService.findById(id);
		this.destinatarioService.delete(actualDestinatario);
	}
}
