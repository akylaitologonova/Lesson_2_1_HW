package com.company;

public final class Watertransport extends Transport {
    private String view;

    public Watertransport(String name, String model, int speed, int value, Country country, String view) {
        super(name, model, speed, value, country);
        this.view = view;
    }

    public Watertransport(String waterA, String l605, int speed, int value, Country chine) {
        super(waterA, l605, speed, value, chine);
    }

    public String getView() {
        return view;
    }

    @Override
    public String getInfo() {
        if (view == null) {
            return super.getInfo();
        } else {
            return super.getInfo() + "\nView: " + view;
        }
    }
}
