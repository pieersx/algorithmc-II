package S13_Polimorfismo.Lab1;

public class EmpleadoBaseMasComision extends EmpleadoPorComision {
    private double salarioBase;

    public EmpleadoBaseMasComision(String primerNombre, String apellidoPaterno, String numeroSeguroSocial, double ventasBrutas, double tarifaComision, double salarioBase) {
        super(primerNombre, apellidoPaterno, numeroSeguroSocial, ventasBrutas, tarifaComision);
        if (salarioBase < 0) throw new IllegalArgumentException("El salario base debe ser >= 0");
        this.salarioBase = salarioBase;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        if (salarioBase < 0) throw new IllegalArgumentException("El salario base debe ser >= 0");
        this.salarioBase = salarioBase;
    }

    public double ingresos() {
        return getSalarioBase() + super.ingresos();
    }

    public String toString(){
        return String.format(
            "%s %s; %s: $%,.2f",
            "con salario base", super.toString(),
            "salario base", getSalarioBase()
        );
    }
}
