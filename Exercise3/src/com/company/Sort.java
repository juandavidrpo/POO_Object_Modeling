package com.company;

public class Sort {

    public double[] orderQuickSort(double[] array) {
        return quicksort(array, 0, array.length - 1);
    }

    public double[] quicksort(double[] numbers, int left, int right) {
        if (left >= right) {
            return numbers;
        }
        int i = left, d = right;
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
                quicksort(numbers, left + 1, d);
            }
        } else {
            return numbers;
        }
        return numbers;
    }
}
