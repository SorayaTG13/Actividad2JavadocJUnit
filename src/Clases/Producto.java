package Clases;
/**
 * la clase realizara operaciones matemáticas de calculo de producto
 * @author  Esther Igualada Panadero
 * version 1.0
 */
public class Producto {
    private static System system;

    /**
     *  calculo el producto de dos números reales
     * tendrá 2 parámetros de entrada y uno de salida que será la solucion
     * @param numero1 El primer número real.
     * @param numero2 El segundo número real.
     * @return nos da el resultado del producto.
     */
public double productoReales(double numero1,double numero2){
return numero1*numero2;
}

/**
 * calculo el producto de dos números enteros
 *tendrá 2 parametros de entrada y uno de salida que sera la solucion
 * @param numero1 el primer número entero
 * @param numero2 el segundo numero entero
 * @return nos da el resultado del producto.
 * */
public int productoEnteros(int numero1, int numero2){
    return numero1*numero2;
}
/**
 * calcular el producto de 3 números reales
 * tendra 3 parametros de entrada y uno de salida que sera la solución
 * @param numero1 el primer numero real
 * @param numero2 el segundo numero real
 * @param numero3 el tercer numero real
 * @return nos da el resultado del procucto.
 */

public double productotresReales(double numero1,double numero2,double numero3){
    return numero1*numero2*numero3;
}
/**
 * calculo de una potencia con dos parametros(base y exponente)
 * y un parametro de salida que sera la solucion
 * @param numero1 base
 * @param numero2 exponente
 * @return resultado de la potencia.
 */
public double potencia(double numero1,double numero2){
    return Math.pow(numero1,numero2);
}
/**
 * metodo para probar los metodos de la clase3
 */
public static void main(String[]args){
    Producto Producto = new Producto();

    // producto dos números reales
    double resultadoReales= Producto.productoReales(3.2,5.4);
    System.out.println("Producto de 3.2 y 5.4 (reales): " + resultadoReales);

    //producto dos números enteros
    int resultadoEnteros = Producto.productoEnteros(3,5);
    System.out.println("Producto de 3 y 5 (enteros): " + resultadoEnteros);

    //producto de tres numeros reales
    double ResultadoTresReales= Producto.productotresReales(2.5,3.2,2.3);
    system.out.println("producto de 2.5,3.2 y 2.3 (reales): " + ResultadoTresReales);

    //potencia
    double ResultadoPotencia= Producto.potencia(3.2,5.4);
    system.out.println("potencia(3.2,5.4): " + ResultadoPotencia);
}
}

/**
 * Menu
 */

public static void menu() {
    Scanner leer = new Scanner(System.in);
    Producto producto = new Producto();
    int opcion;

    do {
        System.out.println("Selecciona la operación matemática:");
        System.out.println("1. Producto de dos números reales");
        System.out.println("2. Producto de dos números enteros");
        System.out.println("3. Producto de tres números reales");
        System.out.println("4. Calcular una potencia (base y exponente)");
        System.out.println("0. Salir del menú");

        opcion = leer.nextInt();

        switch (opcion) {
            case 1:
                System.out.println("Introduce el primer número real:");
                double num1 = leer.nextDouble();
                System.out.println("Introduce el segundo número real:");
                double num2 = leer.nextDouble();
                System.out.println("El producto es: " + producto.productoReales(num1, num2));
                break;

            case 2:
                System.out.println("Introduce el primer número entero:");
                int num3 = leer.nextInt();
                System.out.println("Introduce el segundo número entero:");
                int num4 = leer.nextInt();
                System.out.println("El producto es: " + producto.productoEnteros(num3, num4));
                break;

            case 3:
                System.out.println("Introduce el primer número real:");
                double num5 = leer.nextDouble();
                System.out.println("Introduce el segundo número real:");
                double num6 = leer.nextDouble();
                System.out.println("Introduce el tercer número real:");
                double num7 = leer.nextDouble();
                System.out.println("El producto es: " + producto.productotresReales(num5, num6, num7));
                break;

            case 4:
                System.out.println("Introduce la base de la potencia:");
                double base = leer.nextDouble();
                System.out.println("Introduce el exponente:");
                double exponente = leer.nextDouble();
                System.out.println("El resultado de la potencia es: " + producto.potencia(base, exponente));
                break;

            case 0:
                System.out.println("Saliendo del menú...");
                break;

            default:
                System.out.println("Opción no reconocida, por favor elige una opción válida.");
        }
    } while (opcion != 0);  // El ciclo se repite hasta que el usuario elija salir (opción 0)
}

public static void main(String[] args) {
    // Llamamos al menú interactivo
    menu();
}
}