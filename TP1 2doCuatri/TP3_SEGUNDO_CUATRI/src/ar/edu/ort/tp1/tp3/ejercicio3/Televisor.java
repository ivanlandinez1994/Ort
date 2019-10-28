package ar.edu.ort.tp1.tp3.ejercicio3;

public class Televisor extends Producto{
	private double pulgadas;
	private boolean esSmart;
	
	public Televisor(String marca, String modelo, double precio, double pulgadas, boolean esSmart) {
		super(marca, modelo, precio);
		this.pulgadas = pulgadas;
		this.esSmart = esSmart;
	}
	
	public void setPulgadas(double pulgadas){ this.pulgadas = pulgadas;	}
	
	public double getPulgadas() { return pulgadas; }
	
	public void setEsSmart(boolean esSmart) { this.esSmart = esSmart; }
	
	public boolean getEsSmart() { return esSmart; }
	
	@Override
	public String toString() {
		String smart;
		if (esSmart)
			smart="Smart";
		else
			smart="Común";
		return super.getMarca() + " "+smart+", "+ pulgadas + " pulgadas, modelo "+super.getModelo()+": $"+super.getPrecio();
	}
	
}
