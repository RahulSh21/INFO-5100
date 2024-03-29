package edu.northeastern.rahul;

public class Main {

    public static void main(String[] args) {
        Context contextAdd = new Context(new AddOperation());
        System.out.println(contextAdd.execute(5, 15));
        Context contextSubtract = new Context(new SubtractOperation());
        System.out.println(contextSubtract.execute(50, 40));
        Context contextMultiply = new Context(new MultiplyOperation());
        System.out.println(contextMultiply.execute(4, 25));
    }
}
