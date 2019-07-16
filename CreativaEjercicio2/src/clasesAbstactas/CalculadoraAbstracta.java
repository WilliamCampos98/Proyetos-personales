package clasesAbstactas;

/*las clases abstractas solo se usan como clase padre no se puede instanciar objetos
  y sus metodos no poseen cuerpo muy similar a las interfacez solo 
  que una clase abstracta no permite la multiple herencia*/
public abstract class CalculadoraAbstracta {
	/* metodo abstracto sin implementacion/sin cuerpo, cuando se crea un metodo
	   abstracto la clse debe definirse como abstracto
	 */
	public abstract void sumar(double x, double y);

	public abstract void dividir(double x, double y);

	public abstract void restar(double x, double y);

	public abstract void multiplicar(double x, double y);
	/*las clases abstractas suelen declararse en donde subclases se espera que
	 * requieran de dichos metodos de manera generica y atravez del polimofismo modificar
	 * el mtedo
	 */
}
