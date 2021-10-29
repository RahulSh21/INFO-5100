package edu.northeastern.rahul;

public class Main {

    public static void main(String[] args) {
        Psychiatrist p1 = new Psychiatrist();

        Moody m1 = new Happy();
        Moody m2 = new Sad();
        p1.examine( m1);
        p1.observe(m1);
        System.out.println();
        p1.examine( m2);
        p1.observe(m2);
    }
}
