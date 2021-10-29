package edu.northeastern.rahul;

public class Psychiatrist {
    public void examine(Moody object1 ) {
        object1.queryMood();
        System.out.println( object1.getMpod());
    }

    public void observe(Moody object1) {
        object1.expressFeelings();
        System.out.println(object1.toString());
    }

    @Override
    public String toString() {
        return "Subject laughs a lot";

    }
}
