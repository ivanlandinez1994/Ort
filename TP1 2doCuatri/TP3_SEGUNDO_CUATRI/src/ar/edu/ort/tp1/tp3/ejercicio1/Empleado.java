package ar.edu.ort.tp1.tp3.ejercicio1;

public class Empleado {
	private String nombre;
	private int edad;
	
	public Empleado(String nombre, int edad){
		this.nombre = nombre;
		this.edad = edad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	public float calcularPago(){
		return 0;
	}

	@Override
	public String toString() {
		return nombre;
	}
}
