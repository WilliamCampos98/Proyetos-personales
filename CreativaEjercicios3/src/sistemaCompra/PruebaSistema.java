package sistemaCompra;

import java.util.Scanner;

public class PruebaSistema {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Producto pro[] = new Producto[3];
		Producto carne[] = new Producto[3];
		Producto verdura[] = new Producto[3];
		Producto lacteo[] = new Producto[3];
		Producto granos[] = new Producto[3];
		Producto proSelecionado = new Producto();
		String nombre;
		int peticion, cantidad;
		pro[0] = new Producto(1, "Banana", "fruta", 0.15);
		pro[1] = new Producto(2, "Manzana", "fruta", 0.25);
		pro[2] = new Producto(3, "Pera", "fruta", 0.35);

		carne[0] = new Producto(1, "Bistec", "Carne", 1.35);
		carne[1] = new Producto(2, "Pollo", "Carne", 1.25);
		carne[2] = new Producto(3, "Pavo", "Carne", 2.15);

		verdura[0] = new Producto(1, "Zanahorias", "Verdura", 0.25);
		verdura[1] = new Producto(2, "Papas", "Verdura", 0.45);
		verdura[2] = new Producto(3, "Tomates", "Verdura", 0.20);
		
		lacteo[0] = new Producto(1, "Queso chedar", "Lacteo", 2.05);
		lacteo[1] = new Producto(2, "Queso viejo", "Lacteo", 1.75);
		lacteo[2] = new Producto(3, "Queso Crema", "Lacteo", 1.05);
		
		granos[0] = new Producto(1, "Arroz", "Granos", 1.05);
		granos[1] = new Producto(2, "Frijoles", "Granos", 1.45);
		granos[2] = new Producto(3, "Garbanzos", "Granos", 0.95);
		
		System.out.println("Hola! Bienvenido a mi sistema de compras \n Siga las instruciones \n Ingrese su nombre: ");
		nombre = scan.nextLine();
		System.out.println("Desea comprar algo? \n 1 para Si \n -1 para No");
		peticion = scan.nextInt();
		while (peticion >= 0) {
			System.out.println("Bienvendido telenemos una lista de productos: ");
			System.out.println("Frutas, Verduras, Carnes, Lacteos, Granos Básicos.");
			System.out.println("¿Desea comprar Fruta? \n 1 para no \n 2 para si \n -1 para salir");
			peticion = scan.nextInt();
			if (peticion == 1) {
				System.out.println("¿Desea comprar Carne? \n 1 para no \n 2 para si \n -1 para salir:");
				peticion = scan.nextInt();
				if (peticion == 1) {
					System.out.println("¿Desea comprae Verduras? \n 1 para no \n 2 para si \n -1 para salir:");
					peticion = scan.nextInt();
					if (peticion == 1) {
						System.out.println("¿Desea comprar un Lacteos? \n 1 para no \n 2 para si \n -1 para salir");
						peticion = scan.nextInt();
						if (peticion == 1) {
							System.out.println("Llegamos al finalde nuestras opciones!");
							System.out.println("¿Desea comprar Granos Basicos? \n 1 para no y salir \n 2 para si \n -1 para salir");
							peticion = scan.nextInt();
							if (peticion == 1) {
								switch (peticion) {
								case 1:
									System.out.println("Buen dia un placer haberle ayudado!");
									peticion=-1;
									break;
								}
							}else if(peticion >1 && peticion == 2) {
								System.out.println("Granos disponibles, Escoja su grano por id:");
								for (Producto product : granos) {
									product.mostrarDatos();
								}
								peticion = scan.nextInt();

								for (int i = 0; i <= 2; i++) {
									if (granos[i].getId() == peticion) {
										proSelecionado = granos[i];
									}
								}
								System.out.println("Escoja las libras de granos:");
								cantidad = scan.nextInt();
								proSelecionado.setCantidad(cantidad);
								proSelecionado.setTotalPagar(proSelecionado.getCantidad() * proSelecionado.getPrecio());
								proSelecionado.setCliente(nombre);
								proSelecionado.datosCompletos(proSelecionado.getTipo());
							}
						}else if(peticion >1 && peticion ==2) {
							System.out.println("Lacteos disponibles, Escoja su Lacteo por id:");
							for (Producto product : lacteo) {
								product.mostrarDatos();
							}
							peticion = scan.nextInt();

							for (int i = 0; i <= 2; i++) {
								if (lacteo[i].getId() == peticion) {
									proSelecionado = lacteo[i];
								}
							}
							System.out.println("Escoja las unidades de lacteo:");
							cantidad = scan.nextInt();
							proSelecionado.setCantidad(cantidad);
							proSelecionado.setTotalPagar(proSelecionado.getCantidad() * proSelecionado.getPrecio());
							proSelecionado.setCliente(nombre);
							proSelecionado.datosCompletos(proSelecionado.getTipo());
						}	
					} else if(peticion >1 && peticion ==2) {
						System.out.println("Verduras disponibles, Escoja su verdura por id:");
						for (Producto product : verdura) {
							product.mostrarDatos();
						}
						peticion = scan.nextInt();

						for (int i = 0; i <= 2; i++) {
							if (verdura[i].getId() == peticion) {
								proSelecionado = verdura[i];
							}
						}
						System.out.println("Escoja las unidades de Verduras:");
						cantidad = scan.nextInt();
						proSelecionado.setCantidad(cantidad);
						proSelecionado.setTotalPagar(proSelecionado.getCantidad() * proSelecionado.getPrecio());
						proSelecionado.setCliente(nombre);
						proSelecionado.datosCompletos(proSelecionado.getTipo());
					}
				} else if(peticion >1 && peticion ==2) {
					System.out.println("Carnes disponibles, Escoja su carne por id:");
					for (Producto product : carne) {
						product.mostrarDatos();
					}
					peticion = scan.nextInt(4);

					for (int i = 0; i <= 2; i++) {
						if (carne[i].getId() == peticion) {
							proSelecionado = carne[i];
						}
					}
					System.out.println("Escoja las porciones de carne:");
					cantidad = scan.nextInt();
					proSelecionado.setCantidad(cantidad);
					proSelecionado.setTotalPagar(proSelecionado.getCantidad() * proSelecionado.getPrecio());
					proSelecionado.setCliente(nombre);
					proSelecionado.datosCompletos(proSelecionado.getTipo());

				}
			} else if(peticion >1 && peticion ==2) {
				System.out.println("Frutas disponibles, Escoja su fruta por id:");
				for (Producto product : pro) {
					product.mostrarDatos();
				}
				peticion = scan.nextInt(4);

				for (int i = 0; i <= 2; i++) {
					if (pro[i].getId() == peticion) {
						proSelecionado = pro[i];
					}
				}
				System.out.println("Escoja la cantidad:");
				cantidad = scan.nextInt();
				proSelecionado.setCantidad(cantidad);
				proSelecionado.setTotalPagar(proSelecionado.getCantidad() * proSelecionado.getPrecio());
				proSelecionado.setCliente(nombre);
				proSelecionado.datosCompletos(proSelecionado.getTipo());

			}
		}
		scan.close();
		System.out.println("Comprendo fue un gusto atenderle, Buen dia!");
	}
}
