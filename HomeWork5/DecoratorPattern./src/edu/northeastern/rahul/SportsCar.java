package edu.northeastern.rahul;

public class SportsCar extends CarDecorator{

    public SportsCar(ICar car){
        super(car);
    }

    public void assemble(){
        super.assemble();
        System.out.print(" Adding features of Sports Car. ");
    }




}
