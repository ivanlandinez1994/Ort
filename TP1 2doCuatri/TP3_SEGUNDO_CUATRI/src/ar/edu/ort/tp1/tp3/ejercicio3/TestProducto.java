package ar.edu.ort.tp1.tp3.ejercicio3;
import java.util.ArrayList;
import java.util.Scanner;

public class TestProducto {
	public static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		final int MIN_OPC = 1;
		final int MAX_OPC = 4;
		final int EXC_OPC = 4;
		ArrayList<Producto> productosAComprar = new ArrayList<Producto>();
		Producto heladera = new Heladera("Whirlpool","H2745",14999,20,true);
		Producto televisor = new Televisor("Philips","49PGFS",14370,49,true);
		Producto lavarropa = new Lavarropa("Drean","CONCEPT 5",6799,10,TipoLavarropa.SEMIAUTOMATICO);
		Producto licuadora = new Licuadora("Black&Decker","J2456",6700,2600,6);
		double precioTotal=0;
		int opcion;
		char confirmarCompra;
		String msg = mostrarProductos(heladera, televisor, lavarropa, licuadora);
		
		System.out.println("Bienvenido a la casa del electrodomestico");		
		do {
			opcion = validInt(msg, MIN_OPC, MAX_OPC, EXC_OPC);
			switch(opcion) {
				case 1:
					System.out.println(heladera.toString());
					confirmarCompra = validChar("Confirme la selección (S/N)", 'S', 'N');
					if (confirmarCompra == 'S') {
						productosAComprar.add(heladera);
						System.out.println("Se agrego "+heladera.getClass().getSimpleName()+" al carrito.");
					}
					break;
				case 2:
					System.out.println(televisor.toString());
					confirmarCompra = validChar("Confirme la selección (S/N)", 'S', 'N');
					if (confirmarCompra == 'S') {
						productosAComprar.add(televisor);
						System.out.println("Se agrego "+televisor.getClass().getSimpleName()+" al carrito.");
					}
					break;
				case 3:
					System.out.println(lavarropa.toString());
					confirmarCompra = validChar("Confirme la selección (S/N)", 'S', 'N');
					if (confirmarCompra == 'S') {
						productosAComprar.add(lavarropa);
						System.out.println("Se agrego "+lavarropa.getClass().getSimpleName()+" al carrito.");
					}
					break;
				case 4:
					System.out.println(licuadora.toString());
					confirmarCompra = validChar("Confirme la selección (S/N)", 'S', 'N');
					if (confirmarCompra == 'S') {
						productosAComprar.add(licuadora);
						System.out.println("Se agrego "+licuadora.getClass().getSimpleName()+" al carrito.");
					}
					break;
			}
		}while(opcion!=0);

		System.out.println("Ticket de venta - Articulos:");
		for (Producto aux: productosAComprar) {
			precioTotal+=aux.getPrecio();
			System.out.println(aux.getClass().getSimpleName()+ " "+aux.toString());
		}
		System.out.println("Total: $"+precioTotal);
	}
	
	public static String mostrarProductos(Producto heladera, Producto televisor, Producto lavarropa, Producto licuadora) {
		return ("Menu de Opciones:\n"+
							"1 - "+heladera.getClass().getSimpleName()+" "+heladera.toString()+"\n"+
							"2 - "+televisor.getClass().getSimpleName()+" "+televisor.toString()+"\n"+
							"3 - "+lavarropa.getClass().getSimpleName()+" "+lavarropa.toString()+"\n"+
							"4 - "+licuadora.getClass().getSimpleName()+" "+licuadora.toString()+"\n"+
							"0 - "+"FIN \n"+
							"Elija una opción, cero (0) para terminar.");
	}

	public static int validInt(String msg, int min, int max, int excepcion) {
		int opcion;
		System.out.println(msg);
		opcion = sc.nextInt();
		while((opcion<min || opcion>max) && opcion != 0) {
			System.out.println("Error, \n"+msg);
			opcion = sc.nextInt();
		}
		return opcion;
	}
	
	public static char validChar(String msg, char opcion1, char opcion2) {
		char devolver;
		System.out.println(msg);
		devolver = sc.next().charAt(0);
		while(devolver!=opcion1 && devolver!=opcion2) {
			System.out.println("Error, de ingreso \n "+msg);
			devolver = sc.next().charAt(0);
		}
		return devolver;
	}
}
