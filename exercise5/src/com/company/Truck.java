package com.company;

import java.util.Date;

public class Truck extends Vehicle{
    private double height;

    public Truck(int nPassengers, boolean tripulation, int nWheels, Date dateRegistration, String scrolling, double height) {
        super(nPassengers, tripulation, nWheels, dateRegistration, scrolling);
        this.height = height;
    }

    public Truck(double trailer) {
        this.height = trailer;
    }

    public double getHeight() {
        return height;
    }

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
