package Clases;

import java.util.Scanner;

/**
 * Clase que proporciona operaciones relacionadas con el módulo (residuo de una división) y el valor absoluto.
 * @author: Aitor Quilez Herrero (AKA @Thorqui via: GitHub)
 * @version 1.1
 */

public class Modulo {

    /**
     * Calculo del módulo (residuo de una división entera).
     *
     * @param a Dividendo (número entero).
     * @param b Divisor (número entero, no puede ser cero).
     * @return Residuo de la división de a entre b.
     * @throws ArithmeticException Si el divisor (b) es cero.
     */

    public int calcularModulo(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Error: El divisor no puede ser cero.");
        }
        return a % b;
    }

    /**
     * Calculo del valor absoluto de un número.
     *
     * @param a Número real.
     * @return Valor absoluto de a.
     */
    public double calcularValorAbsoluto(double a) {
        return Math.abs(a);
    }

    /**
     * if (num2 == 0) {
     * System.out.println("Error: No se puede calcular el módulo con un divisor igual a 0.");
     * } else {
     * int resultado = num1 % num2;
     * System.out.println("El resultado de " + num1 + " % " + num2 + " es: " + resultado);
     * }
     */


    public void menu() {
        Modulo modulo = new Modulo();
        Scanner sc = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("===== OPERACIONES MÓDULO Y VALOR ABSOLUTO =====");
            System.out.println("1. Calcular módulo de dos números enteros");
            System.out.println("2. Calcular valor absoluto de un número real");
            System.out.println("3. Salir");
            System.out.print("Elige una opción: ");

            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Introduce el dividendo (entero): ");
                    int a = sc.nextInt();
                    System.out.print("Introduce el divisor (entero): ");
                    int b = sc.nextInt();

                    try {
                        int resultadoModulo = modulo.calcularModulo(a, b);
                        System.out.println("El módulo de " + a + " % " + b + " es: " + resultadoModulo);
                    } catch (ArithmeticException e) {
                        System.out.println(e.getMessage());
                    }
                    break;

                case 2:
                    System.out.print("Introduce un número real: ");
                    double num = sc.nextDouble();
                    double valorAbsoluto = modulo.calcularValorAbsoluto(num);
                    System.out.println("El valor absoluto de " + num + " es: " + valorAbsoluto);
                    break;

                case 3:
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("Opción no válida. Inténtalo de nuevo.");
            }
        } while (opcion != 3);


    }
}


