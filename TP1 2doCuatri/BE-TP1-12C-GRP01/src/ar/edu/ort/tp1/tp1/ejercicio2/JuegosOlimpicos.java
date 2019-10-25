package ar.edu.ort.tp1.tp1.ejercicio2;
import java.util.ArrayList;
public class JuegosOlimpicos {
	private ArrayList<Atleta> atletas;
	
	public JuegosOlimpicos() {
		atletas = new ArrayList<Atleta>();
	}
	
	public boolean agregarAtleta(Atleta atleta) {
		boolean seAgrego=false;
		if(atletas.add(atleta))
			seAgrego=true;
		return seAgrego;
	}
	
	public ArrayList<Atleta> getGanadorCarrera(String especialidad) {		
		ArrayList<Atleta> mejoresAtletas = new ArrayList<Atleta>();
		double mejorTiempo=getMejorTiempo(especialidad);
		for(Atleta auxAtleta:atletas) {
			if(auxAtleta.getEspecialidad().equalsIgnoreCase(especialidad) && mejorTiempo==auxAtleta.getTiempo())
				mejoresAtletas.add(auxAtleta);
		}
		
		return mejoresAtletas;
	}
	
	private double getMejorTiempo(String especialidad) {
		double mejorTiempo=-1;
		for(Atleta auxMejorAtleta: atletas) {
			if(auxMejorAtleta.getEspecialidad().equalsIgnoreCase(especialidad) &&
					(mejorTiempo>auxMejorAtleta.getTiempo() || mejorTiempo==-1))
				mejorTiempo=auxMejorAtleta.getTiempo();
		}
		return mejorTiempo;
	}

	@Override
	public String toString() {
		return "JuegosOlimpicos [atletas=" + atletas.toString() + "]";
	}
	
	
}
