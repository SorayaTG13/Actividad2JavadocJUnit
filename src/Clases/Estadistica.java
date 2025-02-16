package Clases;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * ESTADISTICA
 * Esta clase proporciona métodos para calcular medidas estadísticas.
 * @author Mariano Criado Prados
 * @version 1.0
 */
public class Estadistica {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /**
         * Cálculo de la media aritmética
         */
        System.out.print("Ingrese el número de valores decimales para el cálculo de la media: ");
        int cantidadValoresMedia = scanner.nextInt();  // Debe ser int

        if (cantidadValoresMedia <= 0) {
            System.out.println("Error: La cantidad de valores debe ser mayor que 0.");
            return;
        }

        ArrayList<Double> listaValoresMedia = new ArrayList<>();
        double sumaMedia = 0.0;

        System.out.println("Ingrese los " + cantidadValoresMedia + " valores decimales: ");
        for (int i = 0; i < cantidadValoresMedia; i++) {
            double valor = scanner.nextDouble();
            listaValoresMedia.add(valor);
            sumaMedia += valor;
        }

        double media = sumaMedia / cantidadValoresMedia;
        System.out.println("La media es: " + media);

        /**
         * Cálculo de la varianza
         */
        System.out.print("\nIngrese el número de valores decimales para el cálculo de la varianza: ");
        int cantidadVarianza = scanner.nextInt();

        if (cantidadVarianza <= 0) {
            System.out.println("Error: La cantidad de valores debe ser mayor que 0.");
            return;
        }

        ArrayList<Double> listaValoresVarianza = new ArrayList<>();
        double sumaVarianza = 0.0;

        System.out.println("Ingrese los " + cantidadVarianza + " valores decimales: ");
        for (int i = 0; i < cantidadVarianza; i++) {
            double valor = scanner.nextDouble();
            listaValoresVarianza.add(valor);
            sumaVarianza += valor;
        }

        media = sumaVarianza / cantidadVarianza;
        double sumaDiferencia = 0.0;

        for (double valor : listaValoresVarianza) {
            sumaDiferencia += Math.pow(valor - media, 2);
        }

        double varianza = sumaDiferencia / cantidadVarianza;
        System.out.println("La varianza es: " + varianza);

        /**
         * Cálculo de la desviación estándar
         */
        System.out.print("Ingrese el número de valores decimales para el cálculo de la desviación estándar: ");
        int cantidadDesviacion = scanner.nextInt();

        if (cantidadDesviacion <= 0) {
            System.out.println("Error: La cantidad de valores debe ser mayor que 0.");
            return;
        }

        ArrayList<Double> listaValoresDesviacion = new ArrayList<>();
        double sumaDesviacion = 0.0;

        System.out.println("Ingrese los " + cantidadDesviacion + " valores decimales: ");
        for (int i = 0; i < cantidadDesviacion; i++) {
            double valor = scanner.nextDouble();
            listaValoresDesviacion.add(valor);
            sumaDesviacion += valor;
        }

        media = sumaDesviacion / cantidadDesviacion;
        double sumaDiferenciaDesviacion = 0.0;

        for (double valor : listaValoresDesviacion) {
            sumaDiferenciaDesviacion += Math.pow(valor - media, 2);
        }

        double varianzaDesviacion = sumaDiferenciaDesviacion / cantidadDesviacion;
        double desviacionEstandar = Math.sqrt(varianzaDesviacion);
        System.out.println("La desviación stándard es: " + desviacionEstandar);

        scanner.close();
    }
}
