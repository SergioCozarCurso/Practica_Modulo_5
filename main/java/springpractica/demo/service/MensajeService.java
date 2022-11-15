package springpractica.demo.service;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import springpractica.demo.model.Mensaje;
import springpractica.demo.repository.MensajeRepository;


@Service
public class MensajeService {

	@Autowired
	MensajeRepository mensajeRepository;
	

	//Obtiene todos los mensajes
	public ArrayList<Mensaje> obtenerMensajes(){
		
		return (ArrayList<Mensaje>) this.mensajeRepository.findAll();
	}
	
	
	//Obtiene un mensaje
	public Optional<Mensaje> obtenerMensaje(Long id) {
		
		return this.mensajeRepository.findById(id);
	}
	
	
	//Crea y Actualiza un mensaje
	public Mensaje guardarMensaje(Mensaje mensaje) {
		
		return this.mensajeRepository.save(mensaje);
	}
	
	//Borra un mensaje
	public boolean borrarMensaje(Long id) {
		
		try {
			this.mensajeRepository.deleteById(id);
			return true;
			
		}catch(Exception e){
			e.printStackTrace();
			return false;
		}
	}

}
