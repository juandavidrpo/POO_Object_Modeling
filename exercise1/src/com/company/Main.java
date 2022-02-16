/**
 * Se importa el paquete com.company
 * y las librerias Scanner y ArrayList.
 */
package com.company;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Representa la clase principal "Main"
 * @version 1.0.0 2022-02-14
 * @author Juan David Rojas.
 * @since 1.0.0
 */
public class Main {

    public static void main(String[] args) {

/**
 * Representa los atributos a usar.
 */
        final double gravity = 6.673E-11;
        int planet1, planet2, end = 0, selection = 0;

        Scanner read = new Scanner(System.in);
/**
 * Representa un ArrayList del sistema solar, con datos especificos de los planetas y el sol.
 */
        ArrayList<PlanetarySystem> system = new ArrayList<>();
        PlanetarySystem sun = new PlanetarySystem(1.989 * 10E30, 1.41, 1390000, 0, 1, "Sol" + "\n");
        PlanetarySystem p1 = new PlanetarySystem(3.285 * 10E23, 5.43, 4879, 5.79*10E10, 2, "Mercurio" + "\n");
        PlanetarySystem p2 = new PlanetarySystem(4.867 * 10E24, 5.24, 12104, 1.08*10E11, 3, "Venus" + "\n");
        PlanetarySystem p3 = new PlanetarySystem(5.972 * 10E24, 5.51, 12742, 1.49*10E11, 4, "Tierra" + "\n");
        PlanetarySystem p4 = new PlanetarySystem(6.39 * 10E23, 3.93, 6779, 2.27*10E11, 5, "Marte" + "\n");
        PlanetarySystem p5 = new PlanetarySystem(1.898 * 10E27, 1.33, 139820, 7.78*10E11, 6, "Júpiter" + "\n");
        PlanetarySystem p6 = new PlanetarySystem(5.683 * 10E26, 0.7, 116460, 1.42*10E12, 7, "Saturno" + "\n");
        PlanetarySystem p7 = new PlanetarySystem(8.681 * 10E25, 1.27, 50724, 2.78*10E12, 8, "Urano" + "\n");
        PlanetarySystem p8 = new PlanetarySystem(1.024 * 10E26, 1.64, 49244, 4.30*10E12, 9, "Neptuno" + "\n");
        system.add(sun);
        system.add(p1);
        system.add(p2);
        system.add(p3);
        system.add(p4);
        system.add(p5);
        system.add(p6);
        system.add(p7);
        system.add(p8);

        /**
         * Representa un bucle while que no deja finalizar el programa hasta que el usuario decida hacerlo.
         */

        while (end == 0) {

            /**
             * Representa la sentencia switch para navegar entre las opciones del menú.
             */


            switch (selection + 1) {
                /**
                 * Representa la opción a elegir entre dos cuerpos del sistema solar
                 * para después hacer el cálculo gravitacional.
                 */
                case 1:
                    System.out.println("Calcular atracción gravitatoria");
                    System.out.println("Selecciona un cuerpo del sistema solar:");
                    System.out.println("0.sol\n1.Mercurio\n2.Venus\n3.Tierra\n4.Marte\n5.Júpiter\n6.Saturno\n7.Urano\n8.Neptuno\n");
                    planet1 = read.nextInt();

                    System.out.println("Selecciona otro cuerpo del sistema");
                    System.out.println("0.sol\n1.Mercurio\n2.Venus\n3.Tierra\n4.Marte\n5.Júpiter\n6.Saturno\n7.Urano\n8.Neptuno\n");
                    planet2 = read.nextInt();

                    if (planet1 == planet2) {
                        throw new IllegalArgumentException("No se puede calcular el mismo cuerpo");
                    }

                    /**
                     * Representa el cálculo de restar la distancia de dos cuerpos con respecto al sol
                     * para identificar la distancia de ambos cuerpos.
                     */
                    double distancePlanet = Math.abs(system.get(planet1).getDistanceSun() - system.get(planet2).getDistanceSun());
                    /**
                     * Representa el cálculo para elevar la distancia al cuadrado.
                     */
                    double squaredDistance = Math.pow(distancePlanet, 2);

                    /**
                     * Representa la fórmula de la atracción gravitatoria para calcular la atracción de dos cuerpos.
                     */
                    double attraction = gravity * ((system.get(planet1).getMass() * (system.get(planet2).getMass()) / squaredDistance));
                    System.out.println("La atracción gravitatoria de ambos cuerpos es de: " + attraction + " N");
                    System.out.println("\n¿Desea continuar el programa?");
                    System.out.println("0.Si\n1.No");
                    end = read.nextInt();
                    break;

                default:
                    end = 1;
            }
        }
    }
}
