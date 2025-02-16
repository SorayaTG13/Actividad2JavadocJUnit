package Clases;

/*
 * Clase que implementará los métodos relacionados con el calculo del seno,
 * conseno y tangente para la calculadora.
 *
 * @author: Aarón Díaz Hernández
 * @version: 1.3
 */

import java.util.Scanner;

public class Trigonometria {

    public static double calculaSeno(double angulo) {
        return Math.sin(Math.toRadians(angulo));
    }

    public static double calculaCoseno(double angulo) {
        return Math.cos(Math.toRadians(angulo));
    }

    public static double calculaTangente(double angulo) {
        return Math.tan(Math.toRadians(angulo));
    }

    public static void menu() {
        Scanner leer = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("\nSelecciona la operación trigonométrica a realizar");
            System.out.println("1. Calcular Seno");
            System.out.println("2. Calcular Coseno");
            System.out.println("3. Calcular Tangente");
            System.out.println("0. Salir");
            System.out.print("Elige una opción: ");

            opcion = leer.nextInt();
            if (opcion >= 1 && opcion <= 3) {
                System.out.print("Introduce el ángulo en grados: ");
                double angulo = leer.nextDouble();

                switch (opcion) {
                    case 1:
                        System.out.println("El seno de " + angulo + "° es: " + calculaSeno(angulo));
                        break;
                    case 2:
                        System.out.println("El coseno de " + angulo + "° es: " + calculaCoseno(angulo));
                        break;
                    case 3:
                        System.out.println("La tangente de " + angulo + "° es: " + calculaTangente(angulo));
                        break;
                }
            } else if (opcion != 0) {
                System.out.println("Opción no válida. Intenta de nuevo.");
            }

        } while (opcion != 0);

        System.out.println("Saliendo del programa.");
        leer.close();
    }

    public static void main(String[] args) {
        menu();
    }
}
