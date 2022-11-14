package springpractica.demo.controller;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;

import springpractica.demo.model.Gestor;
import springpractica.demo.service.GestorService;




@RestController
@RequestMapping(path ="/gestor")
public class GestorController {

	@Autowired
	GestorService gestorService;
	
	
	@GetMapping()
	public ArrayList<Gestor> obtenerGestores(){
		
		return this.gestorService.obtenerGestores();
	}
	
	@GetMapping(path="/{id}")
	public Optional<Gestor> obtenerGestor(@PathVariable("id") Long id){
		
		return this.gestorService.obtenerGestor(id);
	}
	
	@PostMapping()
	public Gestor guardarGestor(@RequestBody Gestor gestor) {
		
		return this.gestorService.guardarGestor(gestor);
	}
	
	@DeleteMapping(path="/{id}")
	public boolean borrarGestor(@PathVariable("id") Long id){
		
		return this.gestorService.borrarGestor(id);
	}

}
