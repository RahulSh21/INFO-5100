package edu.northeastern.rahul;

public class Sad extends Moody{
    @Override
    protected String getMood() {
        return "I feel Sad today";
    }

    @Override
     void expressFeelings() {
        System.out.println("'waah' 'boohoo' 'weep' 'sob'");
    }
    @Override
    public String toString(){
        return "Sad Person";
    }
    @Override
    public void queryMood() {
        System.out.println(getMood());
    }
}
