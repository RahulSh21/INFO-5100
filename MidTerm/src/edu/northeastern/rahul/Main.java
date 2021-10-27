package edu.northeastern.rahul;

import java.util.Arrays;
import java.util.HashSet;

public class Main {

    public static void main(String[] args) {

        //Question 1
        Fiction fiction = new Fiction("frankenstein",250.0, "1958");
        NonFiction nonFiction = new NonFiction("Anne Frank", 150.0, "1987");
        fiction.description();
        nonFiction.description();


        //Question 2
        Printer p1 = Printer.getInstance();
        p1.getConnection();

        //Question 3
        int[] arrays =  {1,3,-1,3,4,-1};
        sumOfRepeatedNumber(arrays);

        //Question 4
        String s = "abcabcbb";
        String subString = longestSubstringWithoutRepeating(s);
        System.out.println(subString);
    }

    public static void sumOfRepeatedNumber(int[] arrays){
         int sum = 0;
         Arrays.sort(arrays);
         for (int i = 0; i < arrays.length-1; i++) {
            if (arrays[i] == arrays[i + 1]) {
                sum = sum + arrays[i + 1];
                System.out.print(arrays[i] + " + ");
                i++;
            }
        }

        System.out.println(" = " + sum);
    }


    public static String longestSubstringWithoutRepeating(String s){
        if(s.length() <= 1){
            return s;
        }
        HashSet<Character> str = new HashSet<>();

        int start = 0;
        int maxLength = 0;
        String substring = "";

        for(int current = 0 ; current < s.length(); current ++){
            if( !str.contains(s.charAt(current))){
                str.add(s.charAt(current));
                if(maxLength <  current - start +1 ){
                    maxLength = current - start +1;
                    substring = s.substring(start, current+1);
                }
            }else{
                while( str.contains(s.charAt(current)) ) {
                    str.remove(s.charAt(start));
                    start ++;
                }
                str.add(s.charAt(current));
            }
        }
        return substring;
    }

}


