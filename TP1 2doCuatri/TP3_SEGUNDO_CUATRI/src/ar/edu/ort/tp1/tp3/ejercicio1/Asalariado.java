package ar.edu.ort.tp1.tp3.ejercicio1;

public class Asalariado extends Empleado{
	private float sueldo;
	public Asalariado(String nombre, int edad, float sueldo){
		super(nombre, edad);
		this.sueldo = sueldo;
	}
	
	@Override
	public float calcularPago(){
		return sueldo;
	}

	@Override
	public String toString() {
		return super.toString() + " - " + sueldo;
	}
	
	
}
