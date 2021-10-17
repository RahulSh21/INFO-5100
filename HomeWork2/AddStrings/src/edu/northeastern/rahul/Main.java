package edu.northeastern.rahul;

public class Main {

    public static void main(String[] args) {
        // Question 7 LeetCode: Add Strings
        //All function are define in different diffrent called AddStrings
        System.out.println("LeetCode Question 7 Output ");
        String num1 = "456" , num2 = "177";
        String resultaddstring = addString( num1, num2);
        System.out.println("Sum of two string " + resultaddstring);
    }

    public static String addString(String num1, String num2){
        String result = "";
        int carry = 0;
        //Checking which string is bigger in term of length
        if(num2.length() > num1.length()){
            String temp = num2;
            num2 = num1;
            num1 = temp;
        }
        num1 = new StringBuilder(num1).reverse().toString();
        num2 = new StringBuilder(num2).reverse().toString();
        for(int i = 0; i <= num1.length() - 1; i++){
            int a1 = 0, a2 = 0;
            if (i < num1.length()) {
                a1 = num1.charAt(i) - '0';
            }
            if (i < num2.length()) {
                a2 = num2.charAt(i) - '0';
            }
            int sum = a1 + a2 + carry;
            int digit = sum % 10;
            carry = sum / 10;
            result = digit + result;
        }
        if (carry != 0) {
            result = carry + result;
        }
        return result;
    }
}
