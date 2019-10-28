package ar.edu.ort.tp1.tp3.ejercicio4;

import java.util.ArrayList;

public class TorneoFutbol8 extends Torneo {
	public static final int PUNTOS_PARTIDO_GANADO = 3;
	public static final int PUNTOS_PARTIDO_EMPATADO = 1;
	public static final int PUNTOS_PARTIDO_PERDIDO = 1;
	public static final int PUNTOS_PARTIDO_INVICTO = 1;
	public static final int PUNTOS_PARTIDO_GANADO_MAS_4_GOLES = 0;
	public static final int PUNTOS_PARTIDO_EMPATE_MAS_3_GOLES_POR_EQUIPO = 1;

	TorneoFutbol8(ArrayList<Jornada> jornadas){
		super(jornadas);
	}
	
	TorneoFutbol8(ArrayList<Equipo> equipos, ArrayList<Jornada> jornadas){
		super(jornadas, equipos);
	}
	
	@Override
	public void inscribirEquipos(ArrayList<Equipo> equipos) {
		for(Equipo aux: equipos) {
			this.inscribirEquipo(aux);
		}		
	}

	@Override
	public boolean inscribirEquipo(Equipo equipo) {
		boolean bool = false;		
		if(equipo.getJugadores().size()==8) {
			this.equipos.add(equipo);
			bool=true;
		}
		return bool;		
	}
}
