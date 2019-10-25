package ar.edu.ort.tp1.tp2.ejercicio3;
/*
Reutilizando las clases del ejercicio anterior, extender la clase Persona para que pueda
tener de 0 a N Mascotas (contiene el nombre y el tipo de animal, ambos String). Debe tener
los métodos necesarios para agregar nuevos datos o eliminar cada uno de los existentes
(menos los datos de la persona). Determinar si corresponde utilizar composición y
agregación.
 */
public class Mascota {
	String nombre;
	String tipoAnimal;
	
	public Mascota(){
		this.nombre="";
		this.tipoAnimal="";
	}
	
	public Mascota(String nombre, String tipoAnimal){
		this.setNombre(nombre);
		this.setTipoAnimal(tipoAnimal);
	}
	
	public boolean setNombre(String nombre){
		if(!nombre.isEmpty()){
			this.nombre=nombre;
			return true;
		}
		return false;
	}
	
	public boolean setTipoAnimal(String tipoAnimal){
		if(!tipoAnimal.isEmpty()){
			this.tipoAnimal=tipoAnimal;
			return true;
		}
		return false;
	}
	
	public String getNombre(){
		return nombre;
	}
	
	public String getTipoAnimal(){
		return tipoAnimal;
	}
	
	public String mostrar(){
		return this.getTipoAnimal()+", "+this.getNombre();
	}
}
