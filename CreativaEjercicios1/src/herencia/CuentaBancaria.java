package herencia;

public class CuentaBancaria {

    private int id;
    private String nombreCliente;
    private String numeroCuenta;
    private double interes;
    private double salado;

    public CuentaBancaria() {

    }

    public CuentaBancaria(int id, String nombreCliente,
            String numeroCuenta, double interes, double salado) {
        this.id = id;
        this.nombreCliente = nombreCliente;
        this.numeroCuenta = numeroCuenta;
        this.interes = interes;
        this.salado = salado;
    }
    
    public void mostrarDatos(){
        System.out.println("Id de la cuenta:"+id);
        System.out.println("Nombre del cliente:"+nombreCliente);
        System.out.println("Numero de la cuenta:"+numeroCuenta);
        System.out.println("Interes:"+interes);
        System.out.println("Saldo"+salado);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public double getInteres() {
        return interes;
    }

    public void setInteres(double interes) {
        this.interes = interes;
    }

    public double getSalado() {
        return salado;
    }

    public void setSalado(double salado) {
        this.salado = salado;
    }
}
