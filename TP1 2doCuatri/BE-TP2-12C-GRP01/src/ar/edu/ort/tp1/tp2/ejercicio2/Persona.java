package ar.edu.ort.tp1.tp2.ejercicio2;

import java.util.ArrayList;

/* 
Por último, crear la clase Persona (su constructor recibe apellido y nombre) podrá contener
de 0 a N teléfonos y de 0 a N emails. Su método mostrarTodo() debe mostrar por pantalla el
contenido completo de la persona. Por ejemplo:
 */
public class Persona {
	private String apellido;
	private String nombre;
	private ArrayList<NumeroTelefonico> telefonos;
	private ArrayList<Email> emails;
	private ArrayList<Mascota> mascotas;
	
	public Persona(String apellido, String nombre){
		this.setApellido(apellido);
		this.setNombre(nombre);
		telefonos = new ArrayList<NumeroTelefonico>();
		emails = new ArrayList<Email>();
		mascotas = new ArrayList<Mascota>();
	}
	
	public boolean agregarTelefono(NumeroTelefonico telefono){		
		if(!existeTelefono(telefono)){
			this.telefonos.add(telefono);
			return true;
		}
		return false;		
	}
	
	public boolean agregarEmail(Email email){
		if(!existeEmail(email)){
			this.emails.add(email);
			return true;
		}
		return false;		
	}
	
	public boolean agregarMascota(Mascota mascota){		
		if(!existeMascota(mascota)){
			this.mascotas.add(mascota);
			return true;
		}
		return false;		
	}
	
	private boolean existeMascota(Mascota mascota) {
		boolean existe= false;
		int index=0;
		while(!existe && index<mascotas.size()){
			if(mascotas.get(index).mostrar().equals(mascota.mostrar())){
				existe=true;
			}
			index++;
		}
		return existe;
	}

	private boolean existeTelefono(NumeroTelefonico telefono){
		boolean existe= false;
		int index=0;
		while(!existe && index<telefonos.size()){
			if(telefonos.get(index).getValor().equals(telefono.getValor())){
				existe=true;
			}
			index++;
		}
		return existe;
	}
	
	private boolean existeEmail(Email email){
		boolean existe= false;
		int index=0;
		while(!existe && index<emails.size()){
			if(emails.get(index).getValor().equalsIgnoreCase(email.getValor())){
				existe=true;
			}
			index++;
		}
		return existe;
	}
	
	public String getApellido() {
		return apellido;
	}

	public boolean setApellido(String apellido) {
		if(!apellido.isEmpty()){
			this.apellido = apellido;
			return true;
		}
		return false;
	}

	public String getNombre() {
		return nombre;
	}

	public boolean setNombre(String nombre) {
		if(!nombre.isEmpty()){
			this.nombre = nombre;
			return true;
		}
		return false;
	}

	public ArrayList<NumeroTelefonico> getTelefonos() {
		return telefonos;
	}

	public ArrayList<Email> getEmails() {
		return emails;
	}
	
	public ArrayList<Mascota> getMascotas(){
		return mascotas;
	}
	
	public boolean removerTelefono(NumeroTelefonico telefono){
		return this.telefonos.remove(telefono);
	}
	
	public boolean removerEmail(Email email){
		return this.emails.remove(email);
	}
	
	public void mostrarTodo(){
		System.out.println(this.apellido+", "	+this.nombre);
		System.out.println("Telefonos:");
		for(NumeroTelefonico auxPhone: telefonos){
			System.out.println(auxPhone.getTipoDeLinea()+": "+auxPhone.getValor());
		}
		for(Email auxEmail: emails){
			System.out.println("Email: "+auxEmail.getValor());
		}
		System.out.println("Mascotas: ");
		for(Mascota auxMascota: mascotas){
			System.out.println(auxMascota.mostrar());
		}
		
	}
	
}
