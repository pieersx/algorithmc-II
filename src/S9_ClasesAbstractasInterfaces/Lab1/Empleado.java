package S9_ClasesAbstractasInterfaces.Lab1;

public abstract class Empleado {
    private String nombre;
    private String apellidos;
    private String dni;
    private int yearIngreso;

    public Empleado(String nombre, String apellidos, String dni, int yearIngreso) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.dni = dni;
        this.yearIngreso = yearIngreso;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public int getYearIngreso() {
        return yearIngreso;
    }

    public void setYearIngreso(int yearIngreso) {
        this.yearIngreso = yearIngreso;
    }

    public void imprimir() {
        System.out.println(
            "Nombre y Apellido: " + getNombre() + " " + getApellidos() + "\n" +
            "DNI: " + getDni() + "\n" +
            "Año de ingreso: " + getYearIngreso()
        );
    }

    public abstract double obtenerSalario();
}
