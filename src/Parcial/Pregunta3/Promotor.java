package Parcial.Pregunta3;

public class Promotor extends Empleado {
    private double sueldoNeto;
    private int ventas;

    public Promotor(String codigo, String nombre, String apellidos, int fechaIngreso, double sueldoBase, int ventas) {
        super(codigo, nombre, apellidos, fechaIngreso, sueldoBase);
        this.ventas = ventas;
    }

    public double getSueldoNeto() {
        double comision = ventas * 0.15;
        this.sueldoNeto = sueldoBase + comision;
        return sueldoNeto;
    }

    public void setSueldoNeto(double sueldoNeto) {
        this.sueldoNeto = sueldoNeto;
    }

    public int getVentas() {
        return ventas;
    }

    public void setVentas(int ventas) {
        this.ventas = ventas;
    }
}
