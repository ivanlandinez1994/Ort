package ar.edu.ort.tp1.tp1.ejercicio4;
public class Anio {
	private static final String[] MESES = {"Enero","Febrero","Marzo","Abril","Mayo","Junio","Julio","Agosto","Septiembre","Octubre","Noviembre","Diciembre"};
	private static final int[] DIAS = {31,28,31,30,31,30,31,31,30,31,30,31}; 
	private int diasTranscurridos;
		
	public Anio() {
		this.diasTranscurridos=0;
	}
	
	public String getNombreDelMes(int numeroMes){
		String mes="";
		int index=0;
		boolean encontrado=false;
		while(!encontrado && index<DIAS.length){
			if (DIAS[index]==numeroMes){
				encontrado=true;
				mes = MESES[index];
			}				
			index++;
		}
		return mes;
	}
			
	public int getDiasTranscuridos() {
		return diasTranscurridos;
	}
	
	public boolean setDiasTranscurridos(int numeroMes){
		this.diasTranscurridos=0;
		if(numeroMes>0 && numeroMes<=MESES.length){
			for (int i=0; i<numeroMes-1; i++)
				this.diasTranscurridos+=DIAS[i];
			return true;
		}else
			return false;
	}
	
	public int getDiaCumpleañosEnElAño(int mesDeCumpleanios, int diaDeCumpleanios){
		int diasDelAnio=0;
		this.setDiasTranscurridos(mesDeCumpleanios);
		if(mesDeCumpleanios>0 && mesDeCumpleanios<=MESES.length){
			diasDelAnio=this.getDiasTranscuridos()+diaDeCumpleanios;
		}
		return diasDelAnio;
	}
	
	
	
	
}  	