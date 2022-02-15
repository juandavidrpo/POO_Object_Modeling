/**
 * Se importa el paquete com.company y las librerias
 * java.text.SimpleDateFormat y java.util.Date
 */
package com.company;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Representa la clase Vehicle.
 * @version 1.0.0 2022-02-15
 * @author Juan David Rojas.
 * @since 1.0.0
 */
public class Vehicle {
    /**
     * Representa los atributos de la clase Vehicle
     */
    private String typeVehicle;
    private int nPassengers;
    private boolean tripulation;
    private int nWheels;
    private Date dateRegistration;
    private String scrolling;

    /**
     * Representa el constructor de la clase Vehicle.
     * @param typeVehicle de tipo String.
     * @param nPassengers de tipo int.
     * @param tripulation de tipo boolean.
     * @param nWheels de tipo int.
     * @param dateRegistration de tipo Date
     * @param scrolling de tipo String.
     */
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

    /**
     * Representa el método getTypeVehicle.
     * @return el tipo de vehiculo.
     */
    public String getTypeVehicle() {
        return typeVehicle;
    }

    /**
     * Representa el método setTypeVehicle.
     * @param typeVehicle de tipo String.
     */
    public void setTypeVehicle(String typeVehicle) {
        this.typeVehicle = typeVehicle;
    }

    /**
     * Representa el método getnPassengers.
     * @return el numero de pasajeros.
     */
    public int getnPassengers() {
        return nPassengers;
    }

    /**
     * Representa el método setnPassengers.
     * @param nPassengers de tipo int.
     */
    public void setnPassengers(int nPassengers) {
        this.nPassengers = nPassengers;
    }

    /**
     * Representa el método isTripulation.
     * @return un boolean si hay tripulación o no.
     */
    public boolean isTripulation() {
        return tripulation;
    }

    /**
     * Representa el método setTripulation.
     * @param tripulation de tipo boolean.
     */
    public void setTripulation(boolean tripulation) {
        this.tripulation = tripulation;
    }

    /**
     * Representa el método getnWheels.
     * @return el número de ruedas.
     */
    public int getnWheels() {
        return nWheels;
    }

    /**
     * Representa el método setnWheels.
     * @param nWheels de tipo int.
     */
    public void setnWheels(int nWheels) {
        this.nWheels = nWheels;
    }

    /**
     * Representa el método getDateRegistration.
     * @return la fecha de la matricula.
     */
    public Date getDateRegistration() {
        return dateRegistration;
    }

    /**
     * Representa el método setDateRegistration.
     * @param dateRegistration de tipo Date.
     */
    public void setDateRegistration(Date dateRegistration) {
        this.dateRegistration = dateRegistration;
    }
    /**
     * Representa el método getScrolling.
     * @return el medio de desplazamiento.
     */
    public String getScrolling() {
        return scrolling;
    }

    /**
     * Representa el método setScrolling.
     * @param scrolling de tipo String.
     */
    public void setScrolling(String scrolling) {
        this.scrolling = scrolling;
    }

    /**
     * Representa el método de aceleración.
     */
    public void Accelerate() {
        System.out.println("Acelerar");
    };

    /**
     * Representa el método de parar.
     */
    public void Stop() {
        System.out.println("Parar");
    };

    public String formatDate(){
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        String dateFormat = sdf.format(this.dateRegistration);
        return dateFormat;
    }

    /**
     * Representa una herencia de la clase Vehicle.
     * @return los atributos de la clase Vehicle.
     */
    @Override
    public String toString() {
        return "Vehiculo{" +
                "Tipo de vehiculo='" + getTypeVehicle() + '\'' +
                ", Número de pasajeros=" + getnPassengers() +
                ", Tripulación=" + isTripulation() +
                ", Número de ruedas=" + getnWheels() +
                ", Fecha de matricula='" + formatDate() + '\'' +
                ", Se desplaza por='" + getScrolling() + '\'' +
                '}';
    }
}
