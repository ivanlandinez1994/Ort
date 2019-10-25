package ar.edu.ort.tp1.tp2.ejercicio6;

public class Cliente {
	private String nombre;
	private String apellido;
	private String dni;
	private String email;
	private Direccion direccionEnvio;
	
	public Cliente() {
		this.nombre = "";
		this.apellido = "";
		this.dni = "";
		this.email = "";
		this.direccionEnvio = new Direccion();
	}
	
	public Cliente(String nombre, String apellido, String dni) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
		this.email = "";
		this.direccionEnvio = new Direccion();
	}
	
	public Cliente(String nombre, String apellido, String dni, String email, Direccion direccionEnvio) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
		this.email = email;
		this.direccionEnvio = new Direccion(direccionEnvio.getCalle(),direccionEnvio.getAltura(),direccionEnvio.getPiso(),direccionEnvio.getDpto());
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

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Direccion getDireccionEnvio() {
		return direccionEnvio;
	}

	public void setDireccionEnvio(Direccion direccionEnvio) {
		this.direccionEnvio = direccionEnvio;
	}
	
	
}
