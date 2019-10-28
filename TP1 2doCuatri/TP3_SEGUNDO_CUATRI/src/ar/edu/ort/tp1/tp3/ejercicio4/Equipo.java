package ar.edu.ort.tp1.tp3.ejercicio4;
import java.util.ArrayList;

public class Equipo {	
	private ArrayList<Jugador> jugadores;
	
	public Equipo() {
		this.jugadores = new ArrayList<Jugador>();
	}
	
	public Equipo(ArrayList<Jugador> jugadores) {
		this.jugadores = new ArrayList<Jugador>();
		this.setJugadores(jugadores);
	}
	
	public void setJugadores(ArrayList<Jugador> jugadores) {
		for(Jugador aux: jugadores) {
			this.setJugador(aux);
		}
	}
	
	public void setJugador(Jugador jugador) {
		this.jugadores.add(jugador);
	}
	
	public ArrayList<Jugador> getJugadores() {
		return jugadores;
	}
}


