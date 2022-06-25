package com.company;

public class Circle {
    private double PI;

    public Circle(double PI) {
        this.PI = PI;
    }

    public double getPI() {
        return PI;
    }

    public void setPI(double PI) {
        this.PI = PI;
    }

    public static void area(double PI, double radius) {
        System.out.println("area: " + PI * (radius * radius));
    }

    public static void circumference(double PI, double radius) {
        System.out.println("circumference: " + PI * 2 * radius);
    }
}

