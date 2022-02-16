package com.company;

import java.util.Date;

/**
 * Representa la clase Boat que extiende de la clase Vehicle.
 * @version 1.0.0 2022-02-14
 * @author Juan David Rojas.
 * @since 1.0.0
 */
public class Boat extends Vehicle{
    private boolean anchors;

    /**
     * Representa el constructor de la clase Boat.
     * @param nPassengers de tipo int.
     * @param tripulation de tipo boolean.
     * @param nWheels de tipo int.
     * @param dateRegistration de tipo Date.
     * @param scrolling de tipo String.
     * @param anchors de tipo boolean
     */
    public Boat( int nPassengers, boolean tripulation, int nWheels, Date dateRegistration, String scrolling, boolean anchors) {
        super( nPassengers, tripulation, nWheels, dateRegistration, scrolling);
        this.anchors = anchors;
    }

    public Boat(boolean anchors) {
        this.anchors = anchors;
    }

    /**
     * Representa el método isAnchors.
     * @return si el vehiculo tiene ancla o no.
     */
    public boolean isAnchors() {
        return anchors;
    }

    /**
     * Representa el método setAnchors.
     * @param anchors de tipo boolean.
     */
    public void setAnchors(boolean anchors) {
        this.anchors = anchors;
    }

    @Override
    public String toString() {
        return "Lancha{" +
                ", Número de pasajeros=" + getnPassengers() +
                ", Tripulación=" + isTripulation() +
                ", Número de ruedas=" + getnWheels() +
                ", Fecha de matricula='" + formatDate() + '\'' +
                ", Se desplaza por='" + getScrolling() + '\'' +
                "Anclas= " + isAnchors() +
                "}\n";
    }
}
