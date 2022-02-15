/**
 * Se importa el paquete com.company
 */
package com.company;

/**
 * Representa la clase PlanetarySystem.
 * @version 1.0.0 2022-02-14
 * @author Juan David Rojas.
 * @since 1.0.0
 */
public class PlanetarySystem {
    /**
     * Representa los atributos de la clase PlanetarySystem.
     */
    private double mass;
    private double density;
    private int diameter;
    private double distanceSun;
    private int identifier;
    private String name;

    /**
     * Representa el constructor de la clase PlanetarySystem.
     * @param mass de tipo double.
     * @param density de tipo double.
     * @param diameter de tipo int.
     * @param distanceSun de tipo double.
     * @param identifier de tipo int.
     * @param name de tipo String.
     */
    public PlanetarySystem(double mass, double density, int diameter, double distanceSun, int identifier, String name) {
        this.mass = mass;
        this.density = density;
        this.diameter = diameter;
        this.distanceSun = distanceSun;
        this.identifier = identifier;
        this.name = name;
    }

    /**
     * Representa el metodo getMass.
     * @return la masa de un cuerpo.
     */

    public double getMass() {
        return mass;
    }

    /**
     * Representa el metodo setMass.
     * @param mass de tipo double.
     */
    public void setMass(double mass) {
        this.mass = mass;
    }

    /**
     * Representa el metodo getDensity.
     * @return la densidad de un cuerpo.
     */
    public double getDensity() {
        return density;
    }

    /**
     * Representa el metodo setDensity.
     * @param density de tipo double.
     */
    public void setDensity(double density) {
        this.density = density;
    }

    /**
     * Representa el metodo getDiameter.
     * @return el diametro de un cuerpo.
     */
    public int getDiameter() {
        return diameter;
    }

    /**
     * Representa el metodo setDiameter.
     * @param diameter de tipo int.
     */
    public void setDiameter(int diameter) {
        this.diameter = diameter;
    }

    /**
     * Representa el metodo getDistanceSun.
     * @return la distancia al sol.
     */
    public double getDistanceSun() {
        return distanceSun;
    }

    /**
     * Representa el metodo setDistanceSun.
     * @param distanceSun de tipo double.
     */
    public void setDistanceSun(double distanceSun) {
        this.distanceSun = distanceSun;
    }

    /**
     * Representa el metodo getIdentifier.
     * @return el identificador de un cuerpo.
     */
    public int getIdentifier() {
        return identifier;
    }

    /**
     * Representa el metodo setIdentifier.
     * @param identifier de tipo int.
     */
    public void setIdentifier(int identifier) {
        this.identifier = identifier;
    }

    /**
     * Representa el metodo getName.
     * @return el nombre de un cuerpo.
     */
    public String getName() {
        return name;
    }

    /**
     * Representa el metodo setName.
     * @param name de tipo String.
     */
    public void setName(String name) {
        this.name = name;
    }
}
