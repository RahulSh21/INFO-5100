package edu.northeastern.rahul;

public class Square extends Shape {
    int side;
    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }


    Square(int side){

        this.side = side;
    }
    Square(String name, String color, int side){
        this.name = name;
        this.color = color;
        this.side = side;
    }
    int getArea(){

        return side * side;
    }
    int getPerimeter(){

        return 4 * side;
    }
}
