package ar.edu.ort.tp1.tp3.ejercicio4;
import java.util.ArrayList;

public class TorneoFutbol11 extends Torneo {
	public static final int PUNTOS_PARTIDO_GANADO = 3;
	public static final int PUNTOS_PARTIDO_EMPATADO = 1;
	public static final int PUNTOS_PARTIDO_PERDIDO = 0;
	public static final int PUNTOS_PARTIDO_INVICTO = 0;
	public static final int PUNTOS_PARTIDO_GANADO_MAS_4_GOLES = 0;
	public static final int PUNTOS_PARTIDO_EMPATE_MAS_3_GOLES_POR_EQUIPO = 0;
	
	TorneoFutbol11(ArrayList<Jornada> jornadas){
		super(jornadas);
	}
	
	TorneoFutbol11(ArrayList<Equipo> equipos, ArrayList<Jornada> jornadas){
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
		if(equipo.getJugadores().size()==11) {
			this.equipos.add(equipo);
			bool=true;
		}
		return bool;		
	}
	
	@Override
	public void calcularPuntosJornada(Jornada jornada) {
		int puntosGanador;
		int puntosPerdedor = this.getPuntosPerdedor();
		int puntosEmpate;		
		if(jornada.getEstado() == EstadoJornada.FINALIZADO) {
			for(Partido aux: jornada.getPartidos()){
				if(aux.getGolesEquipoLocal()==aux.getGolesEquipoVisitante()) {
					puntosEmpate = this.getPuntosEmpate(aux.getGolesEquipoLocal(), aux.getGolesEquipoVisitante());
				}else if(aux.getGolesEquipoLocal()>aux.getGolesEquipoVisitante()) {
					puntosGanador = this.getPuntosGanador(aux.getGolesEquipoLocal(), aux.getGolesEquipoVisitante());
				}else {
					puntosGanador = this.getPuntosGanador(aux.getGolesEquipoVisitante(), aux.getGolesEquipoLocal());
				}
			}
		}
	}
	
	private int getPuntosGanador(int golesEquipoGanador, int golesEquipoPerdedor) {
		int puntos=0;
		puntos+=PUNTOS_PARTIDO_GANADO;
		if((golesEquipoGanador-golesEquipoPerdedor)>4) {
			puntos+=PUNTOS_PARTIDO_GANADO_MAS_4_GOLES;
		}
		if(golesEquipoPerdedor==0) {
			puntos+=PUNTOS_PARTIDO_INVICTO;
		}
		return puntos;
	}
	
	private int getPuntosEmpate(int golesEquipoLocal, int golesEquipoVistante) {		
		int puntos=0;
		puntos+=PUNTOS_PARTIDO_EMPATADO;
		if(golesEquipoLocal>3) {
			puntos+=PUNTOS_PARTIDO_EMPATE_MAS_3_GOLES_POR_EQUIPO;
		}
		if(golesEquipoLocal==0) {
			puntos+=PUNTOS_PARTIDO_INVICTO;
		}
		return puntos;
	}
		
	private int getPuntosPerdedor() {
		return PUNTOS_PARTIDO_PERDIDO;
	}
	
}
