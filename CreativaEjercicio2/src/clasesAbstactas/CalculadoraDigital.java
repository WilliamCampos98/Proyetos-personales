package clasesAbstactas;

/*calculadora digital hereda la clase abstracta y debe implementar todos sus metodos
 * abstractos de lo contrario la clase se volvera abstracta y no podra
 * instanciarse y crear objetos de esta
 */
public class CalculadoraDigital extends CalculadoraAbstracta {
	private double x;
	private double y;
	private int operacion;
	private double total;

	public CalculadoraDigital(double x, double y, int operacion, double total) {
		this.x = x;
		this.y = y;
		this.total = total;
		this.operacion = operacion;
	}

	public CalculadoraDigital() {

	}

	@Override
	public void sumar(double x, double y, double total) {
		total = x + y;
		System.out.println("El resultado es: " + total);
	}

	@Override
	public void dividir(double x, double y, double total) {
		total = x / y;
		System.out.println("El resultado es: " + total);
	}

	@Override
	public void multiplicar(double x, double y, double total) {
		total = x * y;
		System.out.println("El resultado es: " + total);
	}

	@Override
	public void restar(double x, double y, double total) {
		total = x - y;
		System.out.println("El resultado es: " + total);
	}

	public double getX() {
		return x;
	}

	public void setX(int x) {
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
}
