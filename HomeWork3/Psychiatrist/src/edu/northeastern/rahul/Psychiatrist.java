package edu.northeastern.rahul;

public class Psychiatrist {

    public void examine(Moody object ) {
        System.out.println("How are you feeling today?");
        object.queryMood();

    }

    public void observe(Moody object) {
        object.expressFeelings();
        if (object.toString().contains("Happy")) {
            System.out.println("Observation : Subject laughs a lot");
        } else {
            System.out.println("Observation : Subject cries a lot");
        }
    }
}
