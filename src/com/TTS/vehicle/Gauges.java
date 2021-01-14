package com.TTS.vehicle;

public class Gauges {
    //properties
    private int currentRPM;
    private int speed;
    //getters and setters
    public int getCurrentRPM() {
        return currentRPM;
    }

    public void setCurrentRPM(int currentRPM) {
        this.currentRPM = currentRPM;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
   /* private int claculateRPM(int speed){
        int rpm = 0;

        rpm = speed * getBestGear(speed) * engineFactor();

        return rpm;


    }*/




}
