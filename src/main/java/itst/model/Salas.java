package itst.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Salas {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int Id;
	private int NumSala;
	private int CanAsientos;
	private int Id_Pelicula;
	
	
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public int getNumSala() {
		return NumSala;
	}
	public void setNumSala(int numSala) {
		NumSala = numSala;
	}
	public int getCanAsientos() {
		return CanAsientos;
	}
	public void setCanAsientos(int canAsientos) {
		CanAsientos = canAsientos;
	}
	public int getId_Pelicula() {
		return Id_Pelicula;
	}
	public void setId_Pelicula(int id_Pelicula) {
		Id_Pelicula = id_Pelicula;
	}
	
	
	public Salas(int id, int numSala, int canAsientos, int id_Pelicula) {
		super();
		Id = id;
		NumSala = numSala;
		CanAsientos = canAsientos;
		Id_Pelicula = id_Pelicula;
	}
	
	public Salas() {
		super();
		
	}
	
	
	
	
	
	
	
	
	

}
