package com.company;

import javax.swing.*;
import java.util.ArrayList;
public class Main {

    public static void main(String[] args) {

        String selection = null;
        double gravity = 6.673E-11;


        ArrayList<PlanetarySystem> system = new ArrayList<>();
        PlanetarySystem p1 = new PlanetarySystem(3.285 * 10E23, 5.43, 4879, 57910000, 1, "Mercurio" + "\n");
        PlanetarySystem p2 = new PlanetarySystem(4.867 * 10E24, 5.24, 12104, 108200000, 2, "Venus" + "\n");
        PlanetarySystem p3 = new PlanetarySystem(5.972 * 10E24, 5.51, 12742, 146600000, 3, "Tierra" + "\n");
        PlanetarySystem p4 = new PlanetarySystem(6.39 * 10E23, 3.93, 6779, 227940000, 4, "Marte" + "\n");
        PlanetarySystem p5 = new PlanetarySystem(1.898 * 10E27, 1.33, 139820, 778330000, 5, "Júpiter" + "\n");
        PlanetarySystem p6 = new PlanetarySystem(5.683 * 10E26, 0.7, 116460, 1429400000, 6, "Saturno" + "\n");
        PlanetarySystem p7 = new PlanetarySystem(8.681 * 10E25, 1.27, 50724, 2870990000L, 7, "Urano" + "\n");
        PlanetarySystem p8 = new PlanetarySystem(1.024 * 10E26, 1.64, 49244, 4504300000L, 8, "Neptuno" + "\n");
        system.add(p1);
        system.add(p2);
        system.add(p3);
        system.add(p4);
        system.add(p5);
        system.add(p6);
        system.add(p7);
        system.add(p8);

        String[] options = new String[system.size()];

        for (int i = 0; i < system.size(); i++) {
            options[i] = system.get(i).getIdentifier() + "-" + system.get(i).getName();
        }

        JOptionPane.showOptionDialog(null, "¿Que deseas hacer?", "Menu",
                JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null,
                new Object[]{"Calcular traccion gravitatoria", "Cerrar"}, "opcion 1");

        String planet1 = (String) JOptionPane.showInputDialog(null, "Selecciona un planeta y presiona aceptar",
                selection, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);

        int indexPlanet1 = Integer.parseInt(planet1.split("-")[0]) - 1;


        String planet2 = (String) JOptionPane.showInputDialog(null, "Selecciona otro planeta y presiona aceptar",
                selection, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);

        int indexPlanet2 = Integer.parseInt(planet2.split("-")[0]) - 1;


        double distance = Double.parseDouble(JOptionPane.showInputDialog("Ingresa la distancia de ambos").toUpperCase());

        double squaredDistance = Math.pow(distance, 2);
        double attraction = gravity * ((system.get(indexPlanet1).getMass() * system.get(indexPlanet2).getMass()) / squaredDistance);

        System.out.println("La atraccion gravitatoria de ambos cuerpos es :" + attraction + " N");

    }
}
