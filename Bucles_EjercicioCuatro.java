import java.util.Scanner;

public class Bucles_EjercicioCuatro {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double totalVentas = 0;
        int dia = 1;

        while (dia <= 7) {
                System.out.print("Ingrese las ventas del día " + dia + ": $");
                double ventasDia = scanner.nextDouble();

                totalVentas += ventasDia;
                dia++;
        }

        System.out.println("\nEl total de ventas de la semana es: $" + totalVentas);

        }
    }

