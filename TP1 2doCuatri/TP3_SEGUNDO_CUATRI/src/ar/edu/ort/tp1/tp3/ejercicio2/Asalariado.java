package ar.edu.ort.tp1.tp3.ejercicio2;

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
}
