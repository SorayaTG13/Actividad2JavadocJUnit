

import Clases.Cociente;
import Clases.Logaritmos;
import Clases.Suma;
import Clases.Trigonometria;

import java.util.Scanner;

/**
 * Creamos el menu principal para dar funcionalidad a todas las clases
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;
        do {
            // Mostramos el menú de opciones

            System.out.println("Qué operacion quieres realizar: ");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Division");
            System.out.println("5. Operaciones con Módulo");
            System.out.println("6. Operaciones de Trigonometría");
            System.out.println("7. Logaritmos y exponenciales");
            System.out.println("8. Estadística");
            System.out.println("9. Salir");

            // Leemos la opcion del usuario
            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    Suma.menu();
                    break;
                case 2:
                    Resta.menu();
                    break;
                case 3:
                    Producto.menu();
                    break;
                case 4:
                    Cociente.menu();
                    break;
                case 5:
                    Modulo.menu();
                    break;
                case 6:
                    Trigonometria.menu();
                    break;
                case 7:
                    Logaritmos.menu();
                    break;
                case 8:
                    Estadistica.menu();
                    break;
                case 9:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");

            }

        }while (opcion != 9);

        sc.close();

    }
}