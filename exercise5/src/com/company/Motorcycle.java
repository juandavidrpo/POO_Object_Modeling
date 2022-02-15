package com.company;

import java.util.Date;

public class Motorcycle extends Vehicle {
    private boolean scalapie;

    public Motorcycle(int nPassengers, boolean tripulation, int nWheels, Date dateRegistration, String scrolling, boolean scalapie) {
        super(nPassengers, tripulation, nWheels, dateRegistration, scrolling);
        this.scalapie = scalapie;
    }

    public Motorcycle(boolean scalapie) {
        this.scalapie = scalapie;
    }

    public boolean isScalapie() {
        return scalapie;
    }

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
