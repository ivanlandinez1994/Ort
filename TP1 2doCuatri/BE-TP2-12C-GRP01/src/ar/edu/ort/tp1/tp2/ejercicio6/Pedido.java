package ar.edu.ort.tp1.tp2.ejercicio6;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Pedido {
	private String nroCompra;
	private Calendar fechaCompra;
	private Libro libro;
	private Cliente cliente;
	
	public Pedido() {
		this.nroCompra = "";
		this.fechaCompra = new GregorianCalendar();
		this.libro = new Libro();
		this.cliente = new Cliente();
	}
	
	public Pedido(String nroCompra, Libro libro, Cliente cliente) {
		this.nroCompra = nroCompra;
		this.fechaCompra = new GregorianCalendar();
		this.libro = new Libro(libro.getAutor(),libro.getTituloLibro(),libro.getEditorial());
		this.cliente = new Cliente(cliente.getNombre(),cliente.getApellido(),cliente.getDni());
	}
	
	public void setNroCompra(Calendar fechaCompra) {
		this.fechaCompra = fechaCompra;
	}
	
	public String getNrocompra() {
		return nroCompra;
	}

	public Calendar getFechaCompra() {
		return fechaCompra;
	}

	public Libro getLibro() {
		return libro;
	}

	public void setLibro(Libro libro) {
		this.libro = libro;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	
}
