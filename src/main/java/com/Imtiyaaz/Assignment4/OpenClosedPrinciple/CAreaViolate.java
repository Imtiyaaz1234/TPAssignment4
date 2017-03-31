package com.Imtiyaaz.Assignment4.OpenClosedPrinciple;

/**
 * Created by Ameer on 2017/03/31.
 */
public class CAreaViolate {
    public double area(String add){
        double area = 0;
        if(add.equalsIgnoreCase("rectangle"))
        {
            RectangleViolate r = new RectangleViolate(400,200);
            area = r.getHeight() * r.getWidth();
        }
        else
        {
            CircleViolate c = new CircleViolate(60);
            area = c.getRadius() * c.getRadius() * Math.PI;
        }

        return area;
    }
}
