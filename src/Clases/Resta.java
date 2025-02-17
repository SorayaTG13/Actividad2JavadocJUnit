package Clases;

import java.util.Scanner;

/**
 * Esta clase sirve para restar dos números enteros,
 * dos números reales,tres números reales y hacer restas
 * acumuladas.
 *
 * @author Lucelly Montes
 * @version 0.1
 */


public class Resta {
    /**
     * valorAcumulado es una variable de instancia
     * para el valor acumulado.
     */
    private double valorAcumulado;

    /**
     * constructor que  inicializa en 0.
     */
    public Resta() {
        this.valorAcumulado = 0;

    }

    /**
     * método para obtener valorAcumulado,
     * Esto permite consultar el valor acumulado
     * sin tener que volver a restar.
     *
     * @return valorAcumulado.
     */
    public double getValorAcumulado() {
        return valorAcumulado;
    }

    /**
     * Este método realiza la resta de dos
     * números enteros y devuelve
     * el resultado.
     *
     * @param num1 primer número a restar.
     * @param num2 segundo número a restar.
     * @return la resta de num1 y num2.
     */
    public int restar(int num1, int num2) {
        return num1 - num2;

    }

    /**
     * Resta de dos números reales.
     *
     * @param num1 Primer número real.
     * @param num2 Segundo número real.
     * @return La resta de numR1 y numR2.
     */
    public double restarReales(double num1, double num2) {
        return num1 - num2;
    }


    /**
     * Resta de tres números reales.
     *
     * @param num1 Primer número real.
     * @param num2 Segundo número real.
     * @param num3 Tercer número real.
     * @return La resta de num1, num2 y num3.
     */
    public double restarRealesTres(double num1, double num2, double num3) {
        return num1 - num2 - num3;
    }

    /**
     * Resta con valor acumulado.
     *
     * @param num Número a restar del valor acumulado.
     * @return El nuevo valor acumulado después de la resta.
     */


    public double restarAcumulado(double num) {
        valorAcumulado -= num;
        return valorAcumulado;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Resta menu = new Resta();
        int opcion;


        do {
            System.out.println("Elige una opción:");
            System.out.println("1 - Resta de dos números enteros");
            System.out.println("2 - Resta de dos números reales");
            System.out.println("3 - Resta de tres números reales");
            System.out.println("4 - Resta con valor acumulado");
            System.out.println("5 - Consulta de valor acumulado");
            System.out.println("6 - Salir");

            while (!sc.hasNextInt()) {
                System.out.println(" Introduce un número .");
                sc.next();
            }
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Introduce dos números enteros:");
                    int num1 = sc.nextInt();
                    int num2 = sc.nextInt();
                    System.out.println(" Este es el qqqqq" +
                            "Resultado: " + menu.restar(num1, num2));
                    break;
                case 2:
                    System.out.println("Introduce dos números reales:");
                    double numR1 = sc.nextDouble();
                    double numR2 = sc.nextDouble();
                    System.out.println("Resultado: " + menu.restarReales(numR1,numR2));
                    break;
                case 3:
                    System.out.println("Introduce tres números reales:");
                    double numRT1 = sc.nextDouble();
                    double numRT2 = sc.nextDouble();
                    double numRT3 = sc.nextDouble();
                    System.out.println(" El Resultado es: " + menu.restarRealesTres(numRT1, numRT2, numRT3));
                    break;
                case 4:
                    System.out.println("Introduce un número para restar al acumulado:");
                    double num = sc.nextDouble();
                    System.out.println("Nuevo valor acumulado: " + menu.restarAcumulado(num));

                    break;
                case 5:
                    System.out.println("Valor acumulado: " + menu.getValorAcumulado());
                    break;
                case 6:
                    System.out.println("Fin del programa...");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        } while (opcion != 6);

        sc.close();
    }









}















































