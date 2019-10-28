package ar.edu.ort.tp1.tp3.ejercicio3;

public class Heladera extends Producto{
	private double capacidad;
	private boolean esFrost;
	
	public Heladera(String marca, String modelo, double precio, double capacidad, boolean esFrost) {
		super(marca, modelo, precio);
		this.capacidad = capacidad;
		this.esFrost = esFrost;
	}
	
	public void setCapacidad(double capacidad){ this.capacidad = capacidad;	}
	
	public double getCapacidad() { return capacidad; }
	
	public void setEsFrost(boolean esFrost) { this.esFrost = esFrost; }
	
	public boolean getEsFrost() { return esFrost; }

	@Override
	public String toString() {
		return super.getMarca()+", Modelo: "+super.getModelo()+ ", frost: "+this.getEsFrost()+", Capacidad: "+this.getCapacidad()+" Litros: $"+super.getPrecio();
	}
	

	
	
	
}
