package Clases;
import java.util.Scanner;

/* OPERADOR MODULO
 * operacion utilizada para hallar el residuo en una division de dos numeros
 * @author: Aitor Quilez Herrero (AKA @Thorqui via: GitHub)
 * @version 1.0
 */

public class Modulo {
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
            /**
             * Residuo de la division de dos números enteros
             * 2 parámetros de entrada y uno de salida (solucion)
             * @num1 Dividendo número entero.
             * @num2 Divisor número numero.
             * @resultado (modulo) resultado del producto.
             */

        System.out.println("--- Operaciones con Módulo ---");
        System.out.print("Ingrese el primer número: ");
        int num1 = scanner.nextInt();
        System.out.print("Ingrese el segundo número: ");
        int num2 = scanner.nextInt();

        if (num2 == 0) {
            System.out.println("Error: No se puede calcular el módulo con un divisor igual a 0.");
        } else {
            int resultado = num1 % num2;
            System.out.println("El resultado de " + num1 + " % " + num2 + " es: " + resultado);
        }
        scanner.close();
        }

    }


