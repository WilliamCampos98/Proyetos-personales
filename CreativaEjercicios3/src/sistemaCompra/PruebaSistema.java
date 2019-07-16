package sistemaCompra;

import java.math.MathContext;
import java.util.Scanner;

public class PruebaSistema {
	public static void main(String[] args) {
		int peticion, cantidad; 
		double total;
		String nombre;
		Scanner scan = new Scanner(System.in);
		Producto pro[] = new Producto[3];
		Producto proSelecionado = new Producto();
		pro[0] = new Producto(1, "Banana", "fruta", 0.15);
		pro[1] = new Producto(2, "Manzana", "fruta", 0.25);
		pro[2] = new Producto(3, "Pera", "fruta", 0.35);
		System.out.println("Ingrese su nombre: ");
		nombre = scan.nextLine();
		System.out.println("Bienvendido telenemos una lista de productos: ");
		System.out.println("Frutas, Verduras, Carnes, Lacteos, Granos Básicos.");
		System.out.println("¿Desea compra una Fruta?" + "\n" + "1 para no" + "\n" + "2 para si");
		peticion = scan.nextInt(3);
		if (peticion == 1) {
			System.out.println("Comprendo, tenga buen dia!");
		} else {
			System.out.println("Frutas disponibles, Escoja su fruta por id:");
			for (Producto product : pro) {
				product.mostrarDatos();
			}
			peticion = scan.nextInt(4);
			switch (peticion) {
			case 1:
				pro[0].mostrarDatos();
				proSelecionado = pro[0];
				System.out.println("Escoja la cantidad:");
				cantidad = scan.nextInt();
				proSelecionado.setCantidad(cantidad);
				proSelecionado.setTotalPagar(proSelecionado.getCantidad()*proSelecionado.getPrecio());
				proSelecionado.setCliente(nombre);
				proSelecionado.datosCompletos(proSelecionado.getTipo());
				
				break;
			case 2:
				pro[1].mostrarDatos();
				pro[1] = proSelecionado;
			case 3:
				pro[2].mostrarDatos();
				pro[2] = proSelecionado;
			default:
				break;
			}
		}
	}

}
