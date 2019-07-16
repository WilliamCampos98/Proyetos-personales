package metodosStatic;

import java.lang.Math;
import java.util.Scanner;

/*calculadora digital hereda la clase abstracta y debe implementar todos sus metodos
 * abstractos de lo contrario la clase se volvera abstracta y no podra
 * instanciarse y crear objetos de esta
 */
public class CalculadoraDigital extends CalculadoraAbstracta {
	private double x;
	private double y;
	private static double pi = 3.1416;
	private int operacion;
	private double radio;
	private double total;

	public CalculadoraDigital(double x, double y, int operacion, double total, double radio) {
		this.x = x;
		this.y = y;
		this.total = total;
		this.operacion = operacion;
		this.radio = radio;
	}

	public CalculadoraDigital() {

	}

	public static double calcularAreaCirculo(double radio) {
		System.out.println("Este metodo lo hice con variables staticas y el metodo es statico");
		return (Math.PI * radio * radio);
	}

	@Override
	public void sumar() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Ingrese un numero: ");
		x = scan.nextDouble();
		System.out.println("Ingrese otro digito: ");
		y = scan.nextDouble();
		scan.close();
		total = y + x;
		System.out.println("El resultado de la sumatoria es: " + total);
	}

	@Override
	public void dividir() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Ingrese un numero:");
		x = scan.nextDouble();
		System.out.println("Ingrese otro numero: ");
		y = scan.nextDouble();
		scan.close();
		total = y / x;
		System.out.println("El resultado de la division es: " + total);
	}

	@Override
	public void multiplicar() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Ingresa un numero: ");
		x = scan.nextDouble();
		System.out.println("Ingresa el segundo numero: ");
		scan.close();
		y = scan.nextDouble();
		total = x * y;
		System.out.println("El resultado de la multiplicación es: " + total);
	}

	@Override
	public void restar() {
		Scanner scan = new Scanner(System.in);
		System.out.println("ingrese un numero: ");
		x = scan.nextDouble();
		System.out.println("Ingrese otro numero: ");
		scan.close();
		total = x - y;
		System.out.println("El resultado de la resta es: " + total);
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	public int getOperacion() {
		return operacion;
	}

	public void setOperacion(int operacion) {
		this.operacion = operacion;
	}

	public static double getPi() {
		return pi;
	}

	public static void setPi(double pi) {
		CalculadoraDigital.pi = pi;
	}

	public double getRadio() {
		return radio;
	}

	public void setRadio(double radio) {
		this.radio = radio;
	}
}
