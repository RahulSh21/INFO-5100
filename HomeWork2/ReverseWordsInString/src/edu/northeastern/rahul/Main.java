package edu.northeastern.rahul;

public class Main {

    public static void main(String[] args) {
        // Question 9 LeetCode: Reverse Words In a String
        //All function are define in different Function called ReverseWordsInString
        System.out.println("LeetCode Question 9 ");
        String s2 = " the sky is  blue  ";
        String result2 = reverseString(s2);
        System.out.println(s2 + "\n Reverse Words : " + result2);
    }

    public static String reverseString(String s){
        if(s == null){
            return null;
        }
        //triming spaces on both end
        s = s.trim();
        String result = "" , word = "";
        for (int i = 0; i < s.length(); i ++){
            //checking for spaces
            if (s.charAt(i) == ' '){
                //skiping if extra space is used
                while (s.charAt(i) == ' ') {
                    i++;
                }
                result = " " + word + result;
                word = "" + s.charAt(i);
            }
            else{
                word += s.charAt(i);
            }
        }//end of for loop
        result = word + result;
        return result;
    }
}
