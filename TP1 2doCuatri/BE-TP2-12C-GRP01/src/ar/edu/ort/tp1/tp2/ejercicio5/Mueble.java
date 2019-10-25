package ar.edu.ort.tp1.tp2.ejercicio5;

public class Mueble {
	private String nombre;
	private String material;
	private String color;
	
	public Mueble() {
		this.nombre ="";
		this.material="";
		this.color="";
	}
	
	public Mueble(String nombre, String material, String color) {
		this.nombre=nombre;
		this.material=material;
		this.color=color;
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
	public String getMaterial() {
		return material;
	}
	public boolean setMaterial(String material) {
		if(!material.isEmpty()) {
			this.material = material;
			return true;
		}
		return false;
	}
	public String getColor() {
		return color;
	}
	public boolean setColor(String color) {
		if(!color.isEmpty()) {
			this.color = color;
			return true;
		}
		return false;
	}

	@Override
	public String toString() {
		return this.nombre+" de "+this.material+" Color "+this.color;
	}
	

	
}
