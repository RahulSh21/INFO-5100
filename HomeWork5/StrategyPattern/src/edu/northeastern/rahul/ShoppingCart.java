package edu.northeastern.rahul;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    List <Item> item;

    public ShoppingCart(){
        this.item = new ArrayList<Item>();
    }

    public void addItem(Item item){
        this.item.add(item);
    }

    public void removeItem(Item item){
        this.item.remove(item);
    }

    public int calculateTotal(){
        int totalItem = 0;
        for(Item item : item){
            totalItem += item.getPrice();
        }
        return totalItem;
    }

    public void pay(PaymentStrategy paymentStrategy){
        int amount = calculateTotal();
        paymentStrategy.pay(amount);
    }
}
