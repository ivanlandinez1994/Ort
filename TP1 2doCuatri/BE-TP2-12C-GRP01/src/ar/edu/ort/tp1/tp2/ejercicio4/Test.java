package ar.edu.ort.tp1.tp2.ejercicio4;

public class Test {
	public static void main(String args[]){
		Direccion dir1 = new Direccion("Montañeses",1234);
		Vivienda vivienda1 = new Vivienda(dir1);
		dir1.setPiso(4);
		dir1.setDpto("C");
		Persona persona1 = new Persona("Arturo","Roman",53);
		Persona persona2 = new Persona("Mónica","Gaztambide",35);
		Mueble mueble1 = new Mueble("Mesa","Madera","Marrón");
		Mueble mueble2 = new Mueble("Mesada","Mármol","Rojo");
		Mueble mueble3 = new Mueble("Perchero","Metal","Negro");
		Mueble mueble4 = new Mueble("Sillón","Cuero","Azul");
		vivienda1.agregarPersona(persona1);
		vivienda1.agregarPersona(persona2);
		vivienda1.agregarMuebles(mueble1);
		vivienda1.agregarMuebles(mueble2);
		vivienda1.agregarMuebles(mueble3);
		vivienda1.agregarMuebles(mueble4);
		vivienda1.setDireccion(dir1);
		System.out.println("vivienda 1:");
		vivienda1.mostrarTodo();
	}
}
