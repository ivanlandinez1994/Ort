package ar.edu.ort.tp1.tp2.ejercicio6;

public class Libro {
	private Autor autor;
	private String tituloLibro;
	private Editorial editorial;
	
	public Libro() {
		autor = new Autor();
		tituloLibro = "";
		editorial = new Editorial();
	}
	
	public Libro(Autor autor, String tituloLibro, Editorial editorial) {
		this.autor = new Autor(autor.getDocumento(),autor.getNombre(),autor.getApellido());
		this.tituloLibro = tituloLibro;
		this.editorial = new Editorial(editorial.getCodigoEditorial(), editorial.getNombreEditorial());
	}

	public Autor getAutor() {
		return autor;
	}

	public void setAutor(Autor autor) {
		this.autor = autor;
	}

	public String getTituloLibro() {
		return tituloLibro;
	}

	public void setTituloLibro(String tituloLibro) {
		this.tituloLibro = tituloLibro;
	}

	public Editorial getEditorial() {
		return editorial;
	}

	public void setEditorial(Editorial editorial) {
		this.editorial = editorial;
	}
	
	
}
