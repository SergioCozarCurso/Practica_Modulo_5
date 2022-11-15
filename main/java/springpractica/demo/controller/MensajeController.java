package springpractica.demo.controller;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import springpractica.demo.model.Mensaje;
import springpractica.demo.service.MensajeService;

@RestController
@RequestMapping(path ="/mensaje")
public class MensajeController {

	@Autowired
	MensajeService mensajeService;
	
	
	@GetMapping()
	public ArrayList<Mensaje> obtenerMensajes(){
		
		return this.mensajeService.obtenerMensajes();
	}
	
	@GetMapping(path="/{id}")
	public Optional<Mensaje> obtenerMensaje(@PathVariable("id") Long id){
		
		return this.mensajeService.obtenerMensaje(id);
	}
	
	@PostMapping()
	public Mensaje guardarMensaje(@RequestBody Mensaje mensaje) {
		
		return this.mensajeService.guardarMensaje(mensaje);
	}
	
	@DeleteMapping(path="/{id}")
	public boolean borrarMensaje(@PathVariable("id") Long id){
		
		return this.mensajeService.borrarMensaje(id);
	}

}
