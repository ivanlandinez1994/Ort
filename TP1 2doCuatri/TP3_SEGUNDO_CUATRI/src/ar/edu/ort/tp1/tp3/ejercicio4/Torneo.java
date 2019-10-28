package ar.edu.ort.tp1.tp3.ejercicio4;
import java.util.ArrayList;
public abstract class Torneo {
	private ArrayList<Jornada> jornadas;
	private ArrayList<Equipo> equipos;
	private ArrayList<Posicion> posiciones;
	
	public Torneo(ArrayList<Jornada> jornadas) {
		this.jornadas = new ArrayList<Jornada>();
		this.equipos = new ArrayList<Equipo>();
		this.posiciones = new ArrayList<Posicion>();
	}
	public Torneo(ArrayList<Jornada> jornadas, ArrayList<Equipo> equipos) {
		this.jornadas = new ArrayList<Jornada>();		
		this.equipos = new ArrayList<Equipo>();
		this.posiciones = new ArrayList<Posicion>();
		this.inscribirEquipos(equipos);
		this.setJornadas(jornadas);
	}
	public ArrayList<Jornada> getJornadas() {
		return jornadas;
	}	
	public void setJornadas(ArrayList<Jornada> jornadas) {
		for(Jornada aux: jornadas) {
			this.setJornada(aux);
		}
	}
	public void setJornada(Jornada jornada) {
		this.jornadas.add(jornada);
	}
	public ArrayList<Equipo> getEquipos() {
		return equipos;
	}
	public void setPosiciones(ArrayList<Posicion> posiciones) {
		for(Posicion aux: posiciones) {
			this.setPosicion(aux);
		}
	}
	public void setPosicion(Posicion posicion) {
		this.posiciones.add(posicion);
	}
	
	public abstract void inscribirEquipos(ArrayList<Equipo> equipos);
	public abstract boolean inscribirEquipo(Equipo equipo);
	public abstract void calcularPuntosJornada(Jornada jornada);
}
