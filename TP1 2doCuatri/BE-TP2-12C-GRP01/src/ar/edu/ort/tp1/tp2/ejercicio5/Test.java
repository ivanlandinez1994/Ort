package ar.edu.ort.tp1.tp2.ejercicio5;
import java.util.ArrayList;
public class Test {
	public static void main(String args[]){
		Direccion dir1 = new Direccion("Montañeses",1234);
		dir1.setPiso(4);
		dir1.setDpto("C");
		Vivienda vivienda1 = new Vivienda(dir1);
		Persona persona1 = new Persona("Arturo","Roman",53);
		Persona persona2 = new Persona("Mónica","Gaztambide",35);
		Mueble mueble1 = new Mueble("Mesa","Madera","Marrón");
		Mueble mueble2 = new Mueble("Mesada","Mármol","Rojo");
		Mueble mueble3 = new Mueble("Perchero","Metal","Negro");
		Mueble mueble4 = new Mueble("Sillón","Cuero","Azul");
		vivienda1.agregarPersona(persona1);
		vivienda1.agregarPersona(persona2);
		vivienda1.agregarMueble(mueble1);
		vivienda1.agregarMueble(mueble2);
		vivienda1.agregarMueble(mueble3);
		vivienda1.agregarMueble(mueble4);
		vivienda1.getDireccion().setPiso(dir1.getPiso());
		vivienda1.getDireccion().setDpto(dir1.getDpto());
//		vivienda1.mostrarTodo();
		Direccion dir2 = new Direccion("Montañeses",1234);
		dir2.setPiso(4);
		dir2.setDpto("B");
		Vivienda vivienda2= new Vivienda(dir2);
		vivienda2.getDireccion().setPiso(dir2.getPiso());
		vivienda2.getDireccion().setDpto(dir2.getDpto());
		ArrayList<Vivienda> viviendas = new ArrayList<Vivienda>();
		viviendas.add(vivienda1);
		viviendas.add(vivienda2);
		Edificio edificio1 = new Edificio(viviendas);
		edificio1.mostrarTodo();
		if(edificio1.realizarMudanza(dir1.getPiso(), dir1.getDpto(), dir2.getPiso(), dir2.getDpto())){
			System.out.println("SE HA REALIZADO LA MUDANZA DE VIVIENDA 1 A VIVIENDA 2");
			edificio1.mostrarTodo();
		}
	}
}
