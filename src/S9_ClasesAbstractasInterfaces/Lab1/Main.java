package S9_ClasesAbstractasInterfaces.Lab1;

// import java.util.Calendar;

public class Main {
    public static void main(String[] args) {
        // Calendar calendario = Calendar.getInstance();

        // int year = calendario.get(Calendar.YEAR);
        // int mes = calendario.get(Calendar.MONTH) + 1;
        // int dia = calendario.get(Calendar.DAY_OF_MONTH);
        // int hora = calendario.get(Calendar.HOUR_OF_DAY);
        // int min = calendario.get(Calendar.MINUTE);
        // int segundo = calendario.get(Calendar.SECOND);

        Empleado[] empleados = new Empleado[4];
        EmpleadoSalarioFijo empleadoSalarioFijo = new EmpleadoSalarioFijo("Javier", "Gomez", "569587A", 2015, 1225);
        EmpleadoComision empleadoComision = new EmpleadoComision("Eva", "Nieto", "695235B", 2010, 179, 8.10);

        EmpleadoComision empleadoComision2 = new EmpleadoComision();
        empleadoComision2.setDni("741258C");
        empleadoComision2.setNombre("José");
        empleadoComision2.setApellidos("Ruiz");
        empleadoComision2.setYearIngreso(2012);
        empleadoComision2.setClientesCaptados(81);
        empleadoComision2.setMontoPorCliente(7.90);

        EmpleadoSalarioFijo empleadoSalarioFijo2 = new EmpleadoSalarioFijo();
        empleadoSalarioFijo2.setDni("896325D");
        empleadoSalarioFijo2.setNombre("Maria");
        empleadoSalarioFijo2.setApellidos("Nuñez");
        empleadoSalarioFijo2.setYearIngreso(2013);
        empleadoSalarioFijo2.setSueldoBasico(1155);

        empleados[0] = empleadoSalarioFijo;
        empleados[1] = empleadoComision;
        empleados[2] = empleadoComision2;
        empleados[3] = empleadoSalarioFijo2;

        sueldoMayor(empleados);
        mostrarTodos(empleados);
    }

    public static void sueldoMayor(Empleado[] empleados) {
        double sueldoMayor = 0;
        int index = 0;
        for (int i = 0; i < empleados.length; ++i) {
            try {
                if (empleados[i].obtenerSalario() > sueldoMayor) {
                    sueldoMayor = empleados[i].obtenerSalario();
                    index = i;
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }

        empleados[index].imprimir();
    }

    public static void mostrarTodos(Empleado[] empleados) {
        for (Empleado empleado : empleados) {
            empleado.imprimir();
        }
    }
}
