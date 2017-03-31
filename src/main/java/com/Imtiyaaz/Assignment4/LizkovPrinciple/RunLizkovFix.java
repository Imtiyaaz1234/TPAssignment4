package com.Imtiyaaz.Assignment4.LizkovPrinciple;

/**
 * Created by Ameer on 2017/03/31.
 */
public class RunLizkovFix {
    private static ReactangleFix getNewRectangle()
    {
        return new ReactangleFix();
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        ReactangleFix r = RunLizkovFix.getNewRectangle();
        r.setHeight(20);
        r.setWidth(40);
        System.out.println(r.getArea());
    }
}
