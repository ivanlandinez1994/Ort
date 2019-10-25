package practice;
import java.util.ArrayList;
public class EjercicioMercadoLibre {
	public static void main(String args[]) {
		ArrayList<String> anagramas = new ArrayList<String>();
		ArrayList<String> devolver = new ArrayList<String>();
		anagramas.add("alegan");
		anagramas.add("angela");
		anagramas.add("amor");
		anagramas.add("roma");
		anagramas.add("este es");
		System.out.println(anagramas.toString());
		
		
		for(int i=0;i<anagramas.size();i++) {
			for(int j=i+1;j<anagramas.size();j++) {
				String palabra1 = anagramas.get(i);
				String palabra2 = anagramas.get(j);
				if(palabra1.length()==palabra2.length()) {
					int contLetras=0;
					for(int k=0; k<palabra1.length();k++) {
						boolean esta=false;
						int l=0;
						while(!esta && l<palabra2.length()) {
							if((palabra1.charAt(k)==palabra2.charAt(l))) {
								contLetras++;
								esta=true;
							}
							l++;
						}
						System.out.println(contLetras);
					}
					if (contLetras==palabra2.length()) {
						anagramas.set(j,"");
						anagramas.set(i,"");
					}
				}
			}
		}
		System.out.println(anagramas.toString());
		for(int i=0;i<anagramas.size();i++) {
			if(!anagramas.get(i).equals("")) {
				devolver.add(anagramas.get(i));
			}
		}
		System.out.println(devolver.toString());
	}
	
}
