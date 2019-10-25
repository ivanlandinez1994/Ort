package ar.edu.ort.tp1.tp2.ejercicio1;

public class Test {
	public static void main(String args[]){
		NumeroTelefonico num1 = new NumeroTelefonico(11,22981602,54);
		NumeroTelefonico num2 = new NumeroTelefonico(11,36104322,54);
		Email email1 = new Email("ivan.land@hotmail.com");
		Email email2 = new Email("cuenta.land@hotmail.com");
		Persona p1 = new Persona("Landinez","Ivan");
		p1.agregarEmail(email1);
		p1.agregarEmail(email2);
		p1.agregarTelefono(num1);
		p1.agregarTelefono(num2);
		p1.mostrarTodo();
	}
}
