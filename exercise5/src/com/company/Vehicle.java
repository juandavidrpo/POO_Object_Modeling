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
     * Representa las variables de la clase Vehicle.
     */
    private int nPassengers;
    private boolean tripulation;
    private int nWheels;
    private Date dateRegistration;
    private String scrolling;

    /**
     * Reprenseta el constructor de la clase Vehicle.
     * @param nPassengers de tipo int.
     * @param tripulation de tipo boolean.
     * @param nWheels de tipo int.
     * @param dateRegistration de tipo Date.
     * @param scrolling de tipo String.
     */
    public Vehicle( int nPassengers, boolean tripulation, int nWheels, Date dateRegistration, String scrolling) {
        this.nPassengers = nPassengers;
        this.tripulation = tripulation;
        this.nWheels = nWheels;
        this.dateRegistration = dateRegistration;
        this.scrolling = scrolling;
    }

    public Vehicle() {

    }

    /**
     * Representa el método getnPassengers.
     * @return el número de pasajeros.
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
     * @return si hay o no hay tripulación.
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
     * @return la fecha de matrícula.
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

    public String formatDate(){
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        String dateFormat = sdf.format(this.dateRegistration);
        return dateFormat;
    }

    @Override
    public String toString() {
        return "Vehiculo{" +
                ", Número de pasajeros=" + getnPassengers() +
                ", Tripulación=" + isTripulation() +
                ", Número de ruedas=" + getnWheels() +
                ", Fecha de matricula='" + formatDate() + '\'' +
                ", Se desplaza por='" + getScrolling() + '\'' +
                "}\n";
    }
}
