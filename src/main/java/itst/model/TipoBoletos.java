package itst.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class TipoBoletos {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String tipoBoleto;
	private double cantidadBoleto;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTipoBoleto() {
		return tipoBoleto;
	}
	public void setTipoBoleto(String tipoBoleto) {
		this.tipoBoleto = tipoBoleto;
	}
	public double getCantidadBoleto() {
		return cantidadBoleto;
	}
	public void setCantidadBoleto(double cantidadBoleto) {
		this.cantidadBoleto = cantidadBoleto;
	}
	
	
	public TipoBoletos(int id, String tipoBoleto, double cantidadBoleto) {
		super();
		this.id = id;
		this.tipoBoleto = tipoBoleto;
		this.cantidadBoleto = cantidadBoleto;
	}
	
	public TipoBoletos() {
		super();
	}
	
	
	
	
	
	

}
