package edu.northeastern.rahul;

public class Happy extends Moody{

    @Override
    protected String getMpod() {
        return "I feel Happy today";
    }

    @Override
    void expressFeelings() {
        System.out.println("'heeehee....hahahah....HAHAHAHA!!'");
    }

    @Override
    public String toString(){
        return "Obervation : Subject laughs a lot";
    }
}
