package S13_Polimorfismo.Lab1;

public class Main {
    public static void main(String[] args) {
        // crea objetos de las subclases
        EmpleadoAsalariado empleadoAsalariado = new EmpleadoAsalariado("Juan", "Perez", "111-11-1111", 800.00);
        EmpleadoPorHoras empleadoPorHoras = new EmpleadoPorHoras("Karen", "Padilla", "222-22-2222", 16.75, 40);
        EmpleadoPorComision empleadoPorComision =  new EmpleadoPorComision("Susana", "Jimenez", "333-33-3333", 10000, .06);
        EmpleadoBaseMasComision empleadoBaseMasComision =  new EmpleadoBaseMasComision("Basilio", "Loza", "444-44-4444", 5000, .04, 300);

        System.out.println("Empleados procesados por separado:");
        System.out.printf("%n%s%n%s: $%,.2f%n%n", empleadoAsalariado, "ingresos", empleadoAsalariado.ingresos());
        System.out.printf("%s%n%s: $%,.2f%n%n", empleadoPorHoras, "ingresos", empleadoPorHoras.ingresos());
        System.out.printf("%s%n%s: $%,.2f%n%n", empleadoPorComision, "ingresos", empleadoPorComision.ingresos());
        System.out.printf("%s%n%s: $%,.2f%n%n", empleadoBaseMasComision, "ingresos", empleadoBaseMasComision.ingresos());

        // crea un arreglo Empleado de cuatro elementos
        Empleado[] empleados = new Empleado[4];
        // inicializa el arreglo con objetos Empleado
        empleados[0] = empleadoAsalariado;
        empleados[1] = empleadoPorHoras;
        empleados[2] = empleadoPorComision;
        empleados[3] = empleadoBaseMasComision;

        System.out.printf("Empleados procesados en forma polimorfica:%n%n");
        // procesa en forma genérica a cada elemento en el arreglo de empleados
        for (Empleado empleadoActual : empleados){
            System.out.println(empleadoActual); // invoca a toString
            // determina si el elemento es un EmpleadoBaseMasComision
            if (empleadoActual instanceof EmpleadoBaseMasComision) {
                // conversión descendente de la referencia de Empleado
                // a una referencia de EmpleadoBaseMasComision
                EmpleadoBaseMasComision empleado = (EmpleadoBaseMasComision) empleadoActual;
                empleado.setSalarioBase(1.10 * empleado.getSalarioBase());
                System.out.printf("el nuevo salario base con 10%% de aumento es: $%,.2f%n", empleado.getSalarioBase());
            }
            System.out.printf("ingresos $%,.2f%n%n", empleadoActual.ingresos());
        }

        // obtiene el nombre del tipo de cada objeto en el arreglo de empleados
        for (int j = 0; j < empleados.length; j++) {
            System.out.printf("El empleado %d es un %s%n", j, empleados[j].getClass().getName());
        }
    }
}
