package springpractica.demo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import springpractica.demo.model.Gestor;

@Repository
public interface GestorRepository extends CrudRepository<Gestor, Long>{
	
	
}