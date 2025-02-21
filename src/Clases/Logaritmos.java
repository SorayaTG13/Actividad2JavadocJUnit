package Clases;

import java.util.Scanner;

/**
 * LOGARITMOS Y EXPONENCIALES
 * Esta clase proporciona la resolución matemática de logaritmos y exponenciales
 * @author Adrián Guerrero Martínez
 * @version 1.0
 * Github ProfileName: AdrianGM90
 * GitHub RepositoryURL: https://github.com/SorayaTG13/Actividad2JavadocJUnit.git
 */

public class Logaritmos {

    /**
     * LOGARITMO NATURAL
     * Función que resuelve el logaritmo natural (base "e").
     *
     * @param x Número sobre el que se va a calcular el logaritmo natural
     * @return Logaritmo natural de x.
     */
    public static double log(double x) {
        if(x<=0){
            throw new IllegalArgumentException("El número introducido está fuera del dominio de los " +
                    "logaritmos (0,inf)");
        }
        if (x>Double.MAX_VALUE)
            throw new ArithmeticException("El número introducido excede el valor máximo asignado para" +
                    "variables de tipo double");
        return (Math.log(x));
    }

    /**
     * LOGARITMO DECIMAL
     * Función que resuelve el logaritmo decimal (base 10)
     *
     * @param x Número sobre el que se va a calcular el logaritmo decimal
     * @return Logaritmo decimal de x.
     */
    // 2: LOGARITMO DECIMAL
    public static double log10(double x) {
        if(x <= 0){
            throw new IllegalArgumentException("El número introducido está fuera del dominio de los " +
                    "logaritmos (0,inf)");
        }
        if(x > Double.MAX_VALUE){
            throw new ArithmeticException("El número introducido excede el valor máximo asignado para" +
                    "variables de tipo double");
        }
        return (Math.log10(x));
    }

    /**
     * FUNCIÓN EXPONENCIAL
     * Función que realiza la función exponencial (base "e")
     *
     * @param x Número al que se va elevar a la base exponencial "e"
     * @return Función exponencial de x.
     */
    public static double exp(double x) {
        if (x < -Double.MAX_VALUE){
            throw new ArithmeticException("El número introducido excede el valor mínimo asignado para" +
                    "variables de tipo double");
        }
        if (x > Double.MAX_VALUE){
            throw new ArithmeticException("El número introducido excede el valor máximo asignado para" +
                    "variables de tipo double");
        }
        return (Math.exp(x));
    }

        public static void menu(){
            Scanner leer = new Scanner(System.in);
            char opcion;
            do {
                System.out.println("Selecciona el tipo de operación logarítmica/exponencial");
                System.out.println("Logaritmo natural/neperiano (base e): N");
                System.out.println("Logaritmo decimal (base 10): L");
                System.out.println("Función exponencial: E");
                System.out.println("Salir de este menú: 0");

                opcion = leer.next().charAt(0);
                switch (opcion) {
                    case 'N':
                        System.out.println("Introduce el número sobre el que aplicar el logaritmo natural/neperiano");
                        double a = leer.nextDouble();
                        System.out.println(log(a));
                        break;
                    case 'L':
                        System.out.println("Introduce el número sobre el que aplicar el logaritmo decimal");
                        double b = leer.nextDouble();
                        System.out.println(log10(b));
                        break;
                    case 'E':
                        System.out.println("Introduce el número sobre el que aplicar la función exponencial");
                        double c = leer.nextDouble();
                        System.out.println(exp(c));
                        break;
                    default:
                        System.out.println("No se reconoce el caracter introducido");
                }
            }while (leer.nextInt() != 0) ;
        }
}