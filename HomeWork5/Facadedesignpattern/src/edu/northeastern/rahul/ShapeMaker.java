package edu.northeastern.rahul;

public class ShapeMaker implements Shape{

    protected Shape circle;
    protected Shape rectangle;
    protected Shape square;
    @Override
    public void draw() {

    }

    ShapeMaker(){
        circle = new Circle();
        rectangle = new Rectangle();
        square = new Square();
    }
    public void drawCircle() {
        circle.draw();
    }
    public void drawRectangle() {
        rectangle.draw();
    }
    public void drawSquare() {
        square.draw();
    }

}
