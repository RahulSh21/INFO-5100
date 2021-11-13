package edu.northeastern.rahul;

public class Main {

    public static void main(String[] args) throws Exception {
	ThreadSafeLinkedList list = new ThreadSafeLinkedList();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        list.printLinklist();
        System.out.println("Link List size is " + list.size());
        System.out.println("last data is " + list.getLast());
        System.out.println("First data is " + list.getFirst());
        System.out.println();
        list.printLinklist();

        list.addAtPosition(2,8);

        list.removeAtPosition(3,8);
        //System.out.println(Exception);
    }
}
