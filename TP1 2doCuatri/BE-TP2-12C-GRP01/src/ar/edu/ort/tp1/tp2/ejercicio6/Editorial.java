package ar.edu.ort.tp1.tp2.ejercicio6;

public class Editorial {
	private String codigoEditorial;
	private String nombreEditorial;
	
	public Editorial() {
		this.codigoEditorial = "";
		this.nombreEditorial = "";
	}
	
	public Editorial(String codigoEditorial, String nombreEditorial) {
		this.codigoEditorial = codigoEditorial;
		this.nombreEditorial = nombreEditorial;
	}
	
	public String getCodigoEditorial() {
		return codigoEditorial;
	}
	public void setCodigoEditorial(String codigoEditorial) {
		this.codigoEditorial = codigoEditorial;
	}
	public String getNombreEditorial() {
		return nombreEditorial;
	}
	public void setNombreEditorial(String nombreEditorial) {
		this.nombreEditorial = nombreEditorial;
	}
	
	
}
