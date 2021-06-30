package com.company;

public class Transport {
    private String name;
    private String model;
    private int speed;
    private int value;
    private Country country;

    public Transport(String name, String model, int speed, int value, Country country) {
        this.name = name;
        this.model = model;
        this.speed = speed;
        this.value = value;
        this.country = country;
    }

    public String getName() {
        return name;
    }

    public String getModel() {
        return model;
    }

    public int getSpeed() {
        return speed;
    }

    public int getValue() {
        return value;
    }

    public Country getCountry() {
        return country;
    }

    public String getInfo(){
        return "Name " + name + "\nModel: "   + model +
                "\nCountry: "  + country+
                "\nSpeed: " + speed + "км/ч" + "\nValue: " + value + "м3";
    }
}
