package com.company;

import java.util.Date;

public class Boat extends Vehicle{
    private boolean anchors;

    public Boat( int nPassengers, boolean tripulation, int nWheels, Date dateRegistration, String scrolling, boolean anchors) {
        super( nPassengers, tripulation, nWheels, dateRegistration, scrolling);
        this.anchors = anchors;
    }

    public Boat(boolean anchors) {
        this.anchors = anchors;
    }

    public boolean isAnchors() {
        return anchors;
    }

    public void setAnchors(boolean anchors) {
        this.anchors = anchors;
    }

    @Override
    public String toString() {
        return "Boat{" +
                ", Número de pasajeros=" + getnPassengers() +
                ", Tripulación=" + isTripulation() +
                ", Número de ruedas=" + getnWheels() +
                ", Fecha de matricula='" + formatDate() + '\'' +
                ", Se desplaza por='" + getScrolling() + '\'' +
                "Anclas= " + isAnchors() +
                "}\n";
    }
}
