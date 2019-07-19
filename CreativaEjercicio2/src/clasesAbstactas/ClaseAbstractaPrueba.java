package clasesAbstactas;

import java.util.Scanner;

import clasesAbstactas.Producto;

/*instancio producto y calculadora digital*/
public class ClaseAbstractaPrueba {
	public static void main(String[] args) {
		Producto pro = new Producto(1, "Queso", "lacteo", 10.00f);
		pro.mostrarDatos();
		System.out.println("Resultado de la operacion:");
		System.out.println(pro.calcularEnvio());
		System.out.println("Aqui comienza la calculadora");
		/*
		 * la instancie con constructor vacio porque no usare sus datos solo sus metodos
		 */
		CalculadoraDigital cal = new CalculadoraDigital();
		Scanner scan = new Scanner(System.in);
		double x, y = 0;
		int operacion;
		System.out.println("Ingresa un digito:");
		x = scan.nextDouble();
		System.out.println("Ingrese el segundo digito");
		y = scan.nextDouble();
		System.out.println("Escoge la opcion");
		System.out.println("1 para sumar");
		System.out.println("2 para restar");
		System.out.println("3 para dividir");
		System.out.println("4 para multiplicar");
		operacion = scan.nextInt();
		switch (operacion) {
		case 1:
			cal.sumar(x, y);
			break;
		case 2:
			cal.restar(x, y);
			break;
		case 3:
			cal.dividir(x, y);
			break;
		case 4:
			cal.multiplicar(x, y);
			break;
		default:
			System.out.println("Opcion invalida");
			scan.close();
			break;
		}
	}
}
