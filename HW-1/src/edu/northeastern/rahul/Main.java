package edu.northeastern.rahul;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;

public class Main {

    public static void main(String[] args) {

        //Question 1
        int [] arr = {2,7,5,11,15};
        int target = 9;
        sumTotal(arr,target);

        //Question 2
        int [] array = {-4,-1,0,3,10};
        int[] result = squareArray(array);
        print(result); //calling for print function

        //Question 3
        int arr1[] = { 2,3,4,2,2,4,3,3,5,5,7 };
        int firstNonRepeating = findFirstNonRepeating( arr1 );
        System.out.println("Answer 3: " + firstNonRepeating);

        //Question 4
        boolean isRansomPossible = canWeConstructRansomNote("aaab", "aaz");
        System.out.println("Answer 4: " + isRansomPossible);

        //Question 5
        String str = "1A3d4s5t";
        boolean isCharFollowedByDigit = checkIfCharIsFollowedByDigit(str);
        System.out.println("Answer 5: " + isCharFollowedByDigit);

    }//End of main function

    //Question 1
    public static void sumTotal(int [] arr, int target){
        Arrays.sort(arr); // Sorting of array
        int start = 0;
        int end = arr.length - 1;
        while (start < end){
            if (arr[start] + arr[end] == target){
                System.out.println("Answer 1: Number is " + arr[start] + " & " + arr[end]);
                return;
            }
            else if (arr[start] + arr[end] < target){
                ++ start;
            } else {
                -- end;
            }//End of else statement
        }//End of while loop
    }//End sumTotal function --> End of Question 1

    //Question 2

    public static int[] squareArray(int[] array){
        int[] result = new int[ array.length];
        int start = 0;
        int end = array.length - 1;

        for (int i = array.length - 1; i >= 0; i--) {
            int square;
            if (Math.abs(result[start]) < Math.abs(result[end])) {
                square = array[end];
                end--;
            } else {
                square = array[start];
                start++;
            }
            result[i] = square * square;
        }
        return result;
    } //End of squareArray function

    private static void print( int [] result){
        System.out.println("Answer 2: Output is ");
        for (int i = 0 ; i < result.length ; i++) {
            System.out.print(" " + result[i]);
        }//End of for loop integer i
        System.out.println("");
    }//End of print Function --> End of Question 2

    //Question 3

    public static int findFirstNonRepeating(int[] array){
        if (array == null || array.length == 0){
            return Integer.MIN_VALUE;
        }
        HashSet<Integer> set = new HashSet<>();
        for (Integer i : array) {
            if(set.contains(i)){
                return i;
            } else {
                set.add(i);
            }
        }
        return Integer.MIN_VALUE;
    } //End of findFirstNonRepeating function --> End of Question 3


    // Question 4

    public static boolean canWeConstructRansomNote(String ransomNote, String magazine){
        if (magazine.length() < ransomNote.length()){
            return false;
        }
        HashMap<Character , Integer> hashMap = new HashMap<>();
        for ( Character ch : magazine.toCharArray() ) {
            if ( hashMap.containsKey(ch) ) {
                hashMap.put( ch , hashMap.get(ch).intValue() + 1 );
            } else {
                hashMap.put(ch , 1 );
            }
        } //End of For loop magazine
        for ( Character ch : ransomNote.toCharArray() ) {
            if ( hashMap.containsKey(ch) ) {
                hashMap.put( ch , hashMap.get(ch).intValue() - 1 );
                if ( hashMap.get(ch).intValue() < 0 ){
                    return false;
                }
            } else {
                return false;
            }
        } //End of For loop ransomNote
        return true;
    }//End canWeConstructRansomNote function --> End of Question 4

    //Question 5
    public static boolean checkIfCharIsFollowedByDigit(String str) {
        if (str == null || str.length() <= 1){
            return true;
        }
        boolean isDigit = Character.isDigit( str.charAt(0) );
        for ( int i = 1; i < str.length(); i++){
            if ( isDigit == Character.isDigit( str.charAt(i) ) ) {
                return false;
            } else {
                isDigit = !isDigit;
            }
        }
        return true;
    } //End of checkIfCharIsFollowedByDigit -> End of Question 5

} //End of class main
