package Test;

import Clases.Modulo;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ModuloTest {

    private Modulo modulo;  // Se declara la variable a nivel de clase

    @BeforeEach
    void setUp() {
        // Se ejecuta antes de cada prueba.
        modulo = new Modulo();
    }

    // PRUEBA CÁLCULO DEL MÓDULO
    @Test
    void calcularModulo() {
        // Caso 1: 50 % 5 = 0
        int resultado1 = modulo.calcularModulo(50, 5);
        assertEquals(0, resultado1);

        // Caso 2: 10 % 3 = 1
        int resultado2 = modulo.calcularModulo(10, 3);
        assertEquals(1, resultado2);

        // Caso 3: División por cero (debe lanzar una excepción)
        ArithmeticException exception = assertThrows(ArithmeticException.class, () -> {
            modulo.calcularModulo(10, 0);
        });

        // Verificamos que el mensaje de la excepción sea correcto (ajústalo según la implementación real)
        assertEquals("El divisor no puede ser cero.", exception.getMessage());
    }

    // PRUEBA CÁLCULO DEL VALOR ABSOLUTO
    @Test
    void calcularValorAbsoluto() {
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
