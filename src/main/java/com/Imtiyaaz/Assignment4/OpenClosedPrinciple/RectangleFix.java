package com.Imtiyaaz.Assignment4.OpenClosedPrinciple;

/**
 * Created by Imtiyaaz on 2017/03/31.
 */
public class RectangleFix extends AreaPFix {
    private double width;
    private double height;

    public RectangleFix(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    @Override
    public double area(){
        return width*height;
    }
}
