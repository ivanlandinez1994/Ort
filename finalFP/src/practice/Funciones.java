package practice;
import java.util.Scanner;
public class Funciones {
	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String args[]) {
//		char caracter = validChar(".i..");
//		int integer = validIntMaxMin("entero",10,0);
//		sc.nextLine();
//		String cadena = validString("candena");
		String nombre = "Hola";
		System.out.println(nombre.substring(2, 3));
	}
	
	public static String validString(String msg) {
		String cadena;
		System.out.println(msg);
		cadena = sc.nextLine();
		while(cadena.equals("")) {
			System.out.println("Error, puede estar vacio.\n"+msg);
			cadena = sc.nextLine();
		}
		return cadena;
	}
	
	public static char validChar(String msg) {
		char caracter;
		System.out.println(msg);
		caracter = sc.nextLine().charAt(0);
		while(caracter!='s' && caracter!='S' && caracter!='n' && caracter!='N') {
			System.out.println("Error, Ingreso invalido.\n"+msg);
			caracter = sc.nextLine().charAt(0);	
		}
		return caracter;
	}
	
	public static int validIntMaxMin(String msg, int max, int min) {
		int valor;
		System.out.println(msg);
		valor = sc.nextInt();
		while(valor<min || valor>max) {
			System.out.println("Error, Ingreso invalido.\n"+msg);
			valor = sc.nextInt();
		}
		
		return valor;
	}
	
	
}
