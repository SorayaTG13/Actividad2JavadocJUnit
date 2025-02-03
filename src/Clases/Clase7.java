package Clases;

import org.w3c.dom.ls.LSOutput;

/**
 * LOGARITMOS Y EXPONENCIALES
 * Esta clase proporciona la resolución matemática de logaritmos y exponenciales
 * @author Adrián Guerrero Martínez
 * @version 1.0
 */

public class Clase7 {

    /** LOGARITMO NATURAL
     * Función que resuelve el logaritmo natural (base "e").
     * @param x Número sobre el que se va a calcular el logaritmo natural
     * @return Logaritmo natural de x.
     */
    public double log(double x) {
        return (Math.log(x));
    }

    // 2: LOGARITMO DECIMAL
    public double log10(double x){
        return (Math.log10(x));
    }

    // 3: EXPONENCIAL
    public double exp(double x){
        return (Math.exp(x));
    }
}