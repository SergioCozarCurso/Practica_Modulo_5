package springpractica.demo.service;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import springpractica.demo.model.Transferencia;
import springpractica.demo.repository.TransferenciaRepository;



@Service
public class TransferenciaService {

	@Autowired
	TransferenciaRepository transferenciaRepository;
	

	//Obtiene todas las transferencias
	public ArrayList<Transferencia> obtenerTransferencias(){
		
		return (ArrayList<Transferencia>) this.transferenciaRepository.findAll();
	}
	
	
	//Obtiene una transferencia
	public Optional<Transferencia> obtenerTransferencia(Long id) {
		
		return this.transferenciaRepository.findById(id);
	}
	
	
	//Crea y Actualiza una transferencia
	public Transferencia guardarTransferencia(Transferencia transferencia) {
		
		return this.transferenciaRepository.save(transferencia);
	}
	
	//Borra una transferencia
	public boolean borrarTransferencia(Long id) {
		
		try {
			this.transferenciaRepository.deleteById(id);
			return true;
			
		}catch(Exception e){
			e.printStackTrace();
			return false;
		}
	}
	
	public ArrayList<Transferencia> obtenerPorClienteOrdenanteId(Long id){
		return this.transferenciaRepository.findByclienteOrdenanteId(id);
	}
	
	public ArrayList<Transferencia> obtenerPorIdClienteBeneficiarioId(Long id){
		return this.transferenciaRepository.findByclienteBeneficiarioId(id);
	}

}
