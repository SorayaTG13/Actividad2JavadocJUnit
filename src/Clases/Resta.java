package Clases;
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

}















































