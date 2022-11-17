package springpractica.demo.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import springpractica.demo.model.Cliente;


@Repository
public interface ClienteRepository extends CrudRepository<Cliente, Long>{
	
	public Optional<Cliente> findByCorreo (String correo);
	
	public Optional<Cliente> findByCorreoAndPassword (String correo, String password);

}

