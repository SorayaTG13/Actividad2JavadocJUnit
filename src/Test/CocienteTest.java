package Test;

import Clases.Cociente;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CocienteTest {
    private final Cociente cociente = new Cociente();

    //División entre dos números reales
    @Test
    public void testDividirReales() {
        double resultado = Cociente.cocienteReales(5.0,2.5);
        assertEquals(2.0, resultado, "El resultado debería ser 2.0");
    }

    //División dos números reales entre 0
    @Test
    public void testDividirReales0() {
        ArithmeticException exception = assertThrows(ArithmeticException.class, () -> {
            Cociente.cocienteReales(5.0, 0.0);
        });
        assertEquals("Error. No es posible dividir entre 0", exception.getMessage());
    }

    //División dos números enteros
    @Test
    public void testDividirEnteros(){
        int resultado = Cociente.cocienteEnteros(4,2);
        assertEquals(2, resultado, "El resultado debería ser 2");
    }

    //División dos números enteros entre 0
    @Test
    public void testDividirEnteros0(){
        ArithmeticException exception = assertThrows(ArithmeticException.class, () -> {
            Cociente.cocienteEnteros(5,0);
        });
        assertEquals("Error. No es posible dividir entre 0", exception.getMessage());
    }

    //Inverso
    @Test
    public void testInverso(){
        double resultado = Cociente.cocienteInverso(5);
        assertEquals(0.2, resultado, "El resultado debería ser 0.2");
    }

    //Raíz cuadrada
    @Test
    public void testRaiz(){
        double resultado = Cociente.raizCuadrada(4);
        assertEquals(2.0, resultado, "El resultado debería ser 2.0");
    }

    //Raíz cuadrada número negativo
    @Test
    public void testRaizNegativo() {
        ArithmeticException exception = assertThrows(ArithmeticException.class, () -> {
            Cociente.raizCuadrada(-8);
        });
        assertEquals("Error. No es posible calcular la raíz cuadrada de un número negativo", exception.getMessage());
    }


}