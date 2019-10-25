package ar.edu.ort.tp1.tp2.ejercicio5;
import java.util.ArrayList;
public class Edificio {
	ArrayList<Vivienda> viviendas = new ArrayList<Vivienda>();
		
	public Edificio(ArrayList<Vivienda> viviendas){
		this.viviendas = viviendas;
	}
	
	public boolean realizarMudanza(int pisoOrigen, String dptoOrigen,int pisoDestino, String dptoDestino){
		int viviendaOrigen = getIndexVivienda(pisoOrigen, dptoOrigen);
		int viviendaDestino = getIndexVivienda(pisoDestino, dptoDestino);
		if(viviendaOrigen!=-1 && viviendaDestino!=-1){
				viviendas.get(viviendaDestino).agregarMuebles(viviendas.get(viviendaOrigen).getMuebles());
				viviendas.get(viviendaDestino).agregarPersonas(viviendas.get(viviendaOrigen).getPersonas());
				viviendas.get(viviendaOrigen).removerMuebles();
				viviendas.get(viviendaOrigen).removerPersonas();
			return true;
		}
		return false;
	}
	
	private int getIndexVivienda(int piso, String dpto){
		boolean encontrado=false;
		int index=0;
		int indexADevolver=-1;
		while(!encontrado && index<viviendas.size()){
			if(viviendas.get(index).getDireccion().getPiso()==piso && 
					viviendas.get(index).getDireccion().getDpto().equalsIgnoreCase(dpto)){
				encontrado=true;
				indexADevolver=index;
			}
			index++;
		}
		return indexADevolver;
	}
	
	public void mostrarTodo(){
		for(int i=0;i<viviendas.size();i++){
			System.out.println("Vivienda "+(i+1));
			viviendas.get(i).mostrarTodo();			
		}
	}
}
