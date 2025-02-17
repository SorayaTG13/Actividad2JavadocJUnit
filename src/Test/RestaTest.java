package Test;

import Clases.Resta;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;



class RestaTest {

    private Resta resta;

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        // Se ejecuta antés de cada test.
        Resta  = new Resta();



        @org.junit.jupiter.api.Test
        void getValorAcumulado;
    }

        @org.junit.jupiter.api.Test
        void restar () {
            // Comprueba la resta de dos números enteros.

            int resultado = resta.restar(20, 5);
            assertEquals(15, resultado);


        }

        @org.junit.jupiter.api.Test
        void restarReales () {
            double resultado = resta.restarReales(3.5, 2.2);
            assertEquals(1.3, resultado);

        }
        @org.junit.jupiter.api.Test
        void restarRealesTres () {
            double resultado = resta.restarRealesTres(2.7, 6.9, 1.3);
            assertEquals(-5.5, resultado);
        }

        @org.junit.jupiter.api.Test
        void restarAcumulado () {

        }
    }




