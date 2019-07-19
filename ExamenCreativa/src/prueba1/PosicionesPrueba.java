package prueba1;

import java.util.Scanner;

public class PosicionesPrueba {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = 1, a2, b = 0, c;
		System.out.println("datos a calcular");
		c=34;
		int i = 1;
		Suma su[] = new Suma[c + 4];
		for (i = 1; i <= c + 2; i++) {
			a2 = b;
			b = a + b;
			a = a2;
			su[i - 1] = new Suma();
			su[i - 1].setX(a);
		}
		System.out.println("El dato guardado es: " + su[c + 1].getX());
		scan.close();
	}
}