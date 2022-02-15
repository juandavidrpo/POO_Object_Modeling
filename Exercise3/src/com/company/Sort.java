/**
 * Se importa el paquete com.company
 */
package com.company;

/**
 * Representa la clase Sort.
 * @version 1.0.0 2022-02-15
 * @author Juan David Rojas.
 * @since 1.0.0
 */
public class Sort {

    public Sort() {
    }

    /**
     * Representa el metodo para ordenar por quicksort.
     * @param array
     * @return valores ordenados mediante quicksort.
     */
    public double[] orderQuickSort(double[] array) {
        return quicksort(array, 0, array.length - 1);
    }

    public double[] quicksort(double[] numbers, int left, int right) {
        if (left >= right) {
            return numbers;
        }
        int i = left, j = right;
        if (left != right) {
            int pivot;
            double aux;
            pivot = left;
            while (left != right) {
                while (numbers[right] >= numbers[pivot] && left < right) {
                    right--;
                }
                while (numbers[left] < numbers[pivot] && left < right) {
                    left++;
                }
                if (right != left) {
                    aux = numbers[right];
                    numbers[right] = numbers[left];
                    numbers[left] = aux;
                }
            }
            if (left == right) {
                quicksort(numbers, i, left - 1);
                quicksort(numbers, left + 1, j);
            }
        } else {
            return numbers;
        }
        return numbers;
    }
}
