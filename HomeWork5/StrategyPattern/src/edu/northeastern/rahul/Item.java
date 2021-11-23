package edu.northeastern.rahul;

public class Item {
    private String id;
    public int price;

    public Item(String id, int price){
        this.id = id;
        this.price = price;
    }

    public String getId(){
        return id;
    }

    public int getPrice(){
        return price;
    }
}
