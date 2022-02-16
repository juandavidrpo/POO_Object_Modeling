package com.company;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

/**
 * Representa la clase principal "Main".
 * @version 1.0.0 2022-02-15
 * @author Juan David Rojas.
 * @since 1.0.0
 */
public class Main {

    public static void main(String[] args) {
/**
 * Representa los atributos a usar.
 */
        String scrolling = null, dateRegistration;
        int nPassengers = 0, nWheels = 0, decision = 0;
        boolean tripulation = false;
/**
 * Representa el ArrayList de las clases.
 */
        ArrayList<Boat> boats = new ArrayList<>();
        ArrayList<Car> cars = new ArrayList<>();
        ArrayList<Bike> bicycles = new ArrayList<>();
        ArrayList<Motorcycle> motorcycles = new ArrayList<>();
        ArrayList<Truck> trucks = new ArrayList<>();

        Scanner read = new Scanner(System.in);

        try {

    /**
     * Representa un bucle for de 10 repeticiones.
     */
            for(int i = 0; i <= 9; i++) {
            System.out.println("1.Moto\n2.Lancha\n3.Carro\n4.Bicicleta\n5.Camion\nEscriba el número del vehiculo a crear");
            decision = read.nextInt();

            System.out.println("Ingrese los datos del vehiculo");

            System.out.println("Numero de pasajeros: ");
            nPassengers = read.nextInt();

            System.out.println("¿Tiene tripulación?. Escriba True o false: ");
            tripulation = read.nextBoolean();

            System.out.println("Numero de ruedas: ");
            nWheels = read.nextInt();

            System.out.println("Introduzca la fecha con formato DD/MM/YYYY");
            Scanner sc = new Scanner(System.in);
            dateRegistration = sc.nextLine();
            SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
            Date testDate = null;
            String date = dateRegistration;

    /**
     * Representa un try catch para las excepciones al momento de
     * convertir un valor de tipo String a tipo Date.
     */
            try{
                testDate = df.parse(date);
                System.out.println("Se convirtió a tipo fecha, " + testDate);
            } catch (Exception exception){ System.out.println("Formato invalido");}

            if (!df.format(testDate).equals(date)){
                System.out.println("Dato invalido");
            } else {
                System.out.println("Dato valido");
            }

            System.out.println("Medio por el que se desplaza: ");
            scrolling = read.next();

            switch (decision) {
    /**
     * Representa el caso 1 para el atributo booleano de la moto.
     */
                case 1:
                    System.out.println("¿Tiene escalapie? Responder true o false");
                    boolean scalapie = read.nextBoolean();
                    Motorcycle motorcycle = new Motorcycle(nPassengers, tripulation, nWheels, testDate, scrolling, scalapie);
                    motorcycles.add(motorcycle);
                    break;
    /**
     * Representa el caso 2 para el atributo booleano de la lancha.
     */
                case 2:
                    System.out.println("¿Tiene ancla? Responde true o false");
                    boolean anchors = read.nextBoolean();
                    Boat boat = new Boat(nPassengers, tripulation, nWheels, testDate, scrolling, anchors);
                    boats.add(boat);
                    break;

    /**
     * Representa el caso 3 para el atributo booleano del carro.
     */
                case 3:
                    System.out.println("¿Tiene hasta cuatro puertas? Responder true o false");
                    boolean doors = read.nextBoolean();
                    Car car = new Car(nPassengers, tripulation, nWheels, testDate, scrolling, doors);
                    cars.add(car);
                    break;
    /**
     * Representa el caso 4 para el atributo booleano de la bicicleta.
     */
                case 4:
                    System.out.println("¿Tiene pedales? Responder true o false");
                    boolean pedal = read.nextBoolean();
                    Bike bicycle = new Bike(nPassengers, tripulation, nWheels, testDate, scrolling, pedal);
                    bicycles.add(bicycle);
                    break;
    /**
     * Representa el caso 5 para el atributo booleano del camion.
     */
                case 5:
                    System.out.println("Ingrese la altura en metros");
                    double height = read.nextDouble();
                    Truck truck = new Truck(nPassengers, tripulation, nWheels, testDate, scrolling, height);
                    trucks.add(truck);
                    break;
                default:
            }
        }

    /**
     * Representa varias sentencias de "if" para imprimir por consola los vehiculos creados.
     */
            if(!boats.isEmpty()){
                System.out.println("lista de lanchas:");
                    System.out.println(boats);
            }

            if(!cars.isEmpty()){
                System.out.println("lista de carros:");
                    System.out.println(cars);
            }

            if(!bicycles.isEmpty()){
                System.out.println("lista de bicicletas:");
                    System.out.println(bicycles);
            }

            if(!motorcycles.isEmpty()){
                System.out.println("lista de motos:");
                    System.out.println(motorcycles);
            }

            if(!trucks.isEmpty()){
                System.out.println("lista de camiones:");
                    System.out.println(trucks);
            }

        }catch (IllegalArgumentException exc){
            System.out.println("Error, no es posible crear el vehiculo" + exc);
        }catch (Exception exc){
            System.out.println("Error en el argumento ingresado, No es posible crear el vehiculo.\n" + exc);

        }
    }
}