package ar.edu.ort.tp1.tp3.ejercicio4;

public class Posicion {
	Equipo equipo;
	int puntos;
	
	public Posicion(){
		this.equipo = new Equipo();
		this.puntos = 0;
	}
	public Posicion(Equipo equipo, int puntos) {
		equipo = new Equipo(equipo.getJugadores());
		this.puntos = puntos;
	}
	public Equipo getEquipo() {
		return equipo;
	}
	public void setEquipo(Equipo equipo) {
		this.equipo = equipo;
	}
	public int getPuntos() {
		return puntos;
	}
	public void setPuntos(int puntos) {
		this.puntos = puntos;
	}
	
}
