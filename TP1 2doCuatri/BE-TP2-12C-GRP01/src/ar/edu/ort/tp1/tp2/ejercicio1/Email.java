package ar.edu.ort.tp1.tp2.ejercicio1;

public class Email {	
	String cuenta;
	String dominio;
	public Email(String email){		
		String corte[] = email.split("@");
		this.cuenta = corte[0];
		this.dominio = corte[1];
	}
	
	public String getValor(){
		return this.cuenta+"@"+this.dominio;
	}
	
}
