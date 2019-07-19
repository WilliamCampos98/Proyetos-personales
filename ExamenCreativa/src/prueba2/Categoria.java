package prueba2;

import java.sql.Date;
import java.util.List;

public class Categoria extends Libro {
	private String categoria;
	private int edadMinima;
	private String descripcion;
	private List<Libro> listLibros;

	public Categoria() {

	}

	public Categoria(int idLibro, String nombre, int año, double precio, Date fechaLanzamiento,String editorial, String categoria,
			int edadMinima, String descripcion) {
		super(idLibro, nombre, año, precio, fechaLanzamiento, editorial);
		this.categoria = categoria;
		this.edadMinima = edadMinima;
		this.descripcion = descripcion;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public int getEdadMinima() {
		return edadMinima;
	}

	public void setEdadMinima(int edadMinima) {
		this.edadMinima = edadMinima;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public List<Libro> getListLibros() {
		return listLibros;
	}

	public void setListLibros(List<Libro> listLibros) {
		this.listLibros = listLibros;
	}
}
