package com.company;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {

        int x = Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad de elementos para el arreglo"));
        double[] element = new double[x];
        int nMax = Integer.parseInt(JOptionPane.showInputDialog("Número maximo"));

        for (int i = 0; i < element.length; i++) {
            element[i] = (Math.random() * nMax);
        }
        for (int i = 0; i < element.length; i++) {
            System.out.println(element[i]);
        }

        int end = 0;

        while (end == 0) {
            int selection = JOptionPane.showOptionDialog(null, "¿Que deseas hacer?", "Menu",
                    JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null,
                    new Object[]{"Ordenar por método burbuja", "Ordenar por método sort", "Cerrar"}, "opcion 1");

            switch (selection + 1) {
                case 1:
                    System.out.println("Método burbuja");
                    Bubble bubble = new Bubble();
                    double[] elementOrderBur = bubble.bubble(element);
                    for (int i = 0; i < elementOrderBur.length; i++) {
                        System.out.println(elementOrderBur[i]);
                    }
                    break;

                case 2:
                    System.out.println("Método quicksort");
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
