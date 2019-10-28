package ar.edu.ort.tp1.tp3.ejercicio2;

public class TP2Test2 {
	public static void main(String args[]){
		Empleado vendedor1 = new Vendedor("pedro", 25, 200, 100, 5);
		Empleado vendedor2= new Vendedor("Maria",30,200,100,10);
		if(vendedor1 instanceof Vendedor){
			((Vendedor)vendedor1).setImporteVenta(38000); 
		}
		if(vendedor2 instanceof Vendedor){
			((Vendedor)vendedor2).setImporteVenta(44000); 
		}
		System.out.println(vendedor1.getClass().getSimpleName()+" "+vendedor1.toString());
		System.out.println(vendedor2.getClass().getSimpleName()+" "+vendedor2.toString());
	}	
}
