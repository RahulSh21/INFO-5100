package edu.northeastern.rahul;

public class Shape {

   String name, color;
   int area, perimeter;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public void setPerimeter(int perimeter) {
        this.perimeter = perimeter;
    }
    Shape(){

    }

    Shape(String name, String color){
        this.name = name;
        this.color = color;
    }

    Shape(String name, String color, int perimeter, int area){
        this.name = name;
        this.color = color;
        this.area = area;
        this.perimeter = perimeter;
    }

    String printShape(){
        String s = "The colour of Shape is " + color;
        return s;
    }

    int getArea(){
        return area;
    }

    int getPerimeter() {
        return perimeter;
    }
}
