package ar.edu.ort.tp1.tp3.ejercicio1;

public class Test1 {
	public static void main(String args[]){
		Asalariado as = new Asalariado("jose",30,10000);
		SubContratado sub = new SubContratado("carlos",23,100,50);
		System.out.println(as.getClass().getSimpleName()+ " "+as.toString());
		System.out.println(sub.getClass().getSimpleName()+ " "+sub.toString());
	}
}
