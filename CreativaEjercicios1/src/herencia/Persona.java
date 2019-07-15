package herencia;

public class Persona {
//atributos
    private int id;
    private String nombre;
    private String apellido;
    private int edad;
    private double peso;
/* contructor con todos los campos, es de acceso publico y no se pone el tipo de retorno 
debera llevar el mismo nombre de la clase y como parametro de entrada debe llevar 
las mismas variables/atributos de la clase dentro del medoto iniciarlizar los atributos
a los parametros de entradda*/
    public Persona(int id, String nombre, String apellido, int edad, double peso) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.peso = peso;
    }
//metodo void de mostrar datos
    public void mostrarDatos() {
        System.out.println("Id " + id);
        System.out.println("Nombre de la persona " + nombre);
        System.out.println("Apellido de la persona " + apellido);
        System.out.println("Edad " + edad);
        System.out.println("Peso " + peso);
    }
//getters and setters
/*un getter es de acceso public y retorna el mismo valor de la variable seguido por
nombre del metodo sin parametros y returna la variable local o atributo*/
    public int getId() {
        return id;
    }
/*un setter es de igual metodo de acceso publico pero es void no retorna nada y como parametro
debe tener el mismo tipo que la variable de la clase dentro del metodo se iguala la variable local
de la clase al parametro de entrada*/
    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
}
