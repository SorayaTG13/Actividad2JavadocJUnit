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
    /*@org.junit.jupiter.api.Test
    void log10() {
    }*/

    //PRUEBAS UNITARIAS PARA FUNCIONES EXPONENCIALES
    /*@org.junit.jupiter.api.Test
    void exp() {
    }*/
}