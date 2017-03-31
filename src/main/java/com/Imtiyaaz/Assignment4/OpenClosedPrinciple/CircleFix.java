package com.Imtiyaaz.Assignment4.OpenClosedPrinciple;

/**
 * Created by Ameer on 2017/03/31.
 */
public class CircleFix {
    private double radius;

    public CircleFix(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }


    public double area() {
        return radius*radius*Math.PI;
    }
}
