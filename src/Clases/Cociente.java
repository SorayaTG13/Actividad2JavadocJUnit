package Clases;

import java.util.Scanner;

/**
 *Clase que implementará todos los métodos que están relacionados con la división de la
 * Calculadora.
 *
 * @author: Sandra Marcos García
 * @version: 1.0
 */

    public class Cociente {
    /**
     *División de dos números reales. Tendrá 2 parámetros de entrada y uno de salida que
     * será la solución.
     *
     * @param a Número real Numerador
     * @param b Número real Denominador
     * @return Resultado de la división entre dos números reales (a y b)
     * @throws ArithmeticException mostrará un mensaje de error cuando b(denominador) sea 0
     */

        public static double cocienteReales (double a, double b){
            if(b==0) {
                throw new ArithmeticException("Error. No es posible dividir entre 0");
            }
            return a/b;
        }

    /**
     * División de dos números enteros. Tendrá 2 parámetros de entrada y uno de salida que
     * será la solución
     *
     * @param entero1 Número entero Numerador
     * @param entero2 Número entero Denominador
     * @return Resultado de la división entre dos números enteros (a y b)
     * @throws ArithmeticException mostrará un mensaje de error cuando b(denominador) sea 0
     */

        public static int cocienteEnteros(int entero1, int entero2){
            if(entero2==0){
                throw new ArithmeticException("Error. No es posible dividir entre 0");
            }
            return entero1/entero2;
        }

    /**
     * Inverso de un número real. Tendrá un parámetro de entrada y uno de salida que
     * será la solución
     *
     * @param numInv Número entero (denominador).
     * @return División del número 1 partido por un número (denominador)
     * @throws ArithmeticException mostrará un mensaje de error cuando b(denominador) sea 0
     */

        public static double cocienteInverso(int numInv) {
            if(numInv==0){
                throw new ArithmeticException("Error. No es posible dividir entre 0");
            }
            return (double) 1 /numInv;
        }

    /**
     * Raíz de un número. Tendrá un parámetro de entrada y uno de salida que
     * será la solución.
     *
     * @param numRaiz Número real del que se calculará la raíz cuadrada
     * @return Raíz cuadrada de un número.
     * @throws IllegalArgumentException mostrará un mensaje de error cuando a sea un número negativo
     */

        public static double raizCuadrada (int numRaiz) {
            if(numRaiz<0){
                throw new IllegalArgumentException("Error. No es posible calcular la raíz cuadrada de un número negativo");
            }
            return Math.sqrt(numRaiz);
        }


        public static void menu(){
            Scanner scanner= new Scanner(System.in);

            do{
                System.out.println("Selecciona qué operación con cocientes deseas realizar:  ");
                System.out.println("1. División de dos números reales");
                System.out.println("2. División de dos números enteros");
                System.out.println("3. Inverso de un número entero");
                System.out.println("Raíz cuadrada de un número");

                int opcion = scanner.nextInt();

                switch (opcion) {
                        case 1:
                        System.out.println("Dame un número real");
                          double a = scanner.nextDouble();
                        System.out.println("Dame un número real");
                          double b = scanner.nextDouble();
                        System.out.println("El resultado de la división entre dos reales es: " + cocienteReales(a,b));
                        break;

                      case 2:
                          System.out.println("Dame un número entero: ");
                          int entero1 = scanner.nextInt();
                          System.out.println("Dame otro número entero: ");
                          int entero2 = scanner.nextInt();
                          System.out.println("El resultado de la división entre dos números enteros es: " + cocienteEnteros(entero1, entero2));

                      case 3:
                          System.out.println("Dame un número entero: ");
                          int numInv = scanner.nextInt();
                          System.out.println("El resultado del inverso entre " + numInv + " es: " + cocienteInverso(numInv));

                      case 4:
                          System.out.println("Dame un número entero: ");
                          int numRaiz = scanner.nextInt();
                          System.out.println("El resultado de la raíz cuadrada de " + numRaiz + " es igual a: " + raizCuadrada(numRaiz));

                    default:
                        System.out.println("Opción incorrecta");
                        }
                    }while (scanner.nextInt() !=4);
            scanner.close();
                }
            }

