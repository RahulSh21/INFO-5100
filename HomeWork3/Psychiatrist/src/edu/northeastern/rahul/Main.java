package edu.northeastern.rahul;

public class Main {

    public static void main(String[] args) {
        Psychiatrist p1 = new Psychiatrist();

        Moody moodyHappy = new Happy();
        Moody moodySad = new Sad();
        p1.examine( moodyHappy);
        p1.observe(moodyHappy);
        System.out.println();
        p1.examine( moodySad);
        p1.observe(moodySad);
    }
}
