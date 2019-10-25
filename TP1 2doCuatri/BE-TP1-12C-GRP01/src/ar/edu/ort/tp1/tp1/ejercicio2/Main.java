package ar.edu.ort.tp1.tp1.ejercicio2;

public class Main {
	public static void main(String args[]) {
		Atleta atleta1 = new Atleta("Ivan", 90.2,"Atletismo");
		Atleta atleta2 = new Atleta("Jesica", 60.2,"Atletismo");
		Atleta atleta3 = new Atleta("Timoty", 100.2,"Atletismo");
		Atleta atleta4 = new Atleta("Ficticio", 20.2,"Atletismo");
		Atleta atleta6 = new Atleta("Felicio", 10.3,"Caminata");
		Atleta atleta5 = new Atleta("juan", 15.9,"Caminata");
		JuegosOlimpicos juegos2019 = new JuegosOlimpicos();
		juegos2019.agregarAtleta(atleta1);
		juegos2019.agregarAtleta(atleta2);
		juegos2019.agregarAtleta(atleta3);
		juegos2019.agregarAtleta(atleta4);
		juegos2019.agregarAtleta(atleta5);
		juegos2019.agregarAtleta(atleta6);
		System.out.println((juegos2019.getGanadorCarrera("Atletismo")).toString());
		
	}
}
