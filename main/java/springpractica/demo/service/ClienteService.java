package springpractica.demo.service;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import springpractica.demo.model.Cliente;
import springpractica.demo.repository.ClienteRepository;


@Service
public class ClienteService {

	@Autowired
	ClienteRepository clienteRepository;
	

	//Obtiene todos los clientes
	public ArrayList<Cliente> obtenerClientes(){
		
		return (ArrayList<Cliente>) this.clienteRepository.findAll();
	}
	
	
	//Obtiene un cliente
	public Optional<Cliente> obtenerCliente(Long id) {
		
		return this.clienteRepository.findById(id);
	}
	
	//Crea y Actualiza un cliente
	public Cliente guardarCliente(Cliente cliente) {
		return this.clienteRepository.save(cliente);
	}
	
	//Borra un cliente
	public boolean borrarCliente(Long id) {
		
		try {
			this.clienteRepository.deleteById(id);
			return true;
			
		}catch(Exception e){
			e.printStackTrace();
			return false;
		}
	}
	
	// Obtener por correo
	public Optional<Cliente> obtenerConCorreo(String correo){
		return this.clienteRepository.findByCorreo(correo);
	}
	
	// Login 
	public Optional<Cliente> obtenerConCorreoAndPassword(String correo, String password){
		return this.clienteRepository.findByCorreoAndPassword(correo, password);
	}

}
