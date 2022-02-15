package com.company;

import java.util.Date;

public class Bike extends Vehicle {
    private boolean pedal;

    public Bike(int nPassengers, boolean tripulation, int nWheels, Date dateRegistration, String scrolling, boolean pedal) {
        super(nPassengers, tripulation, nWheels, dateRegistration, scrolling);
        this.pedal = pedal;
    }

    public Bike( boolean pedal) {
        this.pedal = pedal;
    }

    public boolean isPedal() {
        return pedal;
    }

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
