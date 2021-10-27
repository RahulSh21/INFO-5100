package edu.northeastern.rahul;

public class Reference extends Book{

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    private String category;

    Reference(String title, double price, String publishYear, String category){
        super(title, price, publishYear);
        this.category = category;
    }


    @Override
    public String description() {
        return " all information is real.";
    }



}
