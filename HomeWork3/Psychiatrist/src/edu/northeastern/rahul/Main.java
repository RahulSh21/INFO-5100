package edu.northeastern.rahul;

public class Main {

    public static void main(String[] args) {
        Psychiatrist psychiatrist = new Psychiatrist();

        Moody moodyHappy = new Happy();
        Moody moodySad = new Sad();
        psychiatrist.examine( moodyHappy);
        psychiatrist.observe(moodyHappy);
        System.out.println();
        psychiatrist.examine( moodySad);
        psychiatrist.observe(moodySad);
    }
}
