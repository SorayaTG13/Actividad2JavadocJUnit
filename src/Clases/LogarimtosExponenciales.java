package Clases;

/**
 * LOGARITMOS Y EXPONENCIALES
 * Esta clase proporciona la resolución matemática de logaritmos y exponenciales
 * @author Adrián Guerrero Martínez
 * @version 1.0
 */

public class LogarimtosExponenciales {

    /** LOGARITMO NATURAL
     * Función que resuelve el logaritmo natural (base "e").
     * @param x Número sobre el que se va a calcular el logaritmo natural
     * @return Logaritmo natural de x.
     */
    public static double log(double x) {
        return (Math.log(x));
    }

    /** LOGARITMO DECIMAL
     * Función que resuelve el logaritmo decimal (base 10)
     * @param x Número sobre el que se va a calcular el logaritmo decimal
     * @return Logaritmo decimal de x.
     */
    // 2: LOGARITMO DECIMAL
    public static double log10(double x){
        return (Math.log10(x));
    }

    /** FUNCIÓN EXPONENCIAL
     * Función que realiza la función exponencial (base "e")
     * @param x Número al que se va elevar a la base exponencial "e"
     * @return Función exponencial de x.
     */
    public static double exp(double x){
        return (Math.exp(x));


    }
}