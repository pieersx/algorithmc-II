package S9_ClasesAbstractasInterfaces.Lab3;

public abstract class Paralelogramo extends Figura {
    protected Punto esquina;

    public Paralelogramo() {
        this.esquina = new Punto(0, 0);
    }

    public Punto getEsquina() {
        return esquina;
    }

    public void setEsquina(Punto esquina) {
        this.esquina = esquina;
    }

    public void desplaza(double deltaX, double deltaY) {
        this.esquina.desplaza(deltaX, deltaY);
    }

    public boolean esCerrada() {
        return true;
    }
}
