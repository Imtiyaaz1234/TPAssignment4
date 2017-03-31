package com.Imtiyaaz.Assignment4.DependencyInversionPrinciple;

/**
 * Created by Imtiyaaz on 2017/03/31.
 */
public class Speed implements Car {
    private String status;
    private String start;


    public String drive(){
        status = "drives faster";
        return status;
    }


    public String ignition(){
        start = "engine start";
        return start;
    }
}
