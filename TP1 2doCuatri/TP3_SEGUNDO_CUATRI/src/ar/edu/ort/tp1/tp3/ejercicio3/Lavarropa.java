package ar.edu.ort.tp1.tp3.ejercicio3;

public class Lavarropa extends Producto{
	private double cargaMaxima;
	private TipoLavarropa tipoLavarropa;
	
	public Lavarropa(String marca, String modelo, double precio, double cargaMaxima, TipoLavarropa tipoLavarropa) {
		super(marca, modelo, precio);
		this.cargaMaxima = cargaMaxima;
		this.tipoLavarropa = tipoLavarropa;
	}
	
	public void setCargaMaxima(double cargaMaxima){ this.cargaMaxima = cargaMaxima;	}
	
	public double getCargaMaxima() { return cargaMaxima; }
	
	public void setTipoLavarropa(TipoLavarropa tipoLavarropa) { this.tipoLavarropa = tipoLavarropa; }
	
	public TipoLavarropa getTipoLavarropa() { return tipoLavarropa; }
	
	@Override
	public String toString() {
		return super.getMarca()+", modelo: "+super.getModelo()+", "+this.getTipoLavarropa()+", Capacidad: "+this.getCargaMaxima()+" Litros: $"+super.getPrecio();
	}
}
