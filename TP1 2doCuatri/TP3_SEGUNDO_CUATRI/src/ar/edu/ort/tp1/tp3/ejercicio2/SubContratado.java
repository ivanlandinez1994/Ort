package ar.edu.ort.tp1.tp3.ejercicio2;

public class SubContratado extends Empleado{
	private float precioHora;
	private int horas;
	public SubContratado(String nombre, int edad, float precioHora, int horas){
		super(nombre, edad);
		this.precioHora = precioHora;
		this.horas= horas;
	}
	
	@Override
	public float calcularPago(){
		return precioHora*horas;
	}

	@Override
	public String toString() {
		return (super.toString() +" - " + calcularPago());
	}
	
	
}
