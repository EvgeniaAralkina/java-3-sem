package lab12;

import javax.swing.*;

public enum Planet {
    MERCURY(2439.7d, 3.3d * Math.pow(10, 23), "Меркурий"),
    VENUS(6051.8d, 4.87d * Math.pow(10, 24), "Венера"),
    EARTH(6400d, 5.974d * Math.pow(10, 24),"Земля"),
    MARS(3397d, 6.419d * Math.pow(10, 23),"Марс"),
    JUPITER(71490d, 1.899d * Math.pow(10, 27),"Юпитер"),
    SATURN(60270d, 5.685d * Math.pow(10, 26),"Сатурн"),
    URANUS(25560d, 8.685d * Math.pow(10, 25),"Уран"),
    NEPTUNE(8.685d, 1.024d * Math.pow(10, 26),"Нептун");
    private double m, r;
    private String name;

    Planet(double r, double m, String name) {
        this.m = m;
        this.r = r;
        this.name = name;
    }

    public double getM() {
        return m;
    }

    public double getR() {
        return r;
    }

    public String getName() {
        return name;
    }
}
