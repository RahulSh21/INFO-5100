package edu.northeastern.rahul;

public class ReverseWordsInString {
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
