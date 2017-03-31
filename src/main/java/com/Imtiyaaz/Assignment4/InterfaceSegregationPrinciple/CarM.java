package com.Imtiyaaz.Assignment4.InterfaceSegregationPrinciple;

/**
 * Created by Imtiyaaz on 2017/03/31.
 */
public abstract class CarM implements ManualInter, Brakes, DriveInt {
    private String text;


    public String drive(){
        text = "car driving";
        return text;
    }

    public String brake(){
        text = "car braking";
        return text;
    }


    public String manualGearbox(){
        text = "driver changing gear";
        return text;
    }

}
