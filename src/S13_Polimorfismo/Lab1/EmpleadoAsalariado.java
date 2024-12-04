package S13_Polimorfismo.Lab1;

public class EmpleadoAsalariado extends Empleado {
    private double salarioSemanal;

    public EmpleadoAsalariado(String primerNombre, String apellidoPaterno, String numeroSocial, double salarioSemanal) {
        super(primerNombre, apellidoPaterno, numeroSocial);
        this.salarioSemanal = salarioSemanal;
    }

    public double getSalarioSemanal() {
        return salarioSemanal;
    }

    public void setSalarioSemanal(double salarioSemanal) {
        this.salarioSemanal = salarioSemanal;
    }

    public double ingresos() {
        return getSalarioSemanal();
    }

    public String toString() {
        return String.format(
            "Empleado asalariado: %s%n%s: $%,.2f",
            super.toString(),
            "salario semanal", getSalarioSemanal()
        );
    }
}
