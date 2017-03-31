package com.Imtiyaaz.Assignment4.DependencyInversionPrinciple;

/**
 * Created by Imtiyaaz on 2017/03/31.
 */
public class RacerViolate {
    private CarViolate car;
    private RacerViolate racer;
    private FastCarViolate race;
    private String text = "";

    public String driveCar(){
        car = new CarViolate();
        text = car.ignition()+" "+car.drive();
        return text;
    }

    public String driveFastCar(){
        race = new FastCarViolate();
        text = "the "+race.ignition()+","+race.drive();
        return text;
    }

    public CarViolate getCar() {
        return car;
    }

    public void setCar(CarViolate car) {
        this.car = car;
    }

    public RacerViolate getFastCar() {
        return racer;
    }

    public void setFastCar(RacerViolate racer) {
        this.racer = racer;
    }
}
