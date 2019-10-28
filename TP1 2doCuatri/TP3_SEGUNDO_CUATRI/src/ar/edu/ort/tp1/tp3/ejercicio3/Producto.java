package ar.edu.ort.tp1.tp3.ejercicio3;

public class Producto {
	private String marca;
	private String modelo;
	private double precio;
	
	public Producto() {
		
	}
	
	public Producto(String marca, String modelo, double precio) {
		this.marca = marca;
		this.modelo = modelo;
		this.precio = precio;
	}
	
	public void setMarca(String marca) { this.marca = marca; } 
	
	public String getMarca() { return marca; }
	
	public void setModelo(String modelo) { this.modelo = modelo; }
	
	public String getModelo() { return modelo; }
	
	public void setPrecio(double precio) { this.precio = precio; }
	
	public double getPrecio() {	return precio; }
	
	@Override
	public String toString() {
		return marca+", Modelo: "+modelo+", Precio: "+precio;
	}
	
}
