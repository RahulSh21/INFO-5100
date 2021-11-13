package edu.northeastern.rahul;

import java.util.Random;
public class CreateThread implements Runnable{
    @Override
    public void run() {

        Random element = new Random();

        while(true){

            int nums = element.nextInt(3);
            if(nums >= 1){

                Main.tLinkList.addAtPosition(0, element.nextInt(100));
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