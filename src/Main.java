import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Sistema de Nomina de Empleados");

        System.out.print("Ingrese la clave: ");
        int clave = entrada.nextInt();

        entrada.nextLine(); // Limpia el salto de linea pendiente

        System.out.print("Ingrese el nombre: ");
        String nombre = entrada.nextLine();

        System.out.print("Ingrese las horas trabajadas: ");
        int horasTrabajadas = entrada.nextInt();

        System.out.print("Ingrese el pago por hora: ");
        double pagoPorHora = entrada.nextDouble();

        Nomina nominaEmpleado = new Nomina(clave, nombre, horasTrabajadas, pagoPorHora);

        System.out.println();
        System.out.println("Horas calculadas: " + nominaEmpleado.getHorasCalculadas());
        System.out.println("Horas normales: " + nominaEmpleado.calcularHorasNormales());
        System.out.println("Horas extra: " + nominaEmpleado.calcularHorasExtra());
        System.out.println("Pago normal: $" + nominaEmpleado.calcularPagoNormal());
        System.out.println("Pago extra: $" + nominaEmpleado.calcularPagoExtra());
        System.out.println("Pago total: $" + nominaEmpleado.calcularPagoTotal());
    }
}
