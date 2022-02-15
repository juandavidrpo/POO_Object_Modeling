package com.company;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Vehicle {
    private String typeVehicle;
    private int nPassengers;
    private boolean tripulation;
    private int nWheels;
    private Date dateRegistration;
    private String scrolling;

    public Vehicle(String typeVehicle, int nPassengers, boolean tripulation, int nWheels, Date dateRegistration, String scrolling) {
        this.typeVehicle = typeVehicle;
        this.nPassengers = nPassengers;
        this.tripulation = tripulation;
        this.nWheels = nWheels;
        this.dateRegistration = dateRegistration;
        this.scrolling = scrolling;
    }

    public Vehicle() {

    }

    public String getTypeVehicle() {
        return typeVehicle;
    }

    public void setTypeVehicle(String typeVehicle) {
        this.typeVehicle = typeVehicle;
    }

    public int getnPassengers() {
        return nPassengers;
    }

    public void setnPassengers(int nPassengers) {
        this.nPassengers = nPassengers;
    }

    public boolean isTripulation() {
        return tripulation;
    }

    public void setTripulation(boolean tripulation) {
        this.tripulation = tripulation;
    }

    public int getnWheels() {
        return nWheels;
    }

    public void setnWheels(int nWheels) {
        this.nWheels = nWheels;
    }

    public Date getDateRegistration() {
        return dateRegistration;
    }

    public void setDateRegistration(Date dateRegistration) {
        this.dateRegistration = dateRegistration;
    }

    public String getScrolling() {
        return scrolling;
    }

    public void setScrolling(String scrolling) {
        this.scrolling = scrolling;
    }

    public void Accelerate() {
        System.out.println("Acelerar");
    };

    public void Stop() {
        System.out.println("Parar");
    };

    public String formatDate(){
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        String dateFormat = sdf.format(this.dateRegistration);
        return dateFormat;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "Tipo de vehiculo='" + getTypeVehicle() + '\'' +
                ", Número de pasajeros=" + getnPassengers() +
                ", Tripulación=" + isTripulation() +
                ", Número de ruedas=" + getnWheels() +
                ", Fecha de matricula='" + formatDate() + '\'' +
                ", Se desplaza por='" + getScrolling() + '\'' +
                '}';
    }
}
