package Clases;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/**
 * ESTADISTICA
 * Esta clase proporciona métodos para calcular medidas estadísticas.
 * @author Mariano Criado Prados
 * @version 1.2
**/

public class Estadistica {

    public static void menu() {
        Scanner scanner = new Scanner(System.in);
        int opcion = -1;

        // Menú de opciones
        while (opcion != 4) {
            System.out.println("¿Qué operación estadística deseas realizar?");
            System.out.println("1. Calcular Media");
            System.out.println("2. Calcular Varianza");
            System.out.println("3. Calcular Desviación Estándar");
            System.out.println("4. Salir");

            // Leer opción del usuario
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    calcularMedia(scanner);
                    break;
                case 2:
                    calcularVarianza(scanner);
                    break;
                case 3:
                    calcularDesviacionEstandar(scanner);
                    break;
                case 4:
                    System.out.println("Saliendo del menú de estadísticas...");
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        }
        scanner.close();
    }

    public static void calcularMedia(Scanner scanner) {
        System.out.print("Ingrese el número de valores para calcular la media: ");
        int cantidad = scanner.nextInt();

        List<Double> valores = new ArrayList<>();
        System.out.println("Ingrese los valores: ");
        for (int i = 0; i < cantidad; i++) {
            valores.add(scanner.nextDouble());
        }

        double media = calcularMedia(valores);
        System.out.println("La media es: " + media);
    }

    public static void calcularVarianza(Scanner scanner) {
        System.out.print("Ingrese el número de valores para calcular la varianza: ");
        int cantidad = scanner.nextInt();

        List<Double> valores = new ArrayList<>();
        System.out.println("Ingrese los valores: ");
        for (int i = 0; i < cantidad; i++) {
            valores.add(scanner.nextDouble());
        }

        double varianza = calcularVarianza(valores);
        System.out.println("La varianza es: " + varianza);
    }

    public static void calcularDesviacionEstandar(Scanner scanner) {
        System.out.print("Ingrese el número de valores para calcular la desviación estándar: ");
        int cantidad = scanner.nextInt();

        List<Double> valores = new ArrayList<>();
        System.out.println("Ingrese los valores: ");
        for (int i = 0; i < cantidad; i++) {
            valores.add(scanner.nextDouble());
        }

        double desviacionEstandar = calcularDesviacionEstandar(valores);
        System.out.println("La desviación estándar es: " + desviacionEstandar);
    }


    /**
     * GESTION EXCEPCION:
     * @param valores de calculo de media
     * @return Media
     * @throws IllegalArgumentException Si la lista está vacía
     */
    public static double calcularMedia(List<Double> valores) {
        if (valores.isEmpty()) {
            throw new IllegalArgumentException("La lista de valores no puede estar vacía");
        }

        double suma = 0.0;
        for (double valor : valores) {
            suma += valor;
        }
        return suma / valores.size();
    }

    /**
     * GESTION EXCEPCION:
     * @param valores necesarios para el cálculo
     * @return calculo varianza
     * @throws IllegalArgumentException Si la lista está vacía
     */
    public static double calcularVarianza(List<Double> valores) {
        if (valores.isEmpty()) {
            throw new IllegalArgumentException("La lista de valores no puede estar vacía");
        }

        double media = calcularMedia(valores);
        double sumaDiferencias = 0.0;
        for (double valor : valores) {
            sumaDiferencias += Math.pow(valor - media, 2);
        }
        return sumaDiferencias / (valores.size() - 1);
    }

    /**
     * GESTION EXCEPCION:
     * @param valores base desviación estándar
     * @return desviacion estandar
     * @throws IllegalArgumentException Si la lista está vacía
     */
    public static double calcularDesviacionEstandar(List<Double> valores) {
        if (valores.isEmpty()) {
            throw new IllegalArgumentException("La lista de valores no puede estar vacía");
        }
        return Math.sqrt(calcularVarianza(valores));
    }
}
