package edu.northeastern.rahul;

public class Psychiatrist {
    public void examine(Moody object ) {
        object.queryMood();
        System.out.println( object.getMpod());
    }

    public void observe(Moody object) {
        object.expressFeelings();
        System.out.println(object.toString());
    }

    @Override
    public String toString() {
        return ("Subject laughs a lot");

    }
}
