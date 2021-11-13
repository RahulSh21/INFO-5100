package edu.northeastern.rahul;

import java.util.Random;
public class CreateThread implements Runnable{
    @Override
    public void run() {

        Random rand = new Random();

        while(true){

            int test = rand.nextInt(2);
            if(test >= 1){
                Main.tLinkList.addAtPosition(0, rand.nextInt(10));
            }else{
                Main.tLinkList.removeAtPosition(Main.tLinkList.size() -1);
            }

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }

    }
}