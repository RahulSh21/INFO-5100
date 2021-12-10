package edu.northeastern.rahul;

public class InvatidDateException extends Exception {
    public int getAge() {
        return age;
    }

    int age;
    public InvatidDateException(int age) {
        this.age = age;
    }
}
