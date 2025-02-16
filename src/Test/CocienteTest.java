package Test;
import Clases.Cociente;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Test;


public class CocienteTest {

    // Prueba division números reales.
    @org.junit.jupiter.api.Test
    void cocienteReales (){

        double resultado = Cociente.cocienteReales(-77.80, 77.80);
        assertEquals (1, resultado);
    }

    // Prueba division números reales entre 0.
    @org.junit.jupiter.api.Test
    void cocienteRealesCero (){

        assertThrows(ArithmeticException.class, () -> Cociente.cocienteReales(54.43, 0));
    }

    // Prueba division enteros.
    @org.junit.jupiter.api.Test
    void cocienteEnteros (){

        double resultado = Cociente.cocienteEnteros(44, 2);
        assertEquals (22, resultado);
    }

    // Prueba division números enteros entre 0.
    @org.junit.jupiter.api.Test
    void cocienteRealesCero (){

        assertThrows(ArithmeticException.class, () -> Cociente.cocienteReales(54, 0));
    }

    // Prueba division inversa.
    @org.junit.jupiter.api.Test
    void cocienteInverso (){

        double resultado = Cociente.cocienteInverso(4);
        assertEquals (0.25, resultado);
    }

    // Prueba raiz cuadrada.
    @org.junit.jupiter.api.Test
    void raizCuadrada (){

        double resultado = Cociente.raizCuadrada(4);
        assertEquals (2, resultado);
    }

    // Prueba raiz cuadrada negativa
    @org.junit.jupiter.api.Test
    void raizNegativa (){

        assertThrows(ArithmeticException.class, () -> Cociente.raizCuadrada(-1));

    }
}
