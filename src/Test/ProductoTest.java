package Clases;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ProductoTest {

    // instancio la clase
    private Producto producto;


    @BeforeEach
    public void setUp() {
        // Initialize Producto instance before each test
        producto = new Producto();
    }

    // test producto dos reales
    @Test
    public void testProductoReales() {
        double resultado = producto.productoReales(3.2, 5.4);
        assertEquals(17.28, resultado, "El producto de 3.2 y 5.4 debería ser 17.28");
    }

    // test producto dos enteros
    @Test
    public void testProductoEnteros() {
        int resultado = producto.productoEnteros(3, 5);
        assertEquals(15, resultado, "El producto de 3 y 5 debería ser 15");
    }

    // test producto tres reales
    @Test
    public void testProductoTresReales() {
        double resultado = producto.productotresReales(2.5, 3.2, 2.3);
        assertEquals(18.4, resultado, "El producto de 2.5, 3.2 y 2.3 debería ser 18.4");
    }

    // Test potencia
    @Test
    public void testPotencia() {
        double resultado = producto.potencia(3.2, 5.4);
        assertEquals(Math.pow(3.2, 5.4), resultado, "La potencia de 3.2^5.4 debería coincidir");
    }
}