package com.company;

import javax.swing.*;
import java.util.ArrayList;
public class Main {

    public static void main(String[] args) {

        String selection = null;
        double gravity = 6.673E-11;
        int limit = 0;

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

        while (limit == 0) {

            int selectionMenu = JOptionPane.showOptionDialog(null, "Calcular atraccion gravitatoria", "Menu",
                    JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null,
                    new Object[]{"De dos cuerpos", "Con respecto al sol", "Cerrar"}, "opcion 1");

            switch (selectionMenu + 1) {
                case 1:
                String[] options = new String[system.size()];

                for (int i = 0; i < system.size(); i++) {
                    options[i] = system.get(i).getIdentifier() + ". " + system.get(i).getName();
                }

                String planet1 = (String) JOptionPane.showInputDialog(null, "Selecciona un planeta y presiona aceptar",
                        selection, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);

                    int indexPlanet1 = Integer.parseInt(planet1.split(". ")[0]) - 1;

                String planet2 = (String) JOptionPane.showInputDialog(null, "Selecciona otro planeta y presiona aceptar",
                        selection, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);

                    int indexPlanet2 = Integer.parseInt(planet2.split(". ")[0]) - 1;
                    double squaredDistance = Math.pow((system.get(indexPlanet2).getDistanceSun()), 2);
                    double attraction = gravity * ((system.get(indexPlanet1).getMass() * (system.get(indexPlanet2).getMass()) / squaredDistance));
                    System.out.println("La atraccion gravitatoria de ambos cuerpos es de: " + attraction + " N");
                break;

                case 2:
                    String[] option = new String[system.size()];

                    for (int i = 0; i < system.size(); i++) {
                        option[i] = system.get(i).getIdentifier() + ". " + system.get(i).getName();
                    }

                    double sunMass = 1.989 * 10E30;

                    String planet = (String) JOptionPane.showInputDialog(null, "Selecciona un planeta y presiona aceptar",
                            selection, JOptionPane.QUESTION_MESSAGE, null, option, option[1]);

                    int indexPlanet = Integer.parseInt(planet.split(". ")[0]) - 1;
                    double squaredDistances = Math.pow((system.get(indexPlanet).getDistanceSun()), 2);
                    double attractions = gravity * ((system.get(indexPlanet).getMass() * sunMass) / squaredDistances);
                    System.out.println("La atraccion gravitatoria de ambos cuerpos es de: " + attractions + " N");

                case 3:
                default:
                limit = 1;
            }
        }
    }
}
