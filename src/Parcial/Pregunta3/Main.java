package Parcial.Pregunta3;

public class Main {
    public static void main(String[] args) throws Exception {
        // Crear un empleado Administrativo
        Administrativo admin = new Administrativo("A001", "Juan", "Perez", 2020, 1500);
        System.out.println("Sueldo neto del Administrativo: " + admin.getSueldoNeto());

        // Crear un empleado Promotor
        Promotor promotor = new Promotor("P002", "María", "García", 2020, 1200, 5000);
        System.out.println("Sueldo neto del Promotor: " + promotor.getSueldoNeto());

        // Crear un empleado Profesor
        Profesor profesor = new Profesor("PR003", "Luis", "Torres", 2024, 0, 20, 50);
        System.out.println("Sueldo neto del Profesor: " + profesor.getSueldoNeto());
    }
}
