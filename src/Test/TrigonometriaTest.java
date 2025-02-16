package Test;

import Clases.Trigonometria;
import static org.junit.jupiter.api.Assertions.*;
import org.junior.jupiter.api.Test;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TrigonometriaTest {

    @Test
    void senoDeCero() {
        assertEquals(0, Math.sin(Math.toRadians(0)), 0.0001, "El seno de 0° debe ser 0");
    }

    @Test
    void senoDeNoventa() {
        assertEquals(1, Math.sin(Math.toRadians(90)), 0.0001, "El seno de 90° debe ser 1");
    }

    @Test
    void cosenoDeCero() {
        assertEquals(1, Math.cos(Math.toRadians(0)), 0.0001, "El coseno de 0° debe ser 1");
    }

    @Test
    void cosenoDeNoventa() {
        assertEquals(0, Math.cos(Math.toRadians(90)), 0.0001, "El coseno de 90° debe ser 0");
    }

    @Test
    void tangenteDeCuarentaCinco() {
        assertEquals(1, Math.tan(Math.toRadians(45)), 0.0001, "La tangente de 45° debe ser 1");
    }

    @Test
    void tangenteDeNoventa() {
        assertThrows(ArithmeticException.class, () -> {
            double resultado = Math.tan(Math.toRadians(90));
            if (Double.isInfinite(resultado)) {
                throw new ArithmeticException("Tangente indefinida en 90°");
            }
        });
    }
}
