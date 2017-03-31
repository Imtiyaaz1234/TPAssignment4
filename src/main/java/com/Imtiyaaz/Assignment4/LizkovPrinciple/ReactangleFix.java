package com.Imtiyaaz.Assignment4.LizkovPrinciple;

/**
 * Created by Ameer on 2017/03/31.
 */
public class ReactangleFix {
    private int width;
    private int height;

    public void setWidth(int width)
    {
        this.width = width;
    }

    public void setHeight(int height)
    {
        this.height = height;
    }

    public int getWidth()
    {
        return width;
    }

    public int getHeight()
    {
        return height;
    }

    public int getArea()
    {
        return width * height;
    }
}
