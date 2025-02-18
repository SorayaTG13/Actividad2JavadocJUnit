package Clases;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Clase que proporciona operaciones relacionadas con el módulo (residuo de una división) y el valor absoluto.
 * Ahora admite cálculos con enteros y números decimales.
 *
 * @author: Aitor Quilez Herrero (AKA @Thorqui via: GitHub)
 * @version 2.0 Ultimate edition
 */

public class Modulo {

    /**
     * Calcula el módulo (residuo de una división entera).
     *
     * @param a Dividendo (número entero).
     * @param b Divisor (número entero, no puede ser cero).
     * @return Residuo de la división de a entre b.
     * @throws ArithmeticException Si el divisor (b) es cero.
     */
    public static int calcularModulo(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Error: El divisor no puede ser cero.");
        }
        return a % b;
    }

    /**
     * Calcula el módulo (residuo) de una división con números decimales.
     *
     * @param a Dividendo (número decimal).
     * @param b Divisor (número decimal, no puede ser cero).
     * @return Residuo de la división de a entre b.
     * @throws ArithmeticException Si el divisor (b) es cero.
     */
    public static double calcularModuloDecimales(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("Error: El divisor no puede ser cero.");
        }
        return a % b;
    }

    /**
     * Calcula el valor absoluto de un número entero.
     *
     * @param a Número entero.
     * @return Valor absoluto de a.
     */
    public static int calcularValorAbsoluto(int a) {
        return Math.abs(a);
    }

    /**
     * Calcula el valor absoluto de un número decimal.
     *
     * @param a Número decimal.
     * @return Valor absoluto de a.
     */
    public static double calcularValorAbsoluto(double a) {
        return Math.abs(a);
    }

    /**
     * Menú interactivo para realizar operaciones con enteros y decimales.
     */
    public static void menu() {
        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n===== OPERACIONES MÓDULO Y VALOR ABSOLUTO =====");
            System.out.println("1. Calcular módulo de dos números enteros");
            System.out.println("2. Calcular módulo de dos números decimales");
            System.out.println("3. Calcular valor absoluto de un número entero");
            System.out.println("4. Calcular valor absoluto de un número decimal");
            System.out.println("5. Salir");
            System.out.print("Elige una opción: ");

            try {
                opcion = sc.nextInt();

                switch (opcion) {
                    case 1:
                        System.out.print("Introduce el dividendo (entero): ");
                        int a = sc.nextInt();
                        System.out.print("Introduce el divisor (entero): ");
                        int b = sc.nextInt();

                        try {
                            int resultadoModulo = calcularModulo(a, b);
                            System.out.println("El módulo de " + a + " % " + b + " es: " + resultadoModulo);
                        } catch (ArithmeticException e) {
                            System.out.println(e.getMessage());
                        }
                        break;

                    case 2:
                        System.out.print("Introduce el dividendo (decimal): ");
                        double num1 = sc.nextDouble();
                        System.out.print("Introduce el divisor (decimal): ");
                        double num2 = sc.nextDouble();

                        try {
                            double resultadoModuloDec = calcularModuloDecimales(num1, num2);
                            System.out.println("El módulo de " + num1 + " % " + num2 + " es: " + resultadoModuloDec);
                        } catch (ArithmeticException e) {
                            System.out.println(e.getMessage());
                        }
                        break;

                    case 3:
                        System.out.print("Introduce un número entero: ");
                        int numInt = sc.nextInt();
                        System.out.println("El valor absoluto de " + numInt + " es: " + calcularValorAbsoluto(numInt));
                        break;

                    case 4:
                        System.out.print("Introduce un número decimal: ");
                        double numDec = sc.nextDouble();
                        System.out.println("El valor absoluto de " + numDec + " es: " + calcularValorAbsoluto(numDec));
                        break;

                    case 5:
                        System.out.println("Saliendo del programa...");
                        break;

                    default:
                        System.out.println("Opción no válida. Inténtalo de nuevo.");
                }

            } catch (InputMismatchException e) {
                System.out.println("Error: Entrada no válida. Debes ingresar un número correcto.");
                sc.next(); // Limpiar el buffer de entrada
                opcion = -1; // Para evitar que salga del bucle
            }

        } while (opcion != 5);

        sc.close();
    }

    public static void main(String[] args) {
        menu();
    }
}


