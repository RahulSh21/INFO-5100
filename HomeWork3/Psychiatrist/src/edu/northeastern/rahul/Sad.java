package edu.northeastern.rahul;

public class Sad extends Moody{
    @Override
    protected String getMpod() {
        return "I feel Sad today";
    }

    @Override
    void expressFeelings() {
        System.out.println("'waah' 'boohoo' 'weep' 'sob'");
    }
    @Override
    public String toString(){
        return "Obervation : Subject cries a lot";
    }
}
