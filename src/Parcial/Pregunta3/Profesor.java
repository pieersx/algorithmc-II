package Parcial.Pregunta3;

public class Profesor extends Empleado {
    private double sueldoNeto;
    private int horasDictadas;
    private double pagoPorHora;

    public Profesor(String codigo, String nombre, String apellido, int fechaIngreso, double sueldoBase, int horasDictadas, double pagoPorHora) throws Exception {
        if (sueldoBase != 0) throw new Exception("Error : El sueldo base debe ser cero " + sueldoBase);
        super(codigo, nombre, apellido, fechaIngreso, 0);
        this.horasDictadas = horasDictadas;
        this.pagoPorHora = pagoPorHora;
    }

    public double getSueldoNeto() {
        this.sueldoNeto = horasDictadas * pagoPorHora;
        return sueldoNeto;
    }

    public void setSueldoNeto(double sueldoNeto) {
        this.sueldoNeto = sueldoNeto;
    }

    public int getHorasDictadas() {
        return horasDictadas;
    }

    public void setHorasDictadas(int horasDictadas) {
        this.horasDictadas = horasDictadas;
    }

    public double getPagoPorHora() {
        return pagoPorHora;
    }

    public void setPagoPorHora(double pagoPorHora) {
        this.pagoPorHora = pagoPorHora;
    }
}
