package ar.edu.ort.tp1.tp1.ejercicio5;

public class Main {
	public static void main(String args[]){
		Anio anio = new Anio();
		System.out.println(anio.setDiasTranscurridos(2));
		System.out.println(anio.getDiasTranscuridos());
		System.out.println(anio.getDiaCumplea�osEnElA�o(10, 28));
		
	}
}
//En el programa principal mostr� cu�ntos d�as transcurrieron antes del comienzo del	
//a�o y qu� d�a del a�o es el d�a de cumplea�os de cada integrante del grupo.
//Para discutir en clase o a trav�s del Aula Virtual: Si el m�todo diasTranscurridos(..) es
//usado una y otra vez, �hay alguna manera que evitar que el c�lculo de los d�as
//transcurridos se haga permanentemente? Si la hay, modific� la clase para mejorar su
//performance.
