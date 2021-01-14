package com.TTS;

import com.TTS.vehicle.Car;

public class Main {

    public static void main(String[] args) {
    Car sportsCar = new Car();
    sportsCar.color = "Red";
    sportsCar.numberOfDoors = 2;
    sportsCar.numWheels = 4;
    sportsCar.drive();
    sportsCar.start();
    sportsCar.stop();
        System.out.println(sportsCar);
    }
}
