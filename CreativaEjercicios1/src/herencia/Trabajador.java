package herencia;
/*clase de tarbajador con herencia de persona se denota por la palabra extends y la clase que le hereda 
en la herencia la clase padre le hereda todos sus atributos y metodos a la clase hija, en una 
herencia debe haber un constructor ncon todos las variable de la clase padre y tambien de la clase hija*/
public class Trabajador extends Persona {
/*atributos de la clase hija*/
    private int codigoTrabajador;
    private String empresa;
    private double salario;
    /*metodo sobre-escrito de la clase persona dentro de este metodo puedo ejecutar
	las mismas acciones que dentro de padre o agregar mas funciones o cambiarlo
	por completo para ejecutar este metodo en polimorfismo se debe instanciar la case persona con 
	el contructor de su subclase*/
    @Override
    public void mostrarDatos(){
        System.out.println("Id " + getId());
        System.out.println("Nombre de la persona " + getNombre());
        System.out.println("Apellido de la persona " + getApellido());
        System.out.println("Edad " + getEdad());
        System.out.println("Peso " + getPeso());
        int suma = (int) (getEdad()+getPeso());
        System.out.println("Suma de trabajador: "+suma);
        System.out.println("Codigo trabajador: "+codigoTrabajador);
        System.out.println("Empresa: "+empresa);
        System.out.println("Salario: "+salario);
    }
/*constructorcon todos los campos de la clase pesona y trabajador los campos de personaya estan 
inicializados solo faltara denotarlos como los campos de la clase padre o super 
con la palabra super(y aqui los campos) luego inicializar los campos de la subclase*/
    public Trabajador(int id, String nombre, String apellido, int edad, double peso,
            int codigoTrabajador, String empresa, double salario) {
        super(id, nombre, apellido, edad, peso);
        this.codigoTrabajador = codigoTrabajador;
        this.empresa = empresa;
        this.salario = salario;
    }
/*getters and setters*/
    public int getCodigoTrabajador() {
        return codigoTrabajador;
    }

    public void setCodigoTrabajador(int codigoTrabajador) {
        this.codigoTrabajador = codigoTrabajador;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;

    }
}
