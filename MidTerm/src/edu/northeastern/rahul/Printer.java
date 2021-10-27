package edu.northeastern.rahul;

public class Printer {
    private static Printer _instance;

    private Printer(){}

    private static Object printer = new Object();
    public static Printer getInstance(){
        if(_instance == null){ // Double locking
            synchronized (printer){
                if( _instance == null){
                    _instance = new Printer();
                }
            }//First locking end
        }
        return _instance;
    }


    public void getConnection() {
        System.out.println("Your printer is working");
    }
}
