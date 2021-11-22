package edu.northeastern.rahul;

public class BasicCar implements ICar {
    private String carName;

    //protected String carName = null ;
    BasicCar(){
        carName = "Basic Car.";
    }

    @Override
    public void assemble() {
        carName = "Basic Car.";
    }

}
