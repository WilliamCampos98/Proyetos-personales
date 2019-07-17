package sistemaCompra;

public class Producto implements VentasInterfaz {

	private int id;
	private String nombre;
	private String tipo;
	private double precio;
	private int cantidad;
	private double descuento;
	private double totalPagar;
	private String cliente;

	public Producto() {

	}

	public Producto(int id, String nombre, String tipo, double precio) {
		this.id = id;
		this.nombre = nombre;
		this.tipo = tipo;
		this.precio = precio;
	}

	public String getCliente() {
		return cliente;
	}

	public void setCliente(String cliente) {
		this.cliente = cliente;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public double getDescuento() {
		return descuento;
	}

	public void setDescuento(double descuento) {
		this.descuento = descuento;
	}

	public double getTotalPagar() {
		return totalPagar;
	}

	public void setTotalPagar(double totalPagar) {
		this.totalPagar = totalPagar;
	}

	@Override
	public void mostrarDatos() {
		System.out.println("Id: " + id + " Nombre del producto: " + nombre + " Tipo: " + tipo + " Precio: $" + precio
				+ " C/Unidad");
	}

	@Override
	public void calcularDescuento() {

	}

	@Override
	public void datosCompletos(String tipo) {
		System.out.println("Datos de la compra de " + tipo);
		System.out.println(
				"Id: " + id + " Nombre del producto: " + nombre + " Tipo: " + tipo + " Precio: $" + precio + " C/Unidad"
						+ "\n" + "Cantidad: " + cantidad + " Total: " + totalPagar + " Nombre del cliente: " + cliente);
		if (totalPagar>=20 && totalPagar<=49.99 ) {
			descuento = 0.05;
			System.out.println("Su descuento es de 5%: ");

		} else if(totalPagar > 50) {
			System.out.println("su descuento es de 7%");
			descuento = 0.07;
		}else {
			descuento = 0;
			System.out.println("No aplica descuento");
		}
		
		totalPagar -= totalPagar*descuento;
		System.out.println("Total a pagar con su descuento es de :"+totalPagar);
			
		}
	}

