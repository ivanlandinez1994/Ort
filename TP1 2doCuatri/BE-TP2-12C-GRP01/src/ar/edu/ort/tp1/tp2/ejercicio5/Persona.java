package ar.edu.ort.tp1.tp2.ejercicio5;

public class Persona {
	private String nombre;
	private String apellido;
	private int edad;
	
	public Persona(){
		this.nombre = "";
		this.apellido = "";
		this.edad = 0;
	}
	
	public Persona(String nombre, String apellido) {
		this.nombre = nombre;
		this.apellido = apellido;
	}
	
	public Persona(String nombre, String apellido, int edad) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad=edad;
	}

	public String getNombre() {
		return nombre;
	}

	public boolean setNombre(String nombre) {
		if(!nombre.isEmpty()) {
			this.nombre = nombre;
			return true;
		}
		return false;
	}

	public String getApellido() {
		return apellido;
	}

	public boolean setApellido(String apellido) {
		if(!apellido.isEmpty()) {
			this.apellido = apellido;
			return true;
		}
		return false;
	}

	public int getEdad() {
		return edad;
	}

	public boolean setEdad(int edad) {
		if(edad>0) {
			this.edad = edad;
			return true;
		}
		return false;
	}

	@Override
	public String toString() {
		return "Nombre: " + this.nombre +" "+this.apellido+", Edad: " +this.edad;
	}
	
}
