package com.Imtiyaaz.Assignment4.LizkovPrinciple;

/**
 * Created by Ameer on 2017/03/31.
 */
public class SquareFix extends ReactangleFix {
    private int width;
    private int height;

    public void setWidth(int width)
    {
        this.width = width;
        this.height = width;
    }

    public void setHeight(int height)
    {
        this.height = height;
        this.width = height;
    }
}
