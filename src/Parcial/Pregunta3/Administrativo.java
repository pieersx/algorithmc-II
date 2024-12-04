package Parcial.Pregunta3;

public class Administrativo extends Empleado {
    private double sueldoNeto;

    public Administrativo(String codigo, String nombre, String apellido, int fechaIngreso, double sueldoBase) {
        super(codigo, nombre, apellido, fechaIngreso, sueldoBase);
    }

    public double getSueldoNeto() {
        this.sueldoNeto = super.getSueldoBase();
        return sueldoNeto;
    }

    public void setSueldoNeto(double sueldoNeto) {
        this.sueldoNeto = sueldoNeto;
    }
}
