package springpractica.demo.model;

import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="mensaje")
public class Mensaje {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private Long id_origen;
	private Long id_destino;
	private String texto;
	private Timestamp fecha;
	
	public Mensaje() {
		
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getId_origen() {
		return id_origen;
	}

	public void setId_origen(Long id_origen) {
		this.id_origen = id_origen;
	}

	public Long getId_destino() {
		return id_destino;
	}

	public void setId_destino(Long id_destino) {
		this.id_destino = id_destino;
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

	public Timestamp getFecha() {
		return fecha;
	}

	public void setFecha(Timestamp fecha) {
		this.fecha = fecha;
	}
	
	

}
