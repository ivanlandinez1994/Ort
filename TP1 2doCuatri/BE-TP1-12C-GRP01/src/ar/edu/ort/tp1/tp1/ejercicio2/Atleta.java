package ar.edu.ort.tp1.tp1.ejercicio2;

public class Atleta {
	private String nombre;
	private double tiempo;
	private String especialidad;

	public Atleta() {
		this.nombre = "";
		this.tiempo = 0;
		this.especialidad = "";
	}
	
	public Atleta(String nombre, double tiempo, String especialidad) {
		this.nombre = nombre;
		this.tiempo = tiempo;
		this.especialidad = especialidad;
	}
	
	public String getEspecialidad() {
		return especialidad;
	}

	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setTiempo(double tiempo) {
		this.tiempo = tiempo;
	}

	public String getNombre() {
		return nombre;
	}

	public double getTiempo() {
		return tiempo;
	}

	@Override
	public String toString() {
		return "Atleta [nombre=" + nombre + ", tiempo=" + tiempo + ", especialidad=" + especialidad + "]";
	}
	
	
}
//podamos calcular quién fue el ganador de una carrera. Para eso ingresaremos un
//atleta y los segundos que ha empleado (con decimales) para recorrer la distancia de
//una especialidad determinada. debe tener en cuenta que puede haber más de un
//ganador (sus tiempos empleados fueron los mismos).