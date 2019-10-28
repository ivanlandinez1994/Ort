package ar.edu.ort.tp1.tp3.ejercicio4;

public class Partido {
	private Equipo equipoLocal;
	private Equipo equipoVisitante;
	private int golesEquipoLocal;
	private int golesEquipoVisitante;
	
	public Partido(Equipo equipoLocal, Equipo equipoVisitante) {
		this.equipoLocal = equipoLocal;
		this.equipoVisitante = equipoVisitante;
	}
	
	public Partido(Equipo equipoLocal, Equipo equipoVistante, int golesEquipoLocal, int golesEquipoVistante) {
		this.equipoLocal = equipoLocal;
		this.equipoVisitante = equipoVistante;
		this.golesEquipoLocal = golesEquipoLocal;
		this.golesEquipoVisitante = golesEquipoVistante;
	}
	
	public Equipo getequipoLocal() {
		return equipoLocal;
	}
	public void setequipoLocal(Equipo equipoLocal) {
		this.equipoLocal = equipoLocal;
	}
	public Equipo getEquipoVistante() {
		return equipoVisitante;
	}
	public void setEquipoVistante(Equipo equipoVistante) {
		this.equipoVisitante = equipoVistante;
	}
	public int getGolesEquipoLocal() {
		return golesEquipoLocal;
	}
	public void setGolesEquipoLocal(int golesEquipo) {
		this.golesEquipoLocal = golesEquipo;
	}
	public int getGolesEquipoVisitante() {
		return golesEquipoVisitante;
	}
	public void setGolesEquipoVistante(int golesEquipo) {
		this.golesEquipoVisitante = golesEquipo;
	}
	
	
}
