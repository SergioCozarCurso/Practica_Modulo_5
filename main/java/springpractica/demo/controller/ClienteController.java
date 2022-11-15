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

import springpractica.demo.model.Cliente;
import springpractica.demo.service.ClienteService;


@RestController
@RequestMapping(path ="/cliente")
public class ClienteController {

	@Autowired
	ClienteService clienteService;
	
	
	@GetMapping()
	public ArrayList<Cliente> obtenerClientes(){
		
		return this.clienteService.obtenerClientes();
	}
	
	@GetMapping(path="/{id}")
	public Optional<Cliente> obtenerCliente(@PathVariable("id") Long id){
		
		return this.clienteService.obtenerCliente(id);
	}
	
	@PostMapping()
	public Cliente guardarCliente(@RequestBody Cliente cliente) {
		
		return this.clienteService.guardarCliente(cliente);
	}
	
	@DeleteMapping(path="/{id}")
	public boolean borrarCliente(@PathVariable("id") Long id){
		
		return this.clienteService.borrarCliente(id);
	}
}
