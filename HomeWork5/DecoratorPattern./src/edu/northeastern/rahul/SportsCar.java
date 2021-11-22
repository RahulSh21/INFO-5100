package edu.northeastern.rahul;

public class SportsCar extends CarDecorator{

    public SportsCar(BasicCar car){
        super(car);
        //carName = this.carName + " Adding features of Sport Car. ";
        //System.out.println("In Sports Car");
        //System.out.print(" Adding features of Sport Car. ");
    }

    public void assemble(){
        this.basicCar.assemble();
        System.out.println( this.carName + " Adding features of Sport Car. ");
    }




}
