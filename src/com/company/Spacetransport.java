package com.company;

public class Spacetransport extends Transport{
    public Spacetransport(String name, String model, int speed, int value, Country country) {
        super(name, model, speed, value, country);
    }



    public void powerConsumption (int power){
        System.out.println(power);
    }

    public final void powerConsumption (int power, String name){
        System.out.println(power);
    }



}
