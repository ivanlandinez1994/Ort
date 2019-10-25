package ar.edu.ort.tp1.tp1.ejercicio5;

public class Main {
	public static void main(String args[]){
		Anio anio = new Anio();
		System.out.println(anio.setDiasTranscurridos(2));
		System.out.println(anio.getDiasTranscuridos());
		System.out.println(anio.getDiaCumpleañosEnElAño(10, 28));
		
	}
}
//En el programa principal mostrá cuántos días transcurrieron antes del comienzo del	
//año y qué día del año es el día de cumpleaños de cada integrante del grupo.
//Para discutir en clase o a través del Aula Virtual: Si el método diasTranscurridos(..) es
//usado una y otra vez, ¿hay alguna manera que evitar que el cálculo de los días
//transcurridos se haga permanentemente? Si la hay, modificá la clase para mejorar su
//performance.
