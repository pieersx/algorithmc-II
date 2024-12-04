package S13_Polimorfismo.Lab1;

public abstract class Empleado {
    protected final String primerNombre;
    protected final String apellidoPaterno;
    protected final String numeroSeguroSocial;

    public Empleado(String primerNombre, String apellidoPaterno, String numeroSeguroSocial) {
        this.primerNombre = primerNombre;
        this.apellidoPaterno = apellidoPaterno;
        this.numeroSeguroSocial = numeroSeguroSocial;
    }

    public String getPrimerNombre() {
        return primerNombre;
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public String getNumeroSeguroSocial() {
        return numeroSeguroSocial;
    }

    public String toString() {
        return String.format(
            "%s %s %nnumero de seguro social: %s",
            getPrimerNombre(), getApellidoPaterno(), getNumeroSeguroSocial()
        );
    }

    public abstract double ingresos();
}
