import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Sistema de Nomina de Empleados");

        System.out.print("Ingrese la clave: ");
        String clave = entrada.next();

        entrada.nextLine(); // Limpia el salto de linea pendiente

        System.out.print("Ingrese el nombre: ");
        String nombre = entrada.nextLine();

        System.out.print("Ingrese las horas trabajadas: ");
        int horasTrabajadas = entrada.nextInt();

        System.out.print("Ingrese el pago por hora: ");
        double pagoPorHora = entrada.nextDouble();

        Nomina nominaEmpleado = new Nomina(clave, nombre, horasTrabajadas, pagoPorHora);

        System.out.println();
        System.out.println("=====================================");
        System.out.println("           RECIBO DE NOMINA");
        System.out.println("=====================================");

        System.out.println("Clave: " + nominaEmpleado.getClave());
        System.out.println("Empleado: " + nominaEmpleado.getNombre());
        System.out.println("Horas normales: " + nominaEmpleado.calcularHorasNormales());
        System.out.println("Horas extra: " + nominaEmpleado.calcularHorasExtra());
        System.out.println("Pago por hora: $" + nominaEmpleado.getPagoPorHora());
        System.out.println("Pago normal: $" + nominaEmpleado.calcularPagoNormal());
        System.out.println("Pago horas extra: $" + nominaEmpleado.calcularPagoExtra());

        System.out.println("---------------------------------------");
        System.out.println("Pago total: $" + nominaEmpleado.calcularPagoTotal());
        System.out.println("=======================================");

        if (nominaEmpleado.getHorasTrabajadas() > 50)
        {
            System.out.println("Advertencia: solo se consideran 50 horas para el calculo.");
        }
    }
}
