package clasesAbstactas;

/*las interfacez son contratos de metodos vacios y abstractos tambien de
 * variables constantes no se puede instanciar, cuando se aplica una interfaz a una
 * clase se debe implementar todos sus metodos las interfacez permiten
 *  la multiple "herencia"
 */
public interface Interfaz {

	float calcularEnvio();

	void mostrarDatos();

	float precioKilometro = 10.00f;
}
