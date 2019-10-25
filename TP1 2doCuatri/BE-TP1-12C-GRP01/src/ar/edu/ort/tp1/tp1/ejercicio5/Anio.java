package ar.edu.ort.tp1.tp1.ejercicio5;

public class Anio {	
	private static final int[] DIAS = {31,28,31,30,31,30,31,31,30,31,30,31}; 
	private int diasTranscurridos;
		
	public Anio() {
		this.diasTranscurridos=0;
	}
	
	public String getNombreDelMes(int numeroMes){
		String monthName = null; 
		if (numeroMes>0 && numeroMes<=Mes.values().length){ 
			monthName = Mes.values()[numeroMes-1].name();
		}
		return monthName;
	}
			
	public int getDiasTranscuridos() {
		return diasTranscurridos;
	}
	
	public boolean setDiasTranscurridos(int numeroMes){
		boolean correcto=false;
		this.diasTranscurridos=0;
		if(numeroMes>0 && numeroMes<=Mes.values().length){
			for (int i=0; i<numeroMes-1; i++)
				this.diasTranscurridos+=DIAS[i];
			correcto = true;
		}
		return correcto;
	}
	
	public int getDiaCumpleañosEnElAño(int mesDeCumpleanios, int diaDeCumpleanios){
		int diasDelAnio=0;
		this.setDiasTranscurridos(mesDeCumpleanios);
		if(mesDeCumpleanios>0 && mesDeCumpleanios<=Mes.values().length){
			diasDelAnio=this.getDiasTranscuridos()+diaDeCumpleanios;
		}
		return diasDelAnio;
	}
}

//Creá una nueva versión de la clase Anio llamada AnioV2 que use el enum
//Mes (interno pero público) para enumerar a los doce meses del año, y modificá lo que
//creas conveniente.