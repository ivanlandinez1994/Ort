package ar.edu.ort.tp1.tp1.ejercicio1;
public class Main {
	
	public static void main(String args[]) {		
		
		String nombreGrupo = "1.2.C";
		String integrante1 = "Ivan Landinez", integrante2 = "Timothy wider", integrante3 = "Jessica Rodriguez", integrante4 = "Ficticio";
		Grupo grupo = new Grupo(nombreGrupo);
		System.out.println("Nombre del grupo "+grupo.getNombre());
		grupo.agregarIntegrante(integrante1);
		System.out.println(integrante1+" fue agregado al grupo "+grupo.getNombre()+"\n");
		grupo.agregarIntegrante(integrante2);
		System.out.println(integrante2+" fue agregado al grupo "+grupo.getNombre()+"\n");
		grupo.agregarIntegrante(integrante3);
		System.out.println(integrante3+" fue agregado al grupo "+grupo.getNombre()+"\n");
		grupo.agregarIntegrante(integrante4);
		System.out.println(integrante4+" fue agregado al grupo "+grupo.getNombre()+"\n");
		System.out.println("Miembro a buscar "+integrante1);
		String integranteEncontrado = grupo.buscarIntegrante(integrante1);
		if(integranteEncontrado!=null) {
			System.out.println("Integrante "+integranteEncontrado+ " Encontrado");
		}else {
			System.out.println("Integrante "+integrante1+" no encontrado.");
		}
		grupo.mostrar();
		System.out.println("Miembro del grupo a remover "+integrante4);
		
		System.out.println(grupo.removerIntegrante(integrante4)+" Fue eliminado del grupo");
		grupo.mostrar();
		
		grupo.vaciar();
		grupo.mostrar();
	}
	

}


