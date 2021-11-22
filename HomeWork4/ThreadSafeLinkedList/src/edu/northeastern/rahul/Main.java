package edu.northeastern.rahul;

import java.util.Random;
public class Main {

    public static ThreadSafeLinkList<Integer> tLinkList;

    public static void main(String[] args) {

        tLinkList = new ThreadSafeLinkList<>();


        Thread[] threads = new Thread[5];

        for(int i = 0 ; i < threads.length; i ++) {
            threads[i] = new Thread( new CreateThread());
            threads[i].start();
        }
    }
}
