package edu.northeastern.rahul;

public class CarDecorator implements ICar{

    protected ICar basicCar;


    public CarDecorator(ICar basicCar){
           this.basicCar = basicCar;
    }

    @Override
    public void assemble(){
        this.basicCar.assemble();
    }
}
