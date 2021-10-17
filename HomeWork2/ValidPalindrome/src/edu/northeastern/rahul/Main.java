package edu.northeastern.rahul;

public class Main {

    public static void main(String[] args) {
        // Question 8 LeetCode: Valid Palindrome
        //All function are define in different Function called ValidPalindrome
        System.out.println("LeetCode Question 8 ");
        String s1 = "A man, a plan, a canal: Panama ";
        boolean palindrome = isPalindrome(s1);
        System.out.println("Given String is Palindrome " + palindrome);
    }

    public static boolean isPalindrome(String s) {
        if(s==null ){
            return false;
        }

        s = s.toLowerCase();
        s = s.replaceAll("[^A-Za-z0-9]","");
        //checking Palindrome using two pointer
        int i=0;
        int j=s.length()-1;
        while(i < j){
            if(s.charAt(i) != s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
