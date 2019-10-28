package ar.edu.ort.tp1.tp3.ejercicio4;
import java.util.ArrayList;
public class Jornada {
	private ArrayList<Partido> partidos;
	private EstadoJornada estado;
	private int fecha;
	
	public Jornada(ArrayList<Partido> partidos, EstadoJornada estado) {
		this.estado = estado;
		this.partidos = new ArrayList<Partido>();
		this.setPartidos(partidos);
	}
	
	public int getFecha() {
		return fecha;
	}

	public void setFecha(int fecha) {
		this.fecha = fecha;
	}

	public ArrayList<Partido> getPartidos() {
		return partidos;
	}

	public void setPartidos(ArrayList<Partido> partidos) {
		for(Partido aux: partidos) {
			this.setPartido(aux);
		}
	}
	
	public void setPartido(Partido partido) {
		this.partidos.add(partido);
	}

	public EstadoJornada getEstado() {
		return estado;
	}

	public void setEstado(EstadoJornada estado) {
		this.estado = estado;
	}
	
	
}
