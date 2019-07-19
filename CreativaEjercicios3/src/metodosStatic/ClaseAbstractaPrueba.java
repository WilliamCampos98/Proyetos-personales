package metodosStatic;

import java.util.Scanner;

/*instancio producto y calculadora digital*/
public class ClaseAbstractaPrueba {
	public static void main(String[] args) {

		System.out.println("Aqui comienza la calculadora");
		/*
		 * la instancie con constructor vacio porque no usare sus datos solo sus metodos
		 */
		CalculadoraDigital cal = new CalculadoraDigital();
		Scanner scan = new Scanner(System.in);
		/*
		 * cree una varaible local para el metodo de area de un circulo statico y use
		 * math.pi para que me diera el valor de Pi aunque pude usar la variable de la
		 * clase que estaba con un valor estatico la calculadora funciona normal solo
		 * agregue el metodo static
		 */
		int operacion;
		double x;
		System.out.println("Bienvenido, Escoge la opcion");
		System.out.println("1 para sumar");
		System.out.println("2 para restar");
		System.out.println("3 para dividir");
		System.out.println("4 para multiplicar");
		System.out.println("5 para calcular el area de un circulo");
		System.out.println("Ingresa un digito:");
		operacion = scan.nextInt();
		switch (operacion) {
		case 1:
			cal.sumar();
			break;
		case 2:
			cal.restar();
			break;
		case 3:
			cal.dividir();
			break;
		case 4:
			cal.multiplicar();
			break;
		case 5:
			System.out.println("Ingrese el radio del circulo");
			x = scan.nextDouble();
			System.out.println("El area del circulo es: " + CalculadoraDigital.calcularAreaCirculo(x));
			break;
		default:
			System.out.println("Opcion invalida");
			break;
		}
		scan.close();
	}
}
