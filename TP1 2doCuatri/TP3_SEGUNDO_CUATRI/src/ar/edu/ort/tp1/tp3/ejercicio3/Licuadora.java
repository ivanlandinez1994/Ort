package ar.edu.ort.tp1.tp3.ejercicio3;

public class Licuadora extends Producto{
	private double potencia;
	private int cantVelocidades;
	
	public Licuadora(String marca, String modelo, double precio, double potencia, int cantVelocidades) {
		super(marca, modelo, precio);
		this.potencia = potencia;
		this.cantVelocidades = cantVelocidades;
	}
	
	public void setPotencia(double potencia){ this.potencia = potencia;	}
	
	public double getPotencia() { return potencia; }
	
	public void setCantVelocidades(int cantVelocidades) { this.cantVelocidades = cantVelocidades; }
	
	public int getCantVelocidades() { return cantVelocidades; }
	
	@Override
	public String toString() {
		return super.getMarca()+", Modelo: "+super.getModelo()+ ", Cantidad de Velocidades: "+this.getCantVelocidades()+", Potencia "+this.getPotencia()+" $"+super.getPrecio();
	}
	
}
