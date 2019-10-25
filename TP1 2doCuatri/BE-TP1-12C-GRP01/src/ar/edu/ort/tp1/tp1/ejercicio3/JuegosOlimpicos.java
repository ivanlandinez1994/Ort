package ar.edu.ort.tp1.tp1.ejercicio3;
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
	
	public ArrayList<Atleta> getAtletaPorPosicion(String especialidad, int posicion) {		
		ArrayList<Atleta> atletas = new ArrayList<Atleta>();
		switch(posicion) {
			case 1:
				double tiempo=getTiempo(especialidad,1);
				for(Atleta auxAtleta:this.atletas) {
					if(auxAtleta.getEspecialidad().equalsIgnoreCase(especialidad) && tiempo==auxAtleta.getTiempo())
						atletas.add(auxAtleta);
				}
				break;
			case 2:
				double tiempo2=getTiempo(especialidad,2);
				for(Atleta auxAtleta:this.atletas) {
					if(auxAtleta.getEspecialidad().equalsIgnoreCase(especialidad) && tiempo2==auxAtleta.getTiempo())
						atletas.add(auxAtleta);
				}
				break;
			case 3:
				double tiempo3=getTiempo(especialidad,3);
				for(Atleta auxAtleta:this.atletas) {
					if(auxAtleta.getEspecialidad().equalsIgnoreCase(especialidad) && tiempo3==auxAtleta.getTiempo())
						atletas.add(auxAtleta);
				}
				break;
		}		
		return atletas;
	}
	
	private double getTiempo(String especialidad, int posicion) {
		Atleta aux = new Atleta();
		double tiempo=-1;
		double tiempoAnterior=-1;		
		int posicionTiempoADevolver=0;
		int k=0, contadorPosiciones=0;
		for(int i=1;i<atletas.size();i++) {
			aux = atletas.get(i);
			int j;
			for (j=i-1;j>=0 && atletas.get(j).getTiempo()>aux.getTiempo();j--) {
				atletas.set(j+1, atletas.get(j));
			}
			atletas.set(j+1, aux);
		}
		while(k<atletas.size()  && contadorPosiciones<posicion) {
			if (atletas.get(k).getEspecialidad().equalsIgnoreCase(especialidad) 
					&& atletas.get(k).getTiempo()!=tiempoAnterior){
				contadorPosiciones++;
				posicionTiempoADevolver =k;
				tiempoAnterior = atletas.get(k).getTiempo();
			}
			k++;
		}
		tiempo = atletas.get(posicionTiempoADevolver).getTiempo();
		return tiempo;
	}
			
	@Override
	public String toString() {
		return "JuegosOlimpicos [atletas=" + atletas.toString() + "]";
	}
	
	
}
