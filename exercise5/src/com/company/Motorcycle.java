package com.company;

import java.util.Date;

/**
 * Representa la clase Motorcycle que extiende de la clase Vehicle.
 * @version 1.0.0 2022-02-15
 * @author Juan David Rojas.
 * @since 1.0.0
 */
public class Motorcycle extends Vehicle {
    private boolean scalapie;

    /**
     * Representa el constructor de la clase Motorcycle.
     * @param nPassengers de tipo int.
     * @param tripulation de tipo boolean.
     * @param nWheels de tipo int.
     * @param dateRegistration de tipo Date.
     * @param scrolling de tipo String.
     * @param scalapie de tipo boolean
     */
    public Motorcycle(int nPassengers, boolean tripulation, int nWheels, Date dateRegistration, String scrolling, boolean scalapie) {
        super(nPassengers, tripulation, nWheels, dateRegistration, scrolling);
        this.scalapie = scalapie;
    }

    public Motorcycle(boolean scalapie) {
        this.scalapie = scalapie;
    }

    /**
     * Representa el método isScalapie.
     * @return si el vehiculo tiene escalapie.
     */
    public boolean isScalapie() {
        return scalapie;
    }

    /**
     * Representa el método setScalapie.
     * @param scalapie de tipo boolean.
     */
    public void setScalapie(boolean scalapie) {
        this.scalapie = scalapie;
    }

    @Override
    public String toString() {
        return "Moto{" +
                ", Número de pasajeros=" + getnPassengers() +
                ", Tripulación=" + isTripulation() +
                ", Número de ruedas=" + getnWheels() +
                ", Fecha de matricula='" + formatDate() + '\'' +
                ", Se desplaza por='" + getScrolling() + '\'' +
                "scalapie= " + isScalapie() +
                "}\n";
    }
}
