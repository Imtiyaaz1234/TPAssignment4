package com.Imtiyaaz.Assignment4.InterfaceSegregationPrinciple;

/**
 * Created by Ameer on 2017/03/31.
 */
public abstract class Car implements Auto, Brakes, DriveInt {
    private String text;

    public String drive(){
        text = "car driving";
        return text;
    }

    public String brake(){
        text = "car braking";
        return text;
    }


    public String autoGearbox(){
        text = "car changing gear";
        return text;
    }

}
