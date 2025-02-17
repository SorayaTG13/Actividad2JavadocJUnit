package Test;

import Clases.Modulo;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

class ModuloTest {
    private Modulo modulo;

    @BeforeEach
    void setUp() {
        // Se ejecuta antes de cada prueba.
        modulo = new Modulo();
    }

    // PRUEBA CALCULO DEL MÓDULO
    @Test
    void testCalcularModulo() {
        // Caso 1: 50 % 5 = 0
        int resultado1 = modulo.calcularModulo(50, 5);
        assertEquals(0, resultado1);

        // Caso 2: 10 % 3 = 1
        int resultado2 = modulo.calcularModulo(10, 3);
        assertEquals(1, resultado2);

        // Caso 3: División por cero (debe lanzar una excepción)
        Exception exception = assertThrows(ArithmeticException.class, () -> {
            modulo.calcularModulo(10, 0);
        });
        assertEquals("Error: El divisor no puede ser cero.", exception.getMessage());
    }

    // PRUEBA CALCULO DEL VALOR ABSOLUTO
    @Test
    void testCalcularValorAbsoluto() {
        // Caso 1: Valor absoluto de 5.7 = 5.7
        double resultado1 = modulo.calcularValorAbsoluto(5.7);
        assertEquals(5.7, resultado1, 0.0001);

        // Caso 2: Valor absoluto de -3.2 = 3.2
        double resultado2 = modulo.calcularValorAbsoluto(-3.2);
        assertEquals(3.2, resultado2, 0.0001);

        // Caso 3: Valor absoluto de 0 = 0
        double resultado3 = modulo.calcularValorAbsoluto(0);
        assertEquals(0, resultado3, 0.0001);
    }

}