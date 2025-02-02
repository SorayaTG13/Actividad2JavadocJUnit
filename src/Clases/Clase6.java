package Clases;

public class Clase6 {

    //metodos para calcular el seno, el conseno y la tangente
    public static double calculaSeno(double angulo) {
        return Math.sin(angulo);
    }

    public static double calculaCoseno(double angulo) {
        return Math.cos(angulo);
    }

    public static double calculaTangente(double angulo) {
        return Math.tan(angulo);
    }

    //Metodo a poner en Main
    public static void main(String[] args) {
        double angulo = Math.PI;
        /*
        Tabla de formulas para calcular el seno, coseno y tangente, pasando de
        grados a grados radianes:

        360º = Math.PI * 2
        270º = Math.pi + (Math.pi / 2) OJO!! esta operación peta el ItelliJ ya que el resultado de la tangente es infinito
        180º = Math.PI
        90ª = Math.PI / 2
        45ª = Math.PI / 4

        Explicación: la funcion Math. de java trabaja haciendo los calculos en radianes,
        por lo que he tenido que realizar la operacion pasando de grados a radianes, no
        pudiendo hacer los calculos en grados y que fuese mas vistozo.
        */

        System.out.println("-El seno, coseno y tangente de 180 grados en radianes es:"); //Modificar este sout cada vez que se modifique la formula
        System.out.println("\n-El seno de " + angulo + " grados radianes es: " + calculaSeno(angulo));
        System.out.println("\n-El coseno de " + angulo + " grados radianes es: " + calculaCoseno(angulo));
        System.out.println("\n-La tangente de " + angulo + " grados radianes es: " + calculaTangente(angulo));
    }
}