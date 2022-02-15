/**
 * Se importa el paquete com.company.
 */
package com.company;

/**
 * Representa la clase Bubble.
 * @version 1.0.0 2022-02-15
 * @author Juan David Rojas.
 * @since 1.0.0
 */
public class Bubble {

    public Bubble() {
    }

    /**
     * Representa el metodo para ordenar mediante burbuja.
     * @param array
     * @return un arrayordenado.
     */
    public double[] bubble(double[] array){
        double aux;
        for(int i = 0; i < array.length -1; i++){
            for(int j = i + 1; j < array.length; j++){
                if(array[i] > array[j]){
                    aux = array[i];
                    array[i] = array[j];
                    array[j] = aux;
                }
            }
        }
        return array;
    }
}





