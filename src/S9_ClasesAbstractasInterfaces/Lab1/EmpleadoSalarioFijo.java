package S9_ClasesAbstractasInterfaces.Lab1;

import java.util.Calendar;

public class EmpleadoSalarioFijo extends Empleado {
    private double sueldoBasico;

    public EmpleadoSalarioFijo() {
        super("", "", "", 0);
    }

    public EmpleadoSalarioFijo(String nombre, String apellidos, String dni, int yearIngreso, double sueldoBasico) {
        super(nombre, apellidos, dni, yearIngreso);
        this.sueldoBasico = sueldoBasico;
    }

    public double getSueldoBasico() {
        return this.sueldoBasico;
    }

    public void setSueldoBasico(double sueldoBasico) {
        this.sueldoBasico = sueldoBasico;
    }

    public double obtenerSalario() {
        Calendar calendario = Calendar.getInstance();
        int actualYear = calendario.get(Calendar.YEAR);
        int yearTrabajando = actualYear - super.getYearIngreso();

        if (yearTrabajando < 0) System.out.println("Error: Número de años negativo " + yearTrabajando);
        else if (yearTrabajando < 2) return this.sueldoBasico;
        else if (yearTrabajando >= 2 && yearTrabajando <= 3) return this.sueldoBasico + (this.sueldoBasico * 0.05);
        else if (yearTrabajando >= 4 && yearTrabajando <= 8) return this.sueldoBasico + (this.sueldoBasico * 0.10);
        else if (yearTrabajando >= 8 && yearTrabajando <= 15) return this.sueldoBasico + (this.sueldoBasico * 0.15);
        else return this.sueldoBasico + (this.sueldoBasico * 0.20);

        return sueldoBasico;
    }

    public void imprimir() {
        super.imprimir();
        System.out.println("Salario: " + obtenerSalario());
        System.out.println();
    }
}
