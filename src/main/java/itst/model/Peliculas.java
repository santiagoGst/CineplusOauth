package itst.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Peliculas {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String nomPeli;
	private int duracion;
	private String idioma;
	private int id_clasificacion;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNomPeli() {
		return nomPeli;
	}
	public void setNomPeli(String nomPeli) {
		this.nomPeli = nomPeli;
	}
	public int getDuracion() {
		return duracion;
	}
	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}
	public String getIdioma() {
		return idioma;
	}
	public void setIdioma(String idioma) {
		this.idioma = idioma;
	}
	public int getId_clasificacion() {
		return id_clasificacion;
	}
	public void setId_clasificacion(int id_clasificacion) {
		this.id_clasificacion = id_clasificacion;
	}
	
	public Peliculas(int id, String nomPeli, int duracion, String idioma, int id_clasificacion) {
		super();
		this.id = id;
		this.nomPeli = nomPeli;
		this.duracion = duracion;
		this.idioma = idioma;
		this.id_clasificacion = id_clasificacion;
	}
	
	public Peliculas() {
		super();
	}
	
	
	
	
	
	
	
}
