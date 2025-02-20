package Test;

import Clases.Logaritmos;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class LogaritmosTest {

    Logaritmos prueba;

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        prueba = new Logaritmos();
    }

    //PRUEBAS UNITARIAS PARA LOGARITMOS NATURALES
    @org.junit.jupiter.api.Test
    void logNegativo() {
        assertThrows(IllegalArgumentException.class, () -> prueba.log(-100));
    }

    @org.junit.jupiter.api.Test
    void logCero() {
        assertThrows(IllegalArgumentException.class, () -> prueba.log(0));
    }

    @org.junit.jupiter.api.Test
    void logPositivo(){
        assertEquals(1,prueba.log(Math.E),"El resultado de la operacion debe ser 1");
    }

    @org.junit.jupiter.api.Test
    void logInfinito() {
        assertThrows(ArithmeticException.class, () -> prueba.log(Double.POSITIVE_INFINITY));
    }

    //PRUEBAS UNITARIAS PARA LOGARITMOS DECIMALES
    @org.junit.jupiter.api.Test
    void log10Negativo() {
        assertThrows(IllegalArgumentException.class, () -> prueba.log10(-100));
    }

    @org.junit.jupiter.api.Test
    void log10Cero() {
        assertThrows(IllegalArgumentException.class, () -> prueba.log10(0));
    }

    @org.junit.jupiter.api.Test
    void log10Positivo() {
        assertEquals(2, prueba.log10(100), "El resultado de la operación debe ser: 2");
    }

    @org.junit.jupiter.api.Test
    void log10Infinito() {
        assertThrows(ArithmeticException.class, () -> prueba.log10(Double.POSITIVE_INFINITY));
    }

    //PRUEBAS UNITARIAS PARA FUNCIONES EXPONENCIALES
    @org.junit.jupiter.api.Test
    void expMenosInfinito() {
        assertThrows(ArithmeticException.class, () -> prueba.exp(-Double.POSITIVE_INFINITY));
    }

    @org.junit.jupiter.api.Test
    void expCero() {
        assertEquals(1, prueba.exp(0), "El resultado de la operación debe ser: 1");
    }

    @org.junit.jupiter.api.Test
    void expNumeroE() {
        assertEquals(Math.E, prueba.exp(1), "El resultado de la operación debe ser: 2.718...");
    }

    @org.junit.jupiter.api.Test
    void expInfinito() {
        assertThrows(ArithmeticException.class, () -> prueba.exp(Double.POSITIVE_INFINITY));
    }
}