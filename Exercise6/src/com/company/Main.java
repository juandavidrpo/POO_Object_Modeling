package com.company;

import java.util.Scanner;
import java.util.Vector;

/**
 * Representa la clase principal "Main"
 * @version 1.0.0 2022-02-15
 * @author Juan David Rojas.
 * @since 1.0.0
 */
public class Main {
    public static void main(String[] args) {
/**
 * Representa la instancia vector y las variables a usar.
 */
        Vector vector = new Vector();
        Scanner read = new Scanner(System.in);
        int beforeNumber = 0;
        boolean repeats = true;

        try{
            /**
             * Representa un bucle while para escribir números sin limite.
             */
            while(repeats){
                System.out.print("Escribe un número: ");
                int currentNumber = read.nextInt();
                vector.add(currentNumber);
                /**
                 * Imprime por consola el número repetido y finaliza el bucle.
                 */
                if((vector.size() > 1) && (currentNumber == beforeNumber)){
                    System.out.println("Número consecutivo repetido:\n" + currentNumber);
                    repeats = false;
                }else{
                    beforeNumber = currentNumber;
                }
            }
        /**
         * Imprime por consola todos los números ingresados.
         */
            System.out.println("Números ingresados: ");
            for(int i = 0; i < vector.size(); i++){
                System.out.print(vector.get(i) + " - ");
            }
        }catch (IllegalArgumentException exception){
        }catch (Exception exception){
            System.out.println("Argumento no valido." + exception);
        }
    }
}