package edu.northeastern.rahul;

public class Main {

    public static void main(String[] args) {
        //ICar sportsCar = new SportsCar(new BasicCar());
            //BasicCar basicCar = new BasicCar();
            ICar sportsCar = new SportsCar(new BasicCar());
            sportsCar.assemble();

            System.out.println();

        //ICar sportsLuxuryCar = new SportsCar(new LuxuryCar(new BasicCar()));
            //sportsLuxuryCar.assemble();
        }
}
