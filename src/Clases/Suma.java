package Clases;

import java.util.Scanner;

/**
 * @author Soraya Turégano González
 * @see <a href=https://github.com/SorayaTG13/Actividad2JavadocJUnit.git>
 * @version 1.0
 */

public class Suma {

    /**
     * Suma de dos números reales, tendrá 2 parámetros de entrada y uno de salida que será la solución.
     * @param a Primer número a sumar
     * @param b Segundo numero a sumar
     * @return La suma de a + b.
     */
        public double sumaReales (double a, double b) {
            return a + b;
        }

     /**
     * Suma de dos números enteros, tendrá 2 parámetros de entrada y uno de salida que será la solución.
      * @param a Primer número a sumar
      * @param b Segundo numero a sumar
      * @return La suma de a + b.
     */
        public int sumaEnteros (int a, int b) {
            return a + b;
     }

     /**
      *  Suma de tres números reales, tendrá 3 parámetros de entrada y uno de salida que será la solución.
      *  @param a Primer número a sumar
      *  @param b Segundo numero a sumar
      * @param  c Tercer numero a sumar
      *  @return La suma de a + b + c.
      */

     public double sumaMultiple (double a, double b, double c) {
         return a + b + c;
     }

     /**
     * Suma con valor acumulado, tendrá un parámetro de entrada y la clase deberá de guardar el valor acumulado.
      * La clase Acumulador permite almacenar e ir actualizando el acumulado de una suma
      *
     */
     public static class Acumulador {
         private double suma;

         /**
          * Creamos el constructor que imicializa en 0
          */
         public Acumulador() {
             this.suma = 0;
         }

         /**
          * Creamos un metodo que nos permite dar un valor al acumulador, sumando el valor previamente almacenado
          */
         public void agregarValor(double valor) {
             suma += valor;
         }

         /**
          * Obtenemos el valor actual del acumulador según los datos informados
          *
          * @return el valor acumulado hasta el momento
          */
         public double getSuma() {
             return suma;
         }
     }

         // Metodos para poner en el main


             /**
              * Creamos el Metodo principal que ejecutará las pruebas
              */

             public static void menu() {
                 //Creamos el metodo de instancia de la Clase
                 Suma suma = new Suma();

                 //Creamos el metodo de instancia para el acumulador
                 Acumulador acumulador = new Acumulador();

                 Scanner scanner = new Scanner(System.in);

                 int opcion;

                 do {
                     System.out.println("\n===== OPERACIONES CON SUMAS =====");
                     System.out.println("1. Suma de dos números reales");
                     System.out.println("2. Suma de dos números enteros");
                     System.out.println("3. Suma de tres números reales");
                     System.out.println("4. Acumula sumandos");
                     System.out.println("5. Ver valor acumulado");
                     System.out.println("6. Salir");
                     System.out.print("Elige una opción: ");

                     opcion = scanner.nextInt();

                     switch (opcion) {
                         case 1:
                             System.out.print("Dame un número con decimales: ");
                             double a = scanner.nextDouble();
                             System.out.print("Dame otro número con decimales: ");
                             double b = scanner.nextDouble();
                             System.out.println("Resultado: " + suma.sumaReales(a,b));
                             break;

                         case 2:
                             System.out.print("Dame un número entero: ");
                             int entero1 = scanner.nextInt();
                             System.out.print("Dame número entero: ");
                             int entero2 = scanner.nextInt();
                             System.out.println("Resultado: " + suma.sumaEnteros(entero1, entero2));
                             break;

                         case 3:
                             System.out.print("Dame un número con decimales: ");
                             double num1 = scanner.nextDouble();
                             System.out.print("Dame otro número con decimales: ");
                             double num2 = scanner.nextDouble();
                             System.out.print("Dame otro número más con decimales: ");
                             double num3 = scanner.nextDouble();
                             System.out.println("Resultado: " + suma.sumaMultiple(num1, num2, num3));
                             break;

                         case 4:
                             System.out.print("Dame un numero para acumular: ");
                             double valor = scanner.nextDouble();
                             acumulador.agregarValor(valor);
                             System.out.println("Número agregado al acumulador.");
                             break;

                         case 5:
                             System.out.println("Valor acumulado actual: " + acumulador.getSuma());
                             break;

                         case 6:
                             System.out.println("Saliendo del programa...");
                             break;

                         default:
                             System.out.println("Opción no válida. Inténtalo de nuevo.");
                     }
                 } while (opcion != 6);

                 scanner.close();
             }

     }






