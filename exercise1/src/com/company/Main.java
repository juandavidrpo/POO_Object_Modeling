/**
 * Se importa el paquete com.company
 * y las librerias JOptionPane y ArrayList.
 */
package com.company;

import javax.swing.JOptionPane;
import java.util.ArrayList;

/**
 * Reprenseta la clase principal "Main"
 * @version 1.0.0 2022-02-14
 * @author Juan David Rojas.
 * @since 1.0.0
 */
public class Main {

    public static void main(String[] args) {
/**
 * Representa los atributos a usar.
 */
        String selection = null;
        final double gravity = 6.673E-11;
        int end = 0;
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
         * Representa el menú principal con las opciones a calcular.
         */
            int selectionMenu = JOptionPane.showOptionDialog(null, "Calcular atracción gravitatoria", "Menú",
                    JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null,
                    new Object[]{"Entre dos cuerpos", "De un cuerpo con respecto al sol", "Cerrar"}, "opcion 1");
        /**
         * Representa la sentencia switch para navegar entre las opciones del menú.
         */
            switch (selectionMenu + 1) {
                /**
                 * El caso 1 representa la opcion de elegir entre dos cuerpos del sistema solar
                 * para despues hacer el calculo gravitacional.
                 */
                case 1:
                String[] options = new String[system.size()];

                for (int i = 0; i < system.size(); i++) {
                    options[i] = system.get(i).getIdentifier() + ". " + system.get(i).getName();
                }

                String planet1 = (String) JOptionPane.showInputDialog(null, "Selecciona un planeta y presiona aceptar",
                        selection, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);

        /**
         * Representa el índice de la selección del planeta que se haga en el primer menú desplegable.
         */
                    int indexPlanet1 = Integer.parseInt(planet1.split(". ")[0]) - 1;

                String planet2 = (String) JOptionPane.showInputDialog(null, "Selecciona otro planeta y presiona aceptar",
                        selection, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);

                    if(planet1 == planet2){
                        throw new IllegalArgumentException("No se puede calcular el mismo cuerpo");
                    }

        /**
         * Representa el índice de la selección del planeta que se haga en el segundo menú desplegable.
         */
                    int indexPlanet2 = Integer.parseInt(planet2.split(". ")[0]) - 1;

        /**
         * Representa el cálculo de restar la distancia de dos cuerpos con respecto al sol
         * para identificar la distancia de ambos cuerpos.
         */
                    double distancePlanet = Math.abs(system.get(indexPlanet1).getDistanceSun() - system.get(indexPlanet2).getDistanceSun());
        /**
         * Representa el cálculo para elevar la distancia al cuadrado.
         */
                    double squaredDistance = Math.pow(distancePlanet, 2);

        /**
         * Representa la formula de la atracción gravitatoria para calcular la atracción de dos cuerpos.
         */
                    double attraction = gravity * ((system.get(indexPlanet1).getMass() * (system.get(indexPlanet2).getMass()) / squaredDistance));
                    System.out.println("La atracción gravitatoria de ambos cuerpos es de: " + attraction + " N");
                break;


        /**
         * El caso 2 representa la opción directa para calcular un cuerpo y el sol.
         */
                case 2:
                    String[] option = new String[system.size()];

                    for (int i = 0; i < system.size(); i++) {
                        option[i] = system.get(i).getIdentifier() + ". " + system.get(i).getName();
                    }

                    String planet = (String) JOptionPane.showInputDialog(null, "Selecciona un planeta y presiona aceptar",
                            selection, JOptionPane.QUESTION_MESSAGE, null, option, option[1]);
        /**
         * Representa el índice del cuerpo seleccionado.
         */
                    int indexPlanet = Integer.parseInt(planet.split(". ")[0]) - 1;

        /**
         * Representa el calculo para elevar al cuadrado la distancia del cuerpo seleccionado.
         */
                    double squaredDistances = Math.pow((system.get(indexPlanet).getDistanceSun()), 2);

        /**
         * Representa la formula de la atracción gravitatoria para calcular la atracción de un cuerpo
         * con respecto al sol.
         */
                    double attractions = gravity * ((system.get(indexPlanet).getMass() * sun.getMass()) / squaredDistances);
                    System.out.println("La atracción gravitatoria de ambos cuerpos es de: " + attractions + " N");
                    break;
                default:
                end = 1;
            }
        }
    }
}
