package Test;

import Clases.Estadistica;

import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.Collections;
import static org.junit.jupiter.api.Assertions.*;

public class EstadisticaTest {


    @Test
    void testCalcularMedia() {
        assertEquals(5.0, Estadistica.calcularMedia(Arrays.asList(4.0, 5.0, 6.0)), 0.0001);
        assertEquals(3.5, Estadistica.calcularMedia(Arrays.asList(2.0, 5.0)), 0.0001);
        assertThrows(IllegalArgumentException.class, () -> Estadistica.calcularMedia(Collections.emptyList()));
    }

    @Test
    void testCalcularVarianza() {
        assertEquals(2.0, Estadistica.calcularVarianza(Arrays.asList(4.0, 5.0, 6.0)), 0.0001);
        assertEquals(2.25, Estadistica.calcularVarianza(Arrays.asList(1.0, 4.0, 7.0)), 0.0001);
        assertThrows(IllegalArgumentException.class, () -> Estadistica.calcularVarianza(Collections.emptyList()));
    }

    @Test
    void testCalcularDesviacionEstandar() {
        assertEquals(Math.sqrt(2.0), Estadistica.calcularDesviacionEstandar(Arrays.asList(4.0, 5.0, 6.0)), 0.0001);
        assertEquals(Math.sqrt(2.25), Estadistica.calcularDesviacionEstandar(Arrays.asList(1.0, 4.0, 7.0)), 0.0001);
        assertThrows(IllegalArgumentException.class, () -> Estadistica.calcularDesviacionEstandar(Collections.emptyList()));
    }
}
