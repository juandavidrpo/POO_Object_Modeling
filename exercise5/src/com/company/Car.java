package com.company;

import java.util.Date;

/**
 * Representa la clase Car que extiende de la clase Vehicle.
 * @version 1.0.0 2022-02-14
 * @author Juan David Rojas.
 * @since 1.0.0
 */
public class Car extends Vehicle {
    private boolean doors;

    /**
     * Representa el constructor de la clase Car.
     * @param nPassengers de tipo int.
     * @param tripulation de tipo boolean.
     * @param nWheels de tipo int.
     * @param dateRegistration de tipo Date.
     * @param scrolling de tipo String.
     * @param doors de tipo boolean
     */
    public Car(int nPassengers, boolean tripulation, int nWheels, Date dateRegistration, String scrolling, boolean doors) {
        super(nPassengers, tripulation, nWheels, dateRegistration, scrolling);
        this.doors = doors;
    }

    public Car(boolean doors) {
        this.doors = doors;
    }

    /**
     * Representa el método isDoors.
     * @return si el vehiculo tiene puertas.
     */
    public boolean isDoors() {
        return doors;
    }

    /**
     * Representa el método setDoors.
     * @param doors de tipo boolean.
     */
    public void setDoors(boolean doors) {
        this.doors = doors;
    }

    @Override
    public String toString() {
        return "Carro{" +
                ", Número de pasajeros=" + getnPassengers() +
                ", Tripulación=" + isTripulation() +
                ", Número de ruedas=" + getnWheels() +
                ", Fecha de matricula='" + formatDate() + '\'' +
                ", Se desplaza por='" + getScrolling() + '\'' +
                "Puertas= " + isDoors() +
                "}\n";
    }
}
