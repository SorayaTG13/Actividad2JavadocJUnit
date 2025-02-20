package Test;

import Clases.Suma;


import static org.junit.jupiter.api.Assertions.*;

class SumaTest {

    private Suma suma;

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        suma = new Suma(); // Creamos una instancia de la clase suma para cada prueba
    }

    // Prueba para la suma de dos reales
    @org.junit.jupiter.api.Test
    void testSumaReales() {
        assertEquals(5.5,suma.sumaReales(2.2, 3.3),"La suma esperada de 2.2 y 3.3 es 5.5" );
    }

    @org.junit.jupiter.api.Test
    void testSumarRealesConCero() {
        //Verifica si funciona la excepcion con 0
        assertThrows(IllegalArgumentException.class, () -> suma.sumaReales(0,3.3),"Deberia lanzar una excepcion");
    }

    @org.junit.jupiter.api.Test
    void testSumaEnteros() {
        //Verifica que la suma de 4 y 2 es 6
        assertEquals(6, suma.sumaEnteros(4,2),"Esta suma deberia dar 6");
    }

    @org.junit.jupiter.api.Test
    void testSumaEnterosConCero() {
        //Verifica que nos da una excepcion
        assertThrows(IllegalArgumentException.class, () -> suma.sumaEnteros(0,2),"Deberia lanzar una excepcion");
    }

    @org.junit.jupiter.api.Test
    void testSumaMultiple() {
        assertEquals(8.8, suma.sumaMultiple(2.2, 4.5, 2.1), "La suma esperada total es 8.8");
    }
    @org.junit.jupiter.api.Test
    void testSumaMultipleConCero() {
        //Verifica que da una excepcion
        assertThrows(IllegalArgumentException.class, () -> suma.sumaMultiple(0,0,5), "Deberia lanzar una excepcion");
    }
    @org.junit.jupiter.api.Test
    void testAcumulador() {
        Suma.Acumulador acumulador = new Suma.Acumulador();
        acumulador.agregarValor(6.2);
        assertEquals(6.2, acumulador.getSuma(), "El acumulado será 6.2");
        acumulador.agregarValor(5.6);
        assertEquals(11.8, acumulador.getSuma(),"El resultado seria 11.8");
    }
}