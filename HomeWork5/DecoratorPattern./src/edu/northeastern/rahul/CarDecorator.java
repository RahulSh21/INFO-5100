package edu.northeastern.rahul;

public class CarDecorator implements ICar{

    protected BasicCar basicCar;
    //protected String carName;

    CarDecorator(BasicCar car){

        car.assemble();
    }

    @Override
    public void assemble(){

       // System.out.println( this.carName );
    }
}
