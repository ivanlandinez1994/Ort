package ar.edu.ort.tp1.tp2.ejercicio6;
import java.util.ArrayList;
public class Tienda {
	private ArrayList<Pedido> pedidosCompletos;
	private ArrayList<Pedido> pedidosPendientes;
	private ArrayList<Libro> libros;
	
	public Tienda(ArrayList<Libro> libros) {
		 pedidosPendientes = new ArrayList<Pedido>();
		 pedidosCompletos = new ArrayList<Pedido>();
		 libros = new ArrayList<Libro>();
		 this.agregarLibros(libros);
	}
	
	public Tienda(ArrayList<Pedido> pedidosPendientes, ArrayList<Libro> libros) {
		pedidosPendientes = new ArrayList<Pedido>();
		this.agregarPedidos(pedidosPendientes);
		pedidosCompletos = new ArrayList<Pedido>(); 
		libros = new ArrayList<Libro>();
		this.agregarLibros(libros);
	}
	
	public Tienda() {
		pedidosPendientes = new ArrayList<Pedido>();
		pedidosCompletos = new ArrayList<Pedido>();
		libros = new ArrayList<Libro>();
	}
	
	public ArrayList<Pedido> getPedidosPendientes(){
		return pedidosPendientes;
	}
	
	public ArrayList<Pedido> getPedidosCompletos(){
		return pedidosCompletos;
	}
	
	public void agregarLibro(Libro libro) {
		this.libros.add(libro);
	}
	
	public void agregarPedido(Pedido pedido) {
		this.pedidosPendientes.add(pedido);
	}
	
	public boolean agregarPedidos(ArrayList<Pedido> pedidos) {
		if(pedidos.size()>0) {
			for(Pedido aux: pedidos) {
				this.agregarPedido(aux);
			}
			return true;
		}
		return false;
	}
	
	public boolean agregarLibros(ArrayList<Libro> libros) {
		if(libros.size()>0) {
			for(Libro aux: libros) {
				this.agregarLibro(aux);
			}
			return true;
		}
		return false;
	}
	
	public void procesarPendientes() {
		for(int i=0;i<this.pedidosPendientes.size();i++) {
			int indexLibro= buscarLibro(this.libros.get(i).getTituloLibro(),this.libros.get(i).getAutor().getNombre());
			if(indexLibro>=0) {
				this.pedidosCompletos.add(this.pedidosPendientes.get(i));
				this.pedidosPendientes.remove(i);
				this.libros.remove(indexLibro);
			}
		}
	}
	
	private int buscarLibro(String nombreLibro, String nombreAutor) {
		int index=0;
		int indiceLibro=-1;
		while(indiceLibro==-1 && index<libros.size()) {
			if(this.libros.get(index).getAutor().getNombre().equalsIgnoreCase(nombreAutor) &&
					this.libros.get(index).getTituloLibro().equalsIgnoreCase(nombreLibro)) {
				indiceLibro = index;
			}
			index++;
		}
		return indiceLibro;
	}
}	
