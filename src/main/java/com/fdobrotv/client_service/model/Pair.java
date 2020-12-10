package com.fdobrotv.client_service.model;

public class Pair {

    private Pair() {
    }

    public Pair(String name, double value) {
        this.name = name;
        this.value = value;
    }

    private String name;
    private double value;

    public static Pair of(String name, double value) {
        return new Pair(name, value);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }
}
