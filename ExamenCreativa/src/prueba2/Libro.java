package prueba2;

import java.sql.Date;

public class Libro {
	private int idLibro;
	private String nombre;
	private int año;
	private double precio;
	private Date fechaLanzamiento;
	private String editorial;

	public Libro() {

	}

	public Libro(int idLibro, String nombre, int año, double precio, Date fechaLanzamiento, String editorial) {
		this.idLibro = idLibro;
		this.nombre = nombre;
		this.año = año;
		this.precio = precio;
		this.fechaLanzamiento = fechaLanzamiento;
		this.editorial = editorial;
	}



	public int getIdLibro() {
		return idLibro;
	}

	public void setIdLibro(int idLibro) {
		this.idLibro = idLibro;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getAño() {
		return año;
	}

	public void setAño(int año) {
		this.año = año;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public Date getFechaLanzamiento() {
		return fechaLanzamiento;
	}

	public void setFechaLanzamiento(Date fechaLanzamiento) {
		this.fechaLanzamiento = fechaLanzamiento;
	}

	public String getEditorial() {
		return editorial;
	}

	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}
}
