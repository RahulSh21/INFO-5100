package edu.northeastern.rahul;

public class ValidPalindrome {
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
