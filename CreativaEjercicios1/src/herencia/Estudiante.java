package herencia;

public class Estudiante extends Persona {

    private int codigo;
    private String clase;
    private String materia;
    private int numeroMaterias;

    public Estudiante(int id, String nombre, String apellido, int edad, double peso,
            int codigo, String clase, String materia, int numeroMaterias) {
        super(id, nombre, apellido, edad, peso);
        this.codigo = codigo;
        this.clase = clase;
        this.materia = materia;
        this.numeroMaterias = numeroMaterias;
    }

    @Override
    public void mostrarDatos() {
        System.out.println("Id " + getId());
        System.out.println("Nombre de la persona " + getNombre());
        System.out.println("Apellido de la persona " + getApellido());
        System.out.println("Edad " + getEdad());
        System.out.println("Peso " + getPeso());
        System.out.println("Codigo: " + codigo);
        System.out.println("Clase: " + clase);
        System.out.println("Materia: " + materia);
        System.out.println("Numero de materias: " + numeroMaterias);
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getClase() {
        return clase;
    }

    public void setClase(String clase) {
        this.clase = clase;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public int getNumeroMaterias() {
        return numeroMaterias;
    }

    public void setNumeroMaterias(int numeroMaterias) {
        this.numeroMaterias = numeroMaterias;
    }
}
