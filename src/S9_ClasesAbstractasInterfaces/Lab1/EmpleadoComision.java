package S9_ClasesAbstractasInterfaces.Lab1;

public class EmpleadoComision extends Empleado {
    private static final double salarioMinimo = 750;
    private int clientesCaptados;
    private double montoPorCliente;

    public EmpleadoComision() {
        super("", "", "", 0);
    }

    public EmpleadoComision(String nombre, String apellidos, String dni, int yearIngreso, int clientesCaptados, double montoPorCliente) {
        super(nombre, apellidos, dni, yearIngreso);
        this.clientesCaptados = clientesCaptados;
        this.montoPorCliente = montoPorCliente;
    }

    public int getClienteCaptados() {
        return clientesCaptados;
    }

    public void setClientesCaptados(int clientesCaptados) {
        this.clientesCaptados = clientesCaptados;
    }

    public double getMontoPorCliente() {
        return montoPorCliente;
    }

    public void setMontoPorCliente(double montoPorCliente) {
        this.montoPorCliente = montoPorCliente;
    }

    public double obtenerSalario() {
        if ((clientesCaptados * montoPorCliente) < salarioMinimo) {
            return salarioMinimo;
        }

        return clientesCaptados * montoPorCliente;
    }

    public void imprimir() {
        super.imprimir();
        System.out.println("Salario: " + obtenerSalario());
        System.out.println();
    }
}
