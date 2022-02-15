package com.company;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        ArrayList<Vehicle> vehicles = new ArrayList<>();

        String typeVehicle = null, scrolling = null, dateRegistration;
        int nPassengers = 0, nWheels = 0;
        boolean tripulation = false;

        Scanner read = new Scanner(System.in);

        for(int i = 0; i <= 9; i++) {
            System.out.println("A continuacion ingrese los datos del vehiculo");
            System.out.println("Tipo de vehiculo: ");
            typeVehicle = read.next();

            System.out.println("Numero de pasajeros: ");
            nPassengers = read.nextInt();

            System.out.println("¿Tiene tripulacion?. Escriba True o false: ");
            tripulation = read.nextBoolean();

            System.out.println("Numero de ruedas: ");
            nWheels = read.nextInt();

            System.out.println("Introduzca la fecha con formato DD/MM/YYYY");
            Scanner sc = new Scanner(System.in);
            dateRegistration = sc.nextLine();
            SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
            Date testDate = null;
            String date = dateRegistration;

            try{
                testDate = df.parse(date);
                System.out.println("Se convirtió a tipo fecha, " + testDate);
            } catch (Exception e){ System.out.println("invalid format");}

            if (!df.format(testDate).equals(date)){
                System.out.println("Dato invalido");
            } else {
                System.out.println("Dato validado");
            }

            System.out.println("Medio por el que se desplaza: ");
            scrolling = read.next();

            Vehicle vehicle = new Vehicle(typeVehicle, nPassengers, tripulation, nWheels, testDate, scrolling) {
            };
            vehicles.add(vehicle);
        }
        for(Vehicle vehicle: vehicles) {
            System.out.println(vehicle);}
    }
}
