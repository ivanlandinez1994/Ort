package ar.edu.ort.tp1.tp2.ejercicio6;

public class Autor {
	private String documento;
	private String nombre;
	private String apellido;
	
	public Autor() {
		this.documento = "";
		this.nombre = "";
		this.apellido = "";
	}
	
	public Autor(String documento, String nombre, String apellido) {
		this.documento = documento;
		this.nombre = nombre;
		this.apellido = apellido;
	}

	public String getDocumento() {
		return documento;
	}

	public void setDocumento(String documento) {
		this.documento = documento;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	
	
}
