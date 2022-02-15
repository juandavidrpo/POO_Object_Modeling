/**
 * Se importa el paquete com.company y la libreria Scanner.
 */
package com.company;
import java.util.Scanner;

/**
 * Representa la clase principal main.
 * @version 1.0.0 2022-02-15
 * @author Juan David Rojas.
 * @since 1.0.0
 */
public class Main {
    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        int selection, x, nMax, end = 0;

        /**
         * Representa un menú por consola para indicar la cantidad de numeros reales a ingresar
         * y luego de la selección el menú para indicar el valor maximo al que podran llegar los numeros.
         */

        System.out.println("Digite la cantidad de números reales para el arreglo");
        x = read.nextInt();

        double[] element = new double[x];

        System.out.println("Digite el valor maximo");
        nMax = read.nextInt();
        /**
         * Representa un método para crear números aleatorios de acuerdo a la cantidad asignada.
         */
        for (int i = 0; i < element.length; i++) {
            element[i] = (Math.random() * nMax);
        }
        /**
         * Imprime por consola los números aleatorios.
         */
        for (int i = 0; i < element.length; i++) {
            System.out.println(element[i]);
        }

        /**
         * Representa un bucle while que permite una iteración repetida del menú de ordenar.
         */
        while (end == 0) {

            /**
             * Representa el menú por consola para el ordenamiento de los números previamente creados.
             */
            System.out.println("\nPresiona el numero correspondiente para ordenar");
            System.out.println("1.Ordenar por método burbuja\n2.Ordenar por el método sort\n3.Cerrar");

            selection = read.nextInt();

        /**
         * Representa un switch case para navegar entre las opciones del menú.
         */
            switch (selection) {

        /**
         * El caso 1 reprenseta el ordenamiento por medio del metodo burbuja.
         */
                case 1:
                    System.out.println("\nOrdenado por el método burbuja");
                    Bubble bubble = new Bubble();
                    double[] elementOrderBur = bubble.bubble(element);
                    for (int i = 0; i < elementOrderBur.length; i++) {
                        System.out.println(elementOrderBur[i]);
                    }
                    break;
        /**
         * El caso 2 representa el ordenamiento por del metodo sort.
         */
                case 2:
                    System.out.println("\nOrdenado por el método quicksort");
                    Sort sort = new Sort();
                    double[] elementOrderQuick = sort.orderQuickSort(element);
                    for (int i = 0; i < elementOrderQuick.length; i++) {
                        System.out.println(elementOrderQuick[i]);
                    }
                    break;
                default:
                    end = 1;
            }
        }
    }
}
