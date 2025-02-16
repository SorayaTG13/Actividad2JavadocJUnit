package Test;
import Clases.Producto;

import.org.junit.jupiter.api.Test;
import Static Org.junit.jupiter.api.Assertions.*;

public class Clase3Test {

    // instancio la clase que se va a probar
    Clase3 clase3 = new Clase3();

    // Test para metodo dos productos reales
    @Test
    public void testProductoReales() {
        double resultado = clase3.productoReales(3.2, 5.4);
        assertEquals(17.28, resultado, "El producto de 3.2 y 5.4 debe ser 17.28");
    }

    // Test para el metodo producto dos enteros
    @Test
    public void testProductoEnteros() {
        int resultado = clase3.productoEnteros(3, 5);
        assertEquals(15, resultado, "El producto de 3 y 5 debe ser 15");
    }

    // test para metodo produto tres Reales
    @Test
    public void testProductotresReales() {
        double resultado = clase3.productotresReales(2.5, 3.2, 2.3);
        assertEquals(18.4, resultado, "El producto de 2.5, 3.2 y 2.3 debe ser 18.4");
    }

    // Test para el metodo potencia
    @Test
    public void testPotencia() {
        double resultado = clase3.potencia(3.2, 5.4);
        assertEquals(Math.pow(3.2, 5.4), resultado, "La potencia de 3.2^5.4 debe ser igual al valor calculado.");

}
