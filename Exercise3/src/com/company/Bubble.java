package com.company;

public class Bubble {

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





