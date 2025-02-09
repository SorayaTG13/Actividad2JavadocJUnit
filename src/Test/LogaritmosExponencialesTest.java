package Test;

import Clases.LogaritmosExponenciales;

class LogaritmosExponencialesTest {

    LogaritmosExponenciales prueba;

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        prueba = new LogaritmosExponenciales();
    }

    //PRUEBAS UNITARIAS PARA LOGARITMOS NATURALES
    @org.junit.jupiter.api.Test
    void logNegativo() {
        prueba.log(-1);
    }

    @org.junit.jupiter.api.Test
    void logCero() {
        prueba.log(0);
    }

    @org.junit.jupiter.api.Test
    void logPositivo() {
        prueba.log(100);
    }

    @org.junit.jupiter.api.Test
    void logInfinito() {
        prueba.log(1000000000);
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