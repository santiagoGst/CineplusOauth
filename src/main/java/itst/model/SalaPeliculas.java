package itst.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class SalaPeliculas {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private int id_Pelicula;
	private int id_Sala;
	private String horaPeli;
	

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getId_Pelicula() {
		return id_Pelicula;
	}
	public void setId_Pelicula(int id_Pelicula) {
		this.id_Pelicula = id_Pelicula;
	}
	public int getId_Sala() {
		return id_Sala;
	}
	public void setId_Sala(int id_Sala) {
		this.id_Sala = id_Sala;
	}
	public String getHoraPeli() {
		return horaPeli;
	}
	public void setHoraPeli(String horaPeli) {
		this.horaPeli = horaPeli;
	}
	
	public SalaPeliculas(int id,int id_Pelicula, int id_Sala, String horaPeli) {
		super();
		this.id = id;
		this.id_Pelicula = id_Pelicula;
		this.id_Sala = id_Sala;
		this.horaPeli = horaPeli;
	}
	
	public SalaPeliculas() {
		super();
	}
	
	
	
	
	
	
	
	

}
