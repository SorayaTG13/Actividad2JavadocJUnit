package Clases;

/**
 *Clase que implementará todos los métodos que están relacionados con la división de la
 * Calculadora.
 *
 * @author: Sandra Marcos García
 * @version: 1.0
 */

    public class Cociente {
    /**
     *División de dos números reales. Tendrá 2 parámetros de entrada y uno de salida que
     * será la solución.
     *
     * @param a Número real Numerador
     * @param b Número real Denominador
     * @return Resultado de la división entre dos números reales (a y b)
     * @throws ArithmeticException mostrará un mensaje de error cuando b(denominador) sea 0
     */

        public static double cocienteReales (double a, double b){
            if(b==0) {
                System.out.println("Error. No es posible dividir entre 0");
            }
            return a/b;
        }

    /**
     * División de dos números enteros. Tendrá 2 parámetros de entrada y uno de salida que
     * será la solución
     *
     * @param a Número entero Numerador
     * @param b Número entero Denominador
     * @return Resultado de la división entre dos números enteros (a y b)
     * @throws ArithmeticException mostrará un mensaje de error cuando b(denominador) sea 0
     */

        public static int cocienteEnteros(int a, int b){
            if(b==0){
                System.out.println("Error. No es posible dividir entre 0");
            }
            return a/b;
        }

    /**
     * Inverso de un número real. Tendrá un parámetro de entrada y uno de salida que
     * será la solución
     *
     * @param b Número real (denominador).
     * @return División del número 1 partido por un número (denominador)
     * @throws ArithmeticException mostrará un mensaje de error cuando b(denominador) sea 0
     */

        public static double cocienteInverso(double b) {
            if(b==0){
                System.out.println("Error. No es posible dividir entre 0");
            }
            return 1/b;
        }

    /**
     * Raíz de un número. Tendrá un parámetro de entrada y uno de salida que
     * será la solución.
     *
     * @param a Número real del que se calculará la raíz cuadrada
     * @return Raíz cuadrada de un número.
     * @throws ArithmeticException mostrará un mensaje de error cuando a sea un número negativo
     */

        public static double raizCuadrada (double a) {
            if(a<0){
                System.out.println("Error. No es posible calcular la raíz cuadrada de un número negativo");
            }
            return Math.sqrt(a);
        }

        public static void main(String[] args) {
            Cociente cociente = new Cociente();

            // División números reales
            double divisionReales = Cociente.cocienteReales(4.25,2.35);
            System.out.println("División reales: " + divisionReales);

            // División reales entre 0
            divisionReales = Cociente.cocienteReales(4.25,0);
            System.out.println("Reales entre 0: " + divisionReales);

            // División enteros
            double divisionEnteros = Cociente.cocienteEnteros(4,2);
            System.out.println("División enteros: " + divisionEnteros);

            // División enteros con resultado decimal

            ///System.out.println();

            // División enteros entre 0
            ///divisionEnteros = Cociente.cocienteEnteros(4,0);

            // Inverso
            double inverso = Cociente.cocienteInverso(8);
            System.out.println("Inverso: " + inverso);

            //Raíz cuadrada
            double raizCuadrada = Cociente.raizCuadrada(6);
            System.out.println("Raíz cuadrada: " + raizCuadrada);

            //Raíz cuadrada negativo
            raizCuadrada = Cociente.raizCuadrada(-6);


    }



}