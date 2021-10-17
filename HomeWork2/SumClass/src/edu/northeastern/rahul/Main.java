package edu.northeastern.rahul;

public class Main {

    public static void main(String[] args) {
        //Question 2 Sum class
        System.out.println("Question 2 Output ");
        SumString sum = new SumString();
        System.out.println(sum.add(2,3));
        System.out.println(sum.add(4,9,12));
        System.out.println(sum.add(4,5.0));
        System.out.println(sum.add(15.5,5));
        System.out.println(sum.add(1.0,6.4));
    }
}
