package herencia;

public class PruebaConstructor {
/*metodo main para ejecutar metodos*/
    public static void main(String[] args) {
		/*arreglo de persona la clase persona la inicializo con el constructor de la clase padre 
		y con el de sus clases hijas, se le denomina polimorfismo la capacidad de que un objeto pueda
		almacenar un objetos de sus sus subclases pero para esto debe haber herencia*/
        Persona perso[] = new Persona[3];
        perso[0] = new Persona(1, "William", "Rauda", 21, 128.90);
        perso[1] = new Estudiante(1, "Carlos", "Rodriguez", 21, 123.98, 213, "Matematicas", "chida", 1);
        perso[2] = new Trabajador(1, "Jairo", "Ariel", 22, 234.45, 23, "Consisa", 123.34);
        /*al instanciar una clase se le asigna memoria, se inicializan sus atributos y se invoca el
		contructor de la clase de entre todos los que posea*/
		
		/*instancio la clase cuenta bancaria e inicializo sus atributos*/
		CuentaBancaria cuenta = new CuentaBancaria(1, "William", "52yeg", 0.90, 234.45);
				/*for de la clase persona debido a que sobre escribe el metodo de mostrar datos en todas
				las subclases me mostrara datos diferentes dependiendo de como instancie mi objeto su metodo cambiara
				*/
        for (Persona persona : perso) {
            System.out.println("----------");
            persona.mostrarDatos();
        }
        System.out.println("Cuenta banacaria");
        cuenta.mostrarDatos();
    }

}
