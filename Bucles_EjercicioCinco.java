import java.util.Scanner;

public class Bucles_EjercicioCinco {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numEmpleados, horasTrabajadas;
        int horasExtras;

        System.out.print("Ingrese el número de empleados: ");
        numEmpleados = scanner.nextInt();

        int contadorEmpleados = 1;
        do {
            System.out.print("Ingrese las horas trabajadas por el empleado " + contadorEmpleados + ": ");
            horasTrabajadas = scanner.nextInt();

            if (horasTrabajadas > 40) {
                    horasExtras = horasTrabajadas - 40;
                    System.out.println("El empleado " + contadorEmpleados + " trabajó " + horasExtras + " horas extras.");
            }

            contadorEmpleados++;
        } while (contadorEmpleados <= numEmpleados);

    }
}
