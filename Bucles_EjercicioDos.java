import java.util.Scanner;

public class Bucles_EjercicioDos {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Ingrese la cantidad de empleados: ");
            int numEmpleados = scanner.nextInt();

            double tarifaPorHora = 15.0;

            for (int i = 1; i <= numEmpleados; i++) {
                System.out.println("\nEmpleado " + i + ":");
                System.out.print("Ingrese las horas trabajadas: ");
                double horasTrabajadas = scanner.nextDouble();

                double salario = horasTrabajadas * tarifaPorHora;

                System.out.println("El salario del empleado es: $" + salario);
            }

        }
    }

