package com.company;

import java.util.Date;

/**
 * Representa la clase Truck que extiende de la clase Vehicle.
 * @version 1.0.0 2022-02-15
 * @author Juan David Rojas.
 * @since 1.0.0
 */
public class Truck extends Vehicle{
    private double height;

    /**
     * Representa el constructor de la clase Truck.
     * @param nPassengers de tipo int.
     * @param tripulation de tipo boolean.
     * @param nWheels de tipo int.
     * @param dateRegistration de tipo Date.
     * @param scrolling de tipo String.
     * @param height de tipo double.
     */
    public Truck(int nPassengers, boolean tripulation, int nWheels, Date dateRegistration, String scrolling, double height) {
        super(nPassengers, tripulation, nWheels, dateRegistration, scrolling);
        this.height = height;
    }

    public Truck(double trailer) {
        this.height = trailer;
    }
    /**
     * Representa el método getHeight.
     * @return la altura del vehiculo.
     */
    public double getHeight() {
        return height;
    }
    /**
     * Representa el método setHeight.
     * @param height de tipo double.
     */
    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Camion{" +
                ", Número de pasajeros= " + getnPassengers() +
                ", Tripulación= " + isTripulation() +
                ", Número de ruedas=" + getnWheels() +
                ", Fecha de matricula='" + formatDate() + '\'' +
                ", Se desplaza por='" + getScrolling() + '\'' +
                "Altura= " + getHeight() +
                "}\n";
    }
}
