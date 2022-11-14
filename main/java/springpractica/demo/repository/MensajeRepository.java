package springpractica.demo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import springpractica.demo.model.Mensaje;

@Repository
public interface MensajeRepository extends CrudRepository<Mensaje, Long> {

}
