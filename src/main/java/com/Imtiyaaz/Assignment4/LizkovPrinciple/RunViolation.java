package com.Imtiyaaz.Assignment4.LizkovPrinciple;

/**
 * Created by Ameer on 2017/03/31.
 */
public class RunViolation {
    private static RectangleViolation getNewRectangle()
    {
        return new SquareViolation();
    }

    public static void main(String[] args) {
        RectangleViolation r = RunViolation.getNewRectangle();
        r.setHeight(5);
        r.setWidth(10);
        System.out.println(r.getArea());
    }
}
