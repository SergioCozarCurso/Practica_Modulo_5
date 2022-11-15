package springpractica.demo.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import springpractica.demo.model.Gestor;

@Repository
public interface GestorRepository extends CrudRepository<Gestor, Long>{
	
	
	public Optional<Gestor> findByCorreo (String correo);
	
	public Optional<Gestor> findByCorreoAndPassword (String correo, String password);
	
	
	
}