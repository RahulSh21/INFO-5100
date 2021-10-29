package edu.northeastern.rahul;

public class SubtractOperation implements MathOperation{

    @Override
    public int performOperation(int num1, int num2) {
        if (num1 < num2){
            return num2 - num1;
        } else {
            return num1 - num2;
        }
    }

}
