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
    void testcalcularModulo() {
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

    // PRUEBA CÁLCULO DEL MÓDULO CON DECIMALES
    @Test
    void testcalcularModuloDecimales() {
        // Caso 1: 10.5 % 3.0 = 1.5
        assertEquals(1.5, modulo.calcularModuloDecimales(10.5, 3.0), 0.0001);

        // Caso 2: 7.75 % 2.5 = 0.75
        assertEquals(0.75, modulo.calcularModuloDecimales(7.75, 2.5), 0.0001);

        // Caso 3: 5.2 % 1.0 = 0.2
        assertEquals(0.2, modulo.calcularModuloDecimales(5.2, 1.0), 0.0001);

        // Caso 4: División por cero con decimales (debe lanzar excepción)
        ArithmeticException exception = assertThrows(ArithmeticException.class, () -> {
            modulo.calcularModuloDecimales(5.5, 0);
        });

        // Verificamos que el mensaje de la excepción sea correcto
        assertEquals("Error: El divisor no puede ser cero.", exception.getMessage());
    }

    // PRUEBA CÁLCULO DEL VALOR ABSOLUTO
    @Test
    void testcalcularValorAbsoluto() {
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

    // PRUEBA CÁLCULO DEL VALOR ABSOLUTO CON DECIMALES
    @Test
    void testCalcularValorAbsoluto() {
        // Caso 1: Valor absoluto de -7.5 = 7.5
        assertEquals(7.5, modulo.calcularValorAbsoluto(-7.5), 0.0001);

        // Caso 2: Valor absoluto de 3.14 = 3.14
        assertEquals(3.14, modulo.calcularValorAbsoluto(3.14), 0.0001);

        // Caso 3: Valor absoluto de 0.0 = 0.0
        assertEquals(0.0, modulo.calcularValorAbsoluto(0.0), 0.0001);
    }

}
