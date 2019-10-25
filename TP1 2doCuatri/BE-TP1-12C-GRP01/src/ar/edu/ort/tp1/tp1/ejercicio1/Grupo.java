package ar.edu.ort.tp1.tp1.ejercicio1;
import java.util.ArrayList;

public class Grupo {
	private String nombre;	
	private ArrayList<String> integrantes;

	public Grupo(String nombre) {
		this.nombre = nombre;
		integrantes = new ArrayList<String>();
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public int getCantidadIntegrantes() {		
		return integrantes.size();
	}
	
	public void agregarIntegrante(String nombreIntegrante) {
		if (!nombreIntegrante.equals("") && obtenerPosicionIntegrante(nombreIntegrante)<0)			
			integrantes.add(nombreIntegrante);		
	}
	
	private int obtenerPosicionIntegrante(String nombreIntegrante) {
		int index=0;				
		while(index<integrantes.size() && !integrantes.get(index).equalsIgnoreCase(nombreIntegrante)) {					
			index++;			
		}
		if(index==integrantes.size())
			return -1;
		else
			return index;
	}
	
	public String obtenerIntegrante(int posicion) {
		String integranteEncontrado=null;
		if(posicion>=1 && posicion<=integrantes.size()) {
			integranteEncontrado = integrantes.get(posicion-1);
		}
		return integranteEncontrado;
	}
	
	public String buscarIntegrante(String nombre) {
		String integranteDelGrupo=null;		
		int posicionIntegrante= obtenerPosicionIntegrante(nombre);
		if(posicionIntegrante>=0) {
			integranteDelGrupo=integrantes.get(posicionIntegrante);
		}
		return integranteDelGrupo;
	}
	
	public String removerIntegrante(String nombreIntegrante) {
		String integranteRemovido=null;
		int posicionIntegrante = obtenerPosicionIntegrante(nombreIntegrante);
		if(posicionIntegrante>=0) {
			integranteRemovido = integrantes.get(posicionIntegrante);
			integrantes.remove(posicionIntegrante);
		}
		return integranteRemovido;
	}
	
	private void mostrarIntegrantes() {
		if(integrantes.size()>0) {
			System.out.println("La cantidad de integrantes es: "+integrantes.size());
			System.out.println("Los integrantes son:");
			for(String auxIntegrante:integrantes) {
				System.out.println(auxIntegrante);
			}
		}else
			System.out.println("No hay miembros actualmente en el grupo");
		
	}
	
	
	public void mostrar() {
		System.out.println("\nNombre del grupo: "+this.getNombre());
		this.mostrarIntegrantes();
		System.out.println("");
	}
	
	public void vaciar() {
		integrantes.clear();
	}
	
	

}
