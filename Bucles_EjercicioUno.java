import java.util.Scanner;

public class Bucles_EjercicioUno {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int horasEstudiar = 0, horasEjercicio = 0, horasLeer = 0, horasLibre = 0;

        while (true) {
            System.out.println("Ingrese las horas dedicadas a cada actividad (o 'salir' para terminar):");
            System.out.print("Estudiar: ");
            String entrada = scanner.nextLine();
            if (entrada.equalsIgnoreCase("salir")) {
                break; // Salimos del bucle si el usuario ingresa "salir"
            }
            horasEstudiar += Double.parseDouble(entrada);

            System.out.print("Ejercicio: ");
            entrada = scanner.nextLine();
                    if (entrada.equalsIgnoreCase("salir")) {
                        break;
                    }
                    horasEjercicio += Double.parseDouble(entrada);

                    System.out.print("Leer: ");
                    entrada = scanner.nextLine();
                    if (entrada.equalsIgnoreCase("salir")) {
                        break;
                    }
                    horasLeer += Double.parseDouble(entrada);

                    System.out.print("Tiempo libre: ");
                    entrada = scanner.nextLine();
                    if (entrada.equalsIgnoreCase("salir")) {
                        break;
                    }
                    horasLibre += Double.parseDouble(entrada);
                }

                // Calculamos el tiempo total
                int tiempoTotal = horasEstudiar + horasEjercicio + horasLeer + horasLibre;

                // Imprimimos los resultados
                System.out.println("\nTiempo total dedicado a cada actividad:");
                System.out.println("Estudiar: " + horasEstudiar + " horas");
                System.out.println("Ejercicio: " + horasEjercicio + " horas");
                System.out.println("Leer: " + horasLeer + " horas");
                System.out.println("Tiempo libre: " + horasLibre + " horas");
                System.out.println("Tiempo total: " + tiempoTotal + " horas");

            }


    }

