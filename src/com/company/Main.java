package com.company;

public class Main {

    public static void main(String[] args) {

        Spacetransport SpaceX = new Spacetransport("SpaceX", "WT_Space2356",
                6000, 1100, Country.USA);

        Watertransport WaterA = new Watertransport( "WaterA", "L605", 2300,
                500, Country.Chine);

        System.out.println(SpaceX.getInfo());
        System.out.println("____________________________________");
        System.out.println(WaterA.getInfo());
        System.out.println("____________________________________");
        SpaceX.powerConsumption(2300);

    }
}
