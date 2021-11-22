package edu.northeastern.rahul;

public class LuxuryCar extends CarDecorator {

    public LuxuryCar(BasicCar car) {
        super(car);
        //this.carName = this.carName + " Adding features of Luxury Car. ";
        //System.out.println("In Luxury Car");
        System.out.println(" Adding features of Luxury Car. ");
    }

    public void assemble(){

        System.out.println( this.carName + " Adding features of Luxury Car. ");
    }
}
