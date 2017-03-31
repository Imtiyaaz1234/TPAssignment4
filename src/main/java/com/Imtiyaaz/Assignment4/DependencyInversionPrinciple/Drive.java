package com.Imtiyaaz.Assignment4.DependencyInversionPrinciple;

/**
 * Created by Imtiyaaz on 2017/03/31.
 */
public class Drive {
    Car car;



    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public String driveCar(){
        return car.ignition()+" "+car.drive();
    }
}
