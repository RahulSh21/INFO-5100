package edu.northeastern.rahul;

public abstract class Moody {
    protected abstract String getMpod();
    abstract void expressFeelings();

    public void queryMood() {
        System.out.println("How are you feeling today ? ");
    }
}
