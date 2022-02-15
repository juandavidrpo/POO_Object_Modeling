package com.company;

import java.util.Date;

public class Car extends Vehicle {
    private boolean doors;

    public Car(int nPassengers, boolean tripulation, int nWheels, Date dateRegistration, String scrolling, boolean doors) {
        super(nPassengers, tripulation, nWheels, dateRegistration, scrolling);
        this.doors = doors;
    }

    public Car(boolean doors) {
        this.doors = doors;
    }

    public boolean isDoors() {
        return doors;
    }

    public void setDoors(boolean doors) {
        this.doors = doors;
    }

    @Override
    public String toString() {
        return "Car{" +
                ", Número de pasajeros=" + getnPassengers() +
                ", Tripulación=" + isTripulation() +
                ", Número de ruedas=" + getnWheels() +
                ", Fecha de matricula='" + formatDate() + '\'' +
                ", Se desplaza por='" + getScrolling() + '\'' +
                "Puertas= " + isDoors() +
                "}\n";
    }
}
