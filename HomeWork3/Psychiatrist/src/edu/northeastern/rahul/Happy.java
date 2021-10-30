package edu.northeastern.rahul;

public class Happy extends Moody{

    @Override
    protected String getMood() {
        return "I feel Happy today";
    }

    @Override
    void expressFeelings() {
        System.out.println("'heeehee....hahahah....HAHAHAHA!!'");
    }

    @Override
    public String toString(){
        return "Happy Person";
    }

    @Override
    public void queryMood() {
        System.out.println(getMood());
    }
}
