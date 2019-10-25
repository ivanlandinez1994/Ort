package ar.edu.ort.tp1.tp2.ejercicio3;

import java.util.ArrayList;

/*
Reutilizando las clases del ejercicio anterior, agregar la clase Hito (con fecha, descripción,
personas involucradas) para poder agregar momentos importantes en la vida de la persona
(puede tener 0 a N). Un mismo hito puede ser utilizado para más de una persona.
 */
public class Hito {
	private String fecha;
	private String descripcion;
	private ArrayList<Persona> involucrados;
	
	public Hito(String fecha, String descripcion){
		this.setFecha(fecha);
		this.setDescripcion(descripcion);
		this.involucrados = new ArrayList<Persona>();
	}
	
	public Hito(String fecha, String descripcion, ArrayList<Persona> involucrados) {
		this.setFecha(fecha);
		this.setDescripcion(descripcion);
		this.involucrados = new ArrayList<Persona>();
		this.involucrados = involucrados;
	}

	public Hito(String fecha, String descripcion, Persona involucrado) {
		this.setFecha(fecha);
		this.setDescripcion(descripcion);
		this.involucrados = new ArrayList<Persona>();
		this.involucrados.add(involucrado);
	}

	public boolean setFecha(String fecha) {
		if (!fecha.isEmpty()) {
			this.fecha = fecha;
			return true;
		}
		return false;
	}

	public boolean setDescripcion(String descripcion) {
		if(!descripcion.isEmpty()) {
			this.descripcion = descripcion;
			return true;
		}
		return false;
	}
	
	public String getFecha() {
		return fecha;
	}

	public String getDescripcion() {
		return descripcion;
	}
	
	public boolean agregarPersona(Persona involucrado) {
		if (!existeInvolucrado(involucrado)) {
			this.involucrados.add(involucrado);
			return true;
		}
		return false;
	}

	private boolean existeInvolucrado(Persona involucrado) {
		boolean existe= false;
		int index=0;
		while(!existe && index<involucrados.size()){
			if(involucrados.get(index).getApellido().equalsIgnoreCase(involucrado.getApellido())
				&& involucrados.get(index).getNombre().equalsIgnoreCase(involucrado.getNombre())){
				existe=true;
			}
			index++;
		}
		return existe;
	}
	
	public void mostrarHito() {
		System.out.println("Fecha: "+this.fecha+", Descripcion: "+this.descripcion);
		System.out.println("Involucrados: ");
		for(Persona aux: involucrados) {
			System.out.println(aux.getNombre()+" "+aux.getApellido());
		}
	}
}
