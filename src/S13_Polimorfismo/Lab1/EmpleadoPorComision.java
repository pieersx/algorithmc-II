package S13_Polimorfismo.Lab1;

public class EmpleadoPorComision extends Empleado {
    private double ventasBrutas;
    private double tarifaComision;

    public EmpleadoPorComision(String primerNombre, String apellidoPaterno, String numeroSocial, double ventasBrutas, double tarifaComision) {
        super(primerNombre, apellidoPaterno, numeroSocial);
        if (ventasBrutas < 0) throw new IllegalArgumentException("Error: La ventas brutas deben ser >= 0");
        if (tarifaComision <= 0 || tarifaComision >= 1) throw new IllegalArgumentException("Error: La tarifa de comision debe ser > 0 y < 1");
        this.ventasBrutas = ventasBrutas;
        this.tarifaComision = tarifaComision;
    }

    public double getVentasBrutas() {
        return ventasBrutas;
    }

    public void setVentasBrutas(double ventasBrutas) {
        if (ventasBrutas < 0) throw new IllegalArgumentException("Error: La ventas brutas deben ser >= 0");
        this.ventasBrutas = ventasBrutas;
    }

    public double getTarifaComision() {
        return tarifaComision;
    }

    public void setTarifaComision(double tarifaComision) {
        if (tarifaComision <= 0 || tarifaComision >= 1) throw new IllegalArgumentException("Error: La tarifa de comision debe ser > 0 y < 1");
        this.tarifaComision = tarifaComision;
    }

    public double ingresos() {
        return getTarifaComision() * getVentasBrutas();
    }

    public String toString(){
        return String.format(
            "%s: %s%n%s: $%,.2f; %s: %.2f",
            "Empleado por comision", super.toString(),
            "ventas brutas", getVentasBrutas(),
            "tarifa de comision", getTarifaComision()
        );
    }
}
