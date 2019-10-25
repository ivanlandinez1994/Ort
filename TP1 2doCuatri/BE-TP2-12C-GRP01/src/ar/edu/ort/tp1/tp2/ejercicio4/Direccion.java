package ar.edu.ort.tp1.tp2.ejercicio4;

public class Direccion {
	private String calle;
	private int altura;
	private int piso;
	private String dpto;
	
	public Direccion(String calle, int altura) {
		this.calle = calle;
		this.altura = altura;
		this.piso =0;
		this.dpto="";
	}
	
	public Direccion(String calle, int altura, int piso, String dpto) {
		this.calle = calle;
		this.altura = altura;
		this.piso =piso;
		this.dpto=dpto;
	}

	public String getCalle() {
		return calle;
	}

	public boolean setCalle(String calle) {
		if(!calle.isEmpty()) {
			this.calle = calle;
			return true;
		}
		return false;
	}

	public int getAltura() {
		return altura;
	}

	public boolean setAltura(int altura) {
		if(altura>=0){
			this.altura = altura;
			return true;
		}
		return false;
	}

	public int getPiso() {
		return piso;
	}

	public boolean setPiso(int piso) {
		if(piso>=0) {
			this.piso = piso;
			return true;
		}
		return false;
	}

	public String getDpto() {
		return dpto;
	}

	public boolean setDpto(String dpto) {
		if(!dpto.isEmpty()) {
			this.dpto = dpto;
			return true;
		}
		return false;
	}
	
	@Override
	public String toString(){
		return "Direccion: "+ this.calle+" "+ this.altura+ " "+this.piso+"°"+"'"+this.dpto+"'";
	}
	
}
