package springpractica.demo.service;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import springpractica.demo.model.Gestor;
import springpractica.demo.repository.GestorRepository;





@Service
public class GestorService {
	
	@Autowired
	GestorRepository gestorRepository;
	

	//Obtiene todos los gestores
	public ArrayList<Gestor> obtenerGestores(){
		
		return (ArrayList<Gestor>) this.gestorRepository.findAll();
	}
	
	
	//Obtiene un gestor
	public Optional<Gestor> obtenerGestor(Long id) {
		
		return this.gestorRepository.findById(id);
	}
	
	//Crea y Actualiza un gestor
	public Gestor guardarGestor(Gestor gestor) {
		// Si el gestor tiene id existente lo actualiza, si no lo crea.
		return this.gestorRepository.save(gestor);
	}
	
	public boolean borrarGestor(Long id) {
		
		try {
			this.gestorRepository.deleteById(id);
			return true;
			
		}catch(Exception e){
			e.printStackTrace();
			return false;
		}
	}

}
