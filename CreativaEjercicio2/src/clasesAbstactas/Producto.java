package clasesAbstactas;
/*esta clase aplica la interfaz y esta obligado a aplicar todos sus metodos
 * esta clase puede implemtar varias interfacez a la vez simulando la multi herencia,
 * hereda sus variables constantes
 */
public class Producto implements Interfaz{
/*las interfacez controlan el comportamiento de las clases se implementa una interfaz
 * con la palabra implements una clase que implementa una interfaz no puede tener mas metodos
 * solo los de la interfaz
 * */
	private int id;
	private String nombreProducto;
	private String categoria;
	private float precio;
	
	public Producto(int id, String nombreProducto, String categoria, float precio) {
		this.id = id;
		this.nombreProducto = nombreProducto;
		this.categoria = categoria;
		this.precio = precio;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombreProducto() {
		return nombreProducto;
	}
	public void setNombreProducto(String nombreProducto) {
		this.nombreProducto = nombreProducto;
	}
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public float getPrecio() {
		return precio;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}

	@Override
	public float calcularEnvio() {
		precio = precio * precioKilometro;
		return this.precio;
	}

	@Override
	public void mostrarDatos() {
		System.out.println("Id: "+id);
		System.out.println("Nombre del producto: "+nombreProducto);
		System.out.println("Categoria: "+categoria);
		
	}
}
