package com.company;

import java.util.Date;

/**
 * Representa la clase Bike que extiende de la clase Vehicle.
 * @version 1.0.0 2022-02-14
 * @author Juan David Rojas.
 * @since 1.0.0
 */
public class Bike extends Vehicle {
    private boolean pedal;

    /**
     * Representa el constructor de la clase Bike.
     * @param nPassengers de tipo int.
     * @param tripulation de tipo boolean.
     * @param nWheels de tipo int.
     * @param dateRegistration de tipo Date.
     * @param scrolling de tipo String.
     * @param pedal de tipo boolean
     */
    public Bike(int nPassengers, boolean tripulation, int nWheels, Date dateRegistration, String scrolling, boolean pedal) {
        super(nPassengers, tripulation, nWheels, dateRegistration, scrolling);
        this.pedal = pedal;
    }

    public Bike( boolean pedal) {
        this.pedal = pedal;
    }

    /**
     * Representa el método isPedal.
     * @return si el vehiculo tiene pedales.
     */
    public boolean isPedal() {
        return pedal;
    }

    /**
     * Representa el método setPedal.
     * @param pedal de tipo boolean.
     */
    public void setPedal(boolean pedal) {
        this.pedal = pedal;
    }

    @Override
    public String toString() {
        return "Bicicleta{" +
                ", Número de pasajeros=" + getnPassengers() +
                ", Tripulación=" + isTripulation() +
                ", Número de ruedas=" + getnWheels() +
                ", Fecha de matricula='" + formatDate() + '\'' +
                ", Se desplaza por='" + getScrolling() + '\'' +
                "pedal= " + isPedal() +
                "}\n";
    }
}
