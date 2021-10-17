package edu.northeastern.rahul;

public class Rectangle extends Shape{
    int width, height;

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    Rectangle(int side){
        this.width = side;
        this.height = side;
    }

    Rectangle ( String name, String color, int width, int height){
        this.name = name;
        this.color = color;
        this.width = width;
        this.height = height;
    }
    int getArea(){
        return width * height;
    }
    int getPerimeter(){

        return 2*(width + height);
    }

}
