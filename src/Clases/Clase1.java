package Clases;
/**
 * @author Soraya Turégano González
 * @version 1.0
 */
public class Clase1 {
    /**
     *
     * Se Crean 4 métodos distintos relacionados con la suma:
     */
    /**
     * Suma de dos números reales, tendrá 2 parámetros de entrada y uno de salida que será la solución.
     * @param a Primer número a sumar
     * @param b Segundo numero a sumar
     * @return La suma de a + b.
     */
        public double sumar (double a, double b) {
            return a + b;
        }

     /**
     * Suma de dos números enteros, tendrá 2 parámetros de entrada y uno de salida que será la solución.
      * @param a Primer número a sumar
      * @param b Segundo numero a sumar
      * @return La suma de a + b.
     */
        public int sumar (int a, int b) {
            return a + b;
     }

     /**
      *  Suma de tres números reales, tendrá 3 parámetros de entrada y uno de salida que será la solución.
      *  @param a Primer número a sumar
      *  @param b Segundo numero a sumar
      * @param  c Tercer numero a sumar
      *  @return La suma de a + b + c.
      */

     public double sumar (double a, double b, double c) {
         return a + b + c;
     }

     /**
     * Suma con valor acumulado, tendrá un parámetro de entrada y la clase deberá de guardar el valor acumulado.
      * La clase Acumulador permite almacenar e ir actualizando el acumulado de una suma
      *
     */
     public class Acumulador {
         private double suma;

         /**
          * Creamos el constructor que imicializa en 0
           */
         public Acumulador() {
             this.suma = 0;
         }
         /**
          * Creamos un metodo que nos permite dar un valor al acumulador, sumando el valor previamente almacenado
          */
         public void agregarValor (double valor) {
             suma += valor;
         }
         /**
          * Obtenemos el valor actual del acumulador según los datos informados
          * @return el valor acumulado hasta el momento
          */
         public double getSuma() {
             return suma;
         }

         // Metodos para poner en el main
         /**
          * Clase main que contiene el metodo principal para probar las funcionalidades de la calculadora
          */
         public class Main {
             /**
              * Creamos el Metodo principal que ejecutará las pruebas
              * @param args
              */
             public static void main(String[] args) {
                 //Creamos el metodo de instancia de la Clase
                 Clase1 clase1 = new Clase1();

                 //Creamos el metodo de instancia para el acumulador
                 Clase1.Acumulador acumulador = clase1.new Acumulador();

                 //Hacemos las pruebas de los correspondientes metodos de la suma
                 System.out.println("Suma de los numeros reales"+ clase1.sumar(1.5, 2.5));
                 System.out.println("Suma de los numeros enteros"+ clase1.sumar(10, 15));
                 System.out.println("Suma de los numeros reales"+ clase1.sumar(6.8,2.9,9.7));

                 //Usamos el acumulador pera ir haciendo pruebas y agregando valores
                 acumulador.agregarValor(10);
                 acumulador.agregarValor(26);
                 acumulador.agregarValor(39);

                 //Mostramos el valor total del acumulador
                 System.out.println("Suma de los numeros enteros"+ acumulador.getSuma());

             }
         }

     }


}
