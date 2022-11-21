package springpractica.demo.repository;

import java.util.ArrayList;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import springpractica.demo.model.Transferencia;

@Repository
public interface TransferenciaRepository extends CrudRepository<Transferencia, Long> {
	
	public ArrayList<Transferencia> findByclienteOrdenanteId (Long id);
	
	public ArrayList<Transferencia> findByclienteBeneficiarioId(Long id);


}
