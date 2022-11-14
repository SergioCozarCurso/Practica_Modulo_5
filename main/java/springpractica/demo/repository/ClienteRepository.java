package springpractica.demo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import springpractica.demo.model.Cliente;


@Repository
public interface ClienteRepository extends CrudRepository<Cliente, Long>{

}
