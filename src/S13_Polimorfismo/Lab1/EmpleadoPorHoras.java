package S13_Polimorfismo.Lab1;

public class EmpleadoPorHoras extends Empleado {
    private double sueldo;
    private double horas;

    public EmpleadoPorHoras(String primerNombre, String apellidoPaterno, String numeroSeguroSocial, double sueldo, double horas) {
        super(primerNombre, apellidoPaterno, numeroSeguroSocial);
        if (sueldo < 0) throw new IllegalArgumentException("Error: El sueldo por hora debe ser >= 0");
        if (horas < 0 || horas > 168) throw new IllegalArgumentException("Error: Las horas trabajadas deben ser >= 0 y <= 168");

        this.sueldo = sueldo;
        this.horas = horas;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        if (sueldo < 0) throw new IllegalArgumentException("Error: El sueldo por hora debe ser >= 0");

        this.sueldo = sueldo;
    }

    public double getHoras() {
        return horas;
    }

    public void setHoras(double horas) {
        if (horas < 0 || horas > 168) throw new IllegalArgumentException("Error: Las horas trabajadas deben ser >= 0 y <= 168");

        this.horas = horas;
    }

    public double ingresos() {
        if (horas <= 40) {
            return getSueldo() * getHoras();
        } else {
            return getSueldo() *getHoras() + (getHoras() - 40) * getSueldo() * 1.5;
        }
    }

    public String toString(){
        return String.format(
            "empleado por horas: %s%n%s: $%,.2f; %s: %,.2f",
            super.toString(),
            "sueldo por hora", getSueldo(),
            "horas trabajadas", getHoras()
        );
    }
}
