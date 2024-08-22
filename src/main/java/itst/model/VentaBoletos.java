package itst.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class VentaBoletos {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String NomPeli;
	private int numAsiento;
	private int id_tipoBoletos;
	private int id_salas;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNomPeli() {
		return NomPeli;
	}
	public void setNomPeli(String nomPeli) {
		NomPeli = nomPeli;
	}
	public int getNumAsiento() {
		return numAsiento;
	}
	public void setNumAsiento(int numAsiento) {
		this.numAsiento = numAsiento;
	}
	public int getId_tipoBoletos() {
		return id_tipoBoletos;
	}
	public void setId_tipoBoletos(int id_tipoBoletos) {
		this.id_tipoBoletos = id_tipoBoletos;
	}
	public int getId_salas() {
		return id_salas;
	}
	public void setId_salas(int id_salas) {
		this.id_salas = id_salas;
	}
	
	public VentaBoletos(int id, String nomPeli, int numAsiento, int id_tipoBoletos, int id_salas) {
		super();
		this.id = id;
		NomPeli = nomPeli;
		this.numAsiento = numAsiento;
		this.id_tipoBoletos = id_tipoBoletos;
		this.id_salas = id_salas;
	}
	
	public VentaBoletos() {
		super();
	}
	
	
	
	
	
	

}
