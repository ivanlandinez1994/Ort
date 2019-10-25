package ar.edu.ort.tp1.tp2.ejercicio5;
import java.util.ArrayList;

public class Vivienda {
	Direccion direccion;
	ArrayList<Persona> personas;
	ArrayList<Mueble> muebles;
		
	public Vivienda(Direccion direccion) {
		this.direccion = new Direccion(direccion.getCalle(),direccion.getAltura());
		this.personas = new ArrayList<Persona>();
		this.muebles = new ArrayList<Mueble>();
	}

	public Direccion getDireccion() {
		return direccion;
	}

	public ArrayList<Persona> getPersonas() {
		return personas;
	}

	public boolean agregarPersona(Persona persona) {
		if(persona !=null) {
			this.personas.add(persona);
			return true;
		}
		return false;
	}
	
	public boolean agregarPersonas(ArrayList<Persona> personas) {
		if(personas !=null) {
			for(Persona aux:personas){
				this.agregarPersona(aux);
			}			
			return true;
		}
		return false;
	}
	
	public ArrayList<Mueble> getMuebles() {
		return muebles;
	}

	public boolean agregarMueble(Mueble mueble) {
		if(mueble!=null) {
			this.muebles.add(mueble);
			return true;
		}
		return false;
	}
	
	public boolean agregarMuebles(ArrayList<Mueble> muebles) {		
		if(muebles!=null) {
			for(Mueble aux:muebles){
				this.agregarMueble(aux);
			}			
			return true;
		}
		return false;
	}
	
	public void removerMuebles(){
		this.muebles.clear();
	}
	
	public void removerPersonas(){
		this.personas.clear();
	}
	
	public void mostrarTodo(){
		System.out.println(direccion.toString());
		System.out.println("Personas:");
		for(Persona aux: personas){
			System.out.println(aux.toString());
		}
		System.out.println("Muebles:");
		for(Mueble aux: muebles){
			System.out.println(aux.toString());
		}
	}
}
