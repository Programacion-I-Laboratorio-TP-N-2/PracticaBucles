import java.util.Scanner;

public class Bucles_EjercicioTres {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

            // Pedimos el número de productos
            System.out.print("Ingrese el número de productos: ");
            int numProductos = scanner.nextInt();

            // Bucle para cada producto
            for (int i = 1; i <= numProductos; i++) {
                System.out.print("Ingrese la cantidad disponible del producto " + i + ": ");
                int cantidadDisponible = scanner.nextInt();

                // Verificamos si la cantidad es menor a 5
                if (cantidadDisponible < 5) {
                    System.out.println("El producto " + i + " necesita ser pedido.");
                }
            }
        }
    }

