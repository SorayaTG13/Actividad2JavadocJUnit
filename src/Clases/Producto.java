package Clases;
import java.util.Scanner;  // Make sure to import Scanner for reading user input.

/**
 * @author Esther Igualada Panadero
 * @version 1.0
 * clase para calcular el producto
 */
public class Producto {

    /**
     * Calcular el producto de dos números reales.
     * @param numero1 El primer número real.
     * @param numero2 El segundo número real.
     * @return El resultado del producto.
     */
    public double productoReales(double numero1, double numero2) {
        return numero1 * numero2;
    }

    /**
     * Calcular el producto de dos números enteros.
     * @param numero1 El primer número entero.
     * @param numero2 El segundo número entero.
     * @return El resultado del producto.
     */
    public int productoEnteros(int numero1, int numero2) {
        return numero1 * numero2;
    }

    /**
     * Calcula el producto de tres números reales.
     * @param numero1 El primer número real.
     * @param numero2 El segundo número real.
     * @param numero3 El tercer número real.
     * @return El resultado del producto.
     */
    public double productoTresReales(double numero1, double numero2, double numero3) {
        return numero1 * numero2 * numero3;
    }

    /**
     * Calcula la potencia de un número.
     * @param base La base.
     * @param exponente El exponente.
     * @return El resultado de la potencia.
     */
    public double potencia(double base, double exponente) {
        return Math.pow(base, exponente);
    }

    /**
     * Menú interactivo.
     */
    public static void menu() {
        Scanner leer = new Scanner(System.in);
        Producto producto = new Producto();
        int opcion;

        do {
            System.out.println("Selecciona la operación matemática:");
            System.out.println("1. Producto de dos números reales");
            System.out.println("2. Producto de dos números enteros");
            System.out.println("3. Producto de tres números reales");
            System.out.println("4. Calcular una potencia (base y exponente)");
            System.out.println("0. Salir del menú");

            opcion = leer.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Introduce el primer número real:");
                    double num1 = leer.nextDouble();
                    System.out.println("Introduce el segundo número real:");
                    double num2 = leer.nextDouble();
                    System.out.println("El producto es: " + producto.productoReales(num1, num2));
                    break;

                case 2:
                    System.out.println("Introduce el primer número entero:");
                    int num3 = leer.nextInt();
                    System.out.println("Introduce el segundo número entero:");
                    int num4 = leer.nextInt();
                    System.out.println("El producto es: " + producto.productoEnteros(num3, num4));
                    break;

                case 3:
                    System.out.println("Introduce el primer número real:");
                    double num5 = leer.nextDouble();
                    System.out.println("Introduce el segundo número real:");
                    double num6 = leer.nextDouble();
                    System.out.println("Introduce el tercer número real:");
                    double num7 = leer.nextDouble();
                    System.out.println("El producto es: " + producto.productoTresReales(num5, num6, num7));
                    break;

                case 4:
                    System.out.println("Introduce la base de la potencia:");
                    double base = leer.nextDouble();
                    System.out.println("Introduce el exponente:");
                    double exponente = leer.nextDouble();
                    System.out.println("El resultado de la potencia es: " + producto.potencia(base, exponente));
                    break;

                case 0:
                    System.out.println("Saliendo del menú...");
                    break;

                default:
                    System.out.println("Opción no reconocida, por favor elige una opción válida.");
            }
        } while (opcion != 0);  // El ciclo se repite hasta que el usuario elija salir (opción 0)
    }

    public static void main(String[] args) {
        // Llamamos al menú interactivo
        menu();
    }

    public double productotresReales(double v, double v1, double v2) {
        return 0;
    }

}