package Test;

import Clases.Resta;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class RestaTest {

    private Resta resta;

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        // Se ejecuta antés de cada test.
        resta = new Resta();
    }


    @org.junit.jupiter.api.Test
    void getValorAcumulado() {
        // se inicia en 0.
        double inicio = resta.getValorAcumulado();
        assertEquals(0.0, inicio, "error");
        //Hacemos una resta acumulada.
        resta.getValorAcumulado();
        double resultado = resta.restarAcumulado(10.5);
        assertEquals(-10.5, resultado, "error");

    }

    @org.junit.jupiter.api.Test
        // Realiza la resta de dos números enteros.
    void restar() {
        int resultado = resta.restar(10, 5);
        assertEquals(5, resultado, "error");

    }

    @org.junit.jupiter.api.Test
        //Realiza la resta de dos números reales.
    void restarReales() {
        double resultado = resta.restarReales(3.5, 2.2);
        assertEquals(1.3, resultado, "error");

    }

    @org.junit.jupiter.api.Test
        // Realiza la resta de tres números reales
    void restarRealesTres() {
        double resultado = resta.restarRealesTres(2.7, 6.9, 1.3);
        assertEquals(-5.5, resultado, "error");
    }

    @org.junit.jupiter.api.Test
        //Prueba
    void restarAcumulado() {
        resta.restarAcumulado(10.0);
        double resultado = resta.restarAcumulado(10.0);
        assertEquals(-10.0, resultado, "error");


    }

}



